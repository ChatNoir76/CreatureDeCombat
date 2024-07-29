package fr.cnam.chatnoir76.creaturedecombat.ui;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.dto.AttaqueDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.service.AttaqueService;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CarteCreatureDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.service.CreatureService;
import fr.cnam.chatnoir76.creaturedecombat.domain.degat.dto.DegatDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.degat.service.DegatService;
import fr.cnam.chatnoir76.creaturedecombat.ui.service.HateoasService;

@RestController
@RequestMapping(value = "/creatures")
public class CreatureController {

	@Autowired
	HateoasService hateoas;
	
	@Autowired
	CreatureService creatureService;
	
	@Autowired
	AttaqueService attaqueService;
	
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
		return new ModelAndView("creature/list", "creatures", creatures);
	}
	
	@GetMapping(value = "/{creatureId}")
	public ModelAndView getCreatureById(@PathVariable("creatureId") String creatureId) {
		CarteCreatureDTO creature = creatureService.getById(creatureId);
		creature.add(hateoas.getRelLink(
				CreatureController.class, 
				"getAttaqueForCreature",  
				creature.getId(),
				"attaques")
				);
		if(creature.getIdCreatureBase()!=null) {
			creature.add(hateoas.getRelLink(
					CreatureController.class, 
					"getCreatureById",  
					creature.getIdCreatureBase(),
					"créature de base")
					);
		}
		
		List<AttaqueDTO> attaquesDTO = attaqueService.getByCreature(creature);
		return new ModelAndView("creature/view", Map.of("creature", creature, "attaques", attaquesDTO));
	}
	
	@GetMapping(value = "/{creatureId}/attaques")
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
