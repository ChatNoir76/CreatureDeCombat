package fr.cnam.chatnoir76.creaturedecombat.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.service.AttaqueService;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.service.CreatureService;
import fr.cnam.chatnoir76.creaturedecombat.domain.degat.service.DegatService;
import fr.cnam.chatnoir76.creaturedecombat.modelcore.service.CoreService;
import fr.cnam.chatnoir76.creaturedecombat.ui.service.HateoasService;
import fr.cnam.chatnoir76.creaturedecombat.ui.service.SalleBeanSession;

@RestController
@RequestMapping(value = "/jeu")
public class JeuController {

	@Autowired
	HateoasService hateoas;
	
	@Autowired
	CreatureService creatureService;
	
	@Autowired
	AttaqueService attaqueService;
	
	@Autowired
	DegatService degatService;
	
	@Autowired
	SalleBeanSession salle;
	
	@Autowired
	CoreService core;
	
	@GetMapping("/init")
	public SalleBeanSession initialisation() {
		
		core.initialisation();
		
		
//		CreatureDeCombat cdc = new CreatureDeCombat();
//		ModelAndView mv = new ModelAndView("index", "root", cdc);
//		hateoas.linkWithModelAndView(mv, "self", cdc, hateoas.getSelfLink(ApplicationController.class,"index"));
//		hateoas.linkWithModelAndView(mv, "creatures", cdc, hateoas.getRelLink(CreatureController.class,"getAllCreature","creatures"));
//		hateoas.linkWithModelAndView(mv, "attaques", cdc, hateoas.getRelLink(AttaqueController.class,"getAllAttaque","attaques"));
//		hateoas.linkWithModelAndView(mv, "degats", cdc, hateoas.getRelLink(DegatController.class,"getAllDegat","degats"));
//		hateoas.linkWithModelAndView(mv, "jeux", cdc, hateoas.getRelLink(JeuController.class,"initialisation","jeux"));
		return salle;
	}
	
}
