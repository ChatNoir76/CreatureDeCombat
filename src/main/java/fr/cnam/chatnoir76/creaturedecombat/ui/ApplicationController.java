package fr.cnam.chatnoir76.creaturedecombat.ui;

import java.security.Principal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fr.cnam.chatnoir76.creaturedecombat.domain.carte.service.CarteService;
import fr.cnam.chatnoir76.creaturedecombat.domain.common.FullDTOFactory;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CarteCreatureDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.service.CreatureService;
import fr.cnam.chatnoir76.creaturedecombat.domain.deck.dto.DeckDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.deck.service.DeckService;
import fr.cnam.chatnoir76.creaturedecombat.domain.deckcarte.service.DeckCarteService;
import fr.cnam.chatnoir76.creaturedecombat.domain.jeu.dto.JeuDTO;
import fr.cnam.chatnoir76.creaturedecombat.ui.forms.Joueur;
import fr.cnam.chatnoir76.creaturedecombat.ui.service.ApplicationFactory;
import fr.cnam.chatnoir76.creaturedecombat.ui.service.CreatureDeCombat;
import fr.cnam.chatnoir76.creaturedecombat.ui.service.HateoasService;
import fr.cnam.chatnoir76.creaturedecombat.ui.service.SalleBeanSession;
import jakarta.validation.Valid;

@Controller
public class ApplicationController {
	
	@Autowired
	HateoasService hateoas;
	
	@Autowired
	DeckService deckService;
	
	@Autowired
	CarteService carteService;
	
	@Autowired
	DeckCarteService dcService;
	
	@Autowired
	FullDTOFactory factory;
	
	@Autowired
	CreatureService creatureService;
	
	@Autowired
	@Lazy
	SalleBeanSession salle;
	
	@GetMapping("/")
	public ModelAndView index() {
		CreatureDeCombat cdc = ApplicationFactory.getAppDTO();
		ModelAndView mv = new ModelAndView("index", "root", cdc);
		hateoas.linkWithModelAndView(mv, "self", cdc, hateoas.getSelfLink(ApplicationController.class,"index"));
		hateoas.linkWithModelAndView(mv, "creatures", cdc, hateoas.getRelLink(CreatureController.class,"getAllCreature","creatures"));
		hateoas.linkWithModelAndView(mv, "attaques", cdc, hateoas.getRelLink(AttaqueController.class,"getAllAttaque","attaques"));
		hateoas.linkWithModelAndView(mv, "degats", cdc, hateoas.getRelLink(DegatController.class,"getAllDegat","degats"));
		hateoas.linkWithModelAndView(mv, "jeux", cdc, hateoas.getRelLink(ApplicationController.class,"initialisation","jeux"));
		return mv;
	}
	
	@GetMapping("/search")
    public ModelAndView search(@RequestParam("query") String query) {
        List<CarteCreatureDTO> results = creatureService.getAll().stream().filter(c -> {
											if(c.getNom().contains(query)) return true;
											if(c.getDescription().contains(query)) return true;
											if(c.getId().contains(query)) return true;
											return false;
										}).toList();
        CreatureDeCombat cdc = ApplicationFactory.getAppDTO();
        cdc.add(hateoas.getRelLink(
				CreatureController.class, 
				"getAllCreature",  
				"Voir la liste complète des créatures")
				);
        
        return new ModelAndView("creature/list", Map.of("creatures", results, "app", cdc));
    }
	
	@GetMapping("/init")
	public ModelAndView initialisation() {
		ModelAndView mv = new ModelAndView("form", Map.of("initForm", ApplicationFactory.getJoueurDTO(), "decks", deckService.getAll()));
		return mv;
	}
	
	@PostMapping("validation")
	public String validation(
			@Valid @ModelAttribute("initForm") Joueur initForm,
			BindingResult bindingResult,
            Model model,
            Principal principal) {
		 if (bindingResult.hasErrors()) {
			 model.addAttribute("decks", deckService.getAll());
            return "form";
        } else {     	
        	DeckDTO deck1 = deckService.getById(String.valueOf(initForm.getDeckId1()));
        	DeckDTO deck2 = deckService.getById(String.valueOf(initForm.getDeckId2()));
        	salle.setJeu1(new JeuDTO(initForm.getPseudo1(), factory.createDeckDTOFull(deck1)));
        	salle.setJeu2(new JeuDTO(initForm.getPseudo2(), factory.createDeckDTOFull(deck2)));
            return "redirect:/jeu/init";
        }
	
	}
	
}
