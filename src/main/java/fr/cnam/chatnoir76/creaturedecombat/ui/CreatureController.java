package fr.cnam.chatnoir76.creaturedecombat.ui;

import java.security.Principal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.dto.AttaqueDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.service.AttaqueService;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CarteCreatureDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.service.CreatureService;
import fr.cnam.chatnoir76.creaturedecombat.domain.degat.dto.DegatDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.degat.service.DegatService;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dto.CategorieDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dto.NiveauDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.service.EnumerationService;
import fr.cnam.chatnoir76.creaturedecombat.ui.forms.CreatureCreateForm;
import fr.cnam.chatnoir76.creaturedecombat.ui.service.ApplicationFactory;
import fr.cnam.chatnoir76.creaturedecombat.ui.service.CreatureDeCombat;
import fr.cnam.chatnoir76.creaturedecombat.ui.service.HateoasService;
import jakarta.validation.Valid;

@Controller
@RequestMapping(value = "/creatures")
public class CreatureController {

	@Autowired
	HateoasService hateoas;
	
	@Autowired
	CreatureService creatureService;
	
	@Autowired
	AttaqueService attaqueService;
	
	@Autowired
	EnumerationService<CategorieDTO> categorieService;
	
	@Autowired
	EnumerationService<NiveauDTO> niveauService;
	
	@Autowired
	DegatService degatService;
	
	@GetMapping(value = "")
	public ModelAndView getAllCreature() {
		List<CarteCreatureDTO> creatures = creatureService.getAll();
		creatures.forEach(creature -> {
			creature.add(hateoas.getSelfLink(
					CreatureController.class, 
					"getCreatureById",  
					creature.getId()));
		});
		CreatureDeCombat cdc = ApplicationFactory.getAppDTO();
		cdc.add(hateoas.getRelLink(
				CreatureController.class, 
				"createCarteCreature",  
				"Créer une créature")
				);
		return new ModelAndView("creature/list", Map.of("creatures", creatures, "app", cdc));
	}
	
	@GetMapping("/create")
	public ModelAndView createCarteCreature() {
		CreatureCreateForm cf = ApplicationFactory.getCreatureCreateForm();
		ModelAndView mv = new ModelAndView("creature/createForm", Map.of("formAction","/creatures/create", "createCreatureForm", cf, "categories", categorieService.getAll(), "attaques", attaqueService.getAll(), "niveaux", niveauService.getAll(), "creatures", creatureService.getAll()));
		return mv;
	}
	
	@PostMapping("/create")
	public String createCarteCreatureProcessForm(
			@Valid @ModelAttribute("createCreatureForm") CreatureCreateForm creatureForm,
			BindingResult bindingResult,
            Model model,
            Principal principal) {
		 if (bindingResult.hasErrors()) {
			 model.addAttribute("formAction", "/creatures/create");
			model.addAttribute("categories", categorieService.getAll());
			model.addAttribute("attaques", attaqueService.getAll());
			model.addAttribute("niveaux", niveauService.getAll());
			model.addAttribute("creatures", creatureService.getAll());
            return "creature/createForm";
        } else {
        	CarteCreatureDTO dto = new CarteCreatureDTO();
        	dto.setCategorieId(creatureForm.getCategorieId());
        	dto.setDescription(creatureForm.getDescription());
        	dto.setImage(creatureForm.getImage());
        	dto.setNom(creatureForm.getNom());
        	dto.setPvInit(creatureForm.getPv());
        	dto.setNiveauId(creatureForm.getNiveauId());
        	dto.setIdCreatureBase(creatureForm.getCreatureBaseId());
        	dto.setAttaqueIds(creatureForm.getAttaques());
        	dto = creatureService.save(dto);
        	return "redirect:/creatures/" + dto.getId();
        }
	
	}
	
	@GetMapping(value = "/{creatureId}")
	public ModelAndView getCreatureById(@PathVariable("creatureId") String creatureId) {
		CarteCreatureDTO creature = creatureService.getById(creatureId);
		creature.add(hateoas.getRelLink(
				CreatureController.class, 
				"getAttaqueForCreature",  
				creature.getId(),
				"Voir les attaques")
				);
		creature.add(hateoas.getRelLink(
				CreatureController.class, 
				"updateCarteCreature",  
				creature.getId(),
				"Modifier la créature")
				);
		creature.add(hateoas.getRelLink(
				CreatureController.class, 
				"deleteCarteCreature",  
				creature.getId(),
				"Supprimer la créature")
				);
		if(creature.getIdCreatureBase()!=null) {
			creature.add(hateoas.getRelLink(
					CreatureController.class, 
					"getCreatureById",  
					creature.getIdCreatureBase(),
					"Voir la créature de base")
					);
		}
		
		List<AttaqueDTO> attaquesDTO = attaqueService.getByCreature(creature);
		return new ModelAndView("creature/view", Map.of("creature", creature, "attaques", attaquesDTO));
	}
	
	@GetMapping("/{creatureId}/update")
	public ModelAndView updateCarteCreature(@PathVariable("creatureId") String creatureId) {
		CarteCreatureDTO creature = creatureService.getById(creatureId);
		CreatureCreateForm cf = ApplicationFactory.getCreatureCreateForm(creature);
		List<AttaqueDTO> currentAttaque = creature.getAttaqueIds().stream().map(id -> attaqueService.getById(String.valueOf(id))).toList();
		ModelAndView mv = new ModelAndView("creature/createForm", Map.of("formAction","/creatures/update", "createCreatureForm", cf, "categories", categorieService.getAll(), "attaques", attaqueService.getAll(), "niveaux", niveauService.getAll(), "creatures", creatureService.getAll(), "currentAttaques", currentAttaque));
		return mv;
	}
	
	@GetMapping("/{creatureId}/delete")
	public String deleteCarteCreature(@PathVariable("creatureId") String creatureId) {
		CarteCreatureDTO creature = creatureService.getById(creatureId);
		if(creatureService.delete(creature)) {
			return "redirect:/creatures";
		} else {
			return "ERROR";
		}
	}
	
	@PutMapping("/update")
	public String updateCarteCreatureProcessForm(
			@Valid @ModelAttribute("createCreatureForm") CreatureCreateForm creatureForm,
			BindingResult bindingResult,
            Model model,
            Principal principal) {
		 if (bindingResult.hasErrors()) {
			 model.addAttribute("formAction", "/creatures/create");
			model.addAttribute("categories", categorieService.getAll());
			model.addAttribute("attaques", attaqueService.getAll());
			model.addAttribute("niveaux", niveauService.getAll());
			model.addAttribute("creatures", creatureService.getAll());
            return "creature/createForm";
        } else {
        	CarteCreatureDTO dto = new CarteCreatureDTO();
        	dto.setCategorieId(creatureForm.getCategorieId());
        	dto.setDescription(creatureForm.getDescription());
        	dto.setImage(creatureForm.getImage());
        	dto.setNom(creatureForm.getNom());
        	dto.setPvInit(creatureForm.getPv());
        	dto.setNiveauId(creatureForm.getNiveauId());
        	dto.setIdCreatureBase(creatureForm.getCreatureBaseId());
        	dto.setAttaqueIds(creatureForm.getAttaques());
        	dto.setId(creatureForm.getId());
        	dto = creatureService.update(dto);
        	return "redirect:/creatures/" + dto.getId();
        }
	
	}
	
	@GetMapping(value = "/{creatureId}/attaques")
	@ResponseBody
	public List<AttaqueDTO> getAttaqueForCreature(@PathVariable("creatureId") final String creatureId) {
		List<AttaqueDTO> attaques = attaqueService.getByCreatureId(creatureId);
		attaques.forEach(attaque -> {
			DegatDTO degat = degatService.getByAttaque(attaque);
			attaque.add(hateoas.getRelLink(
					DegatController.class, 
					"getDegatById",  
					degat.getId(),
					"degat%s".formatted(degat.getId()))
					);
		});
		return attaques;
	}
	
}
