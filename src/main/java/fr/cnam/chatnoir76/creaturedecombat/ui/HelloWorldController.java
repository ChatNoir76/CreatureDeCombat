package fr.cnam.chatnoir76.creaturedecombat.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CarteCreatureDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.mapper.Mapper;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.service.CreatureService;
import fr.cnam.chatnoir76.creaturedecombat.domain.utilisateur.model.ModelFactory;
import fr.cnam.chatnoir76.creaturedecombat.domain.utilisateur.model.Utilisateur;
import fr.cnam.chatnoir76.creaturedecombat.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.provider.CreatureProvider;

@RestController
public class HelloWorldController {

	@Autowired
	EntityLinks el;
	
	@Autowired
	CreatureProvider provider;
	
	@Autowired
	CreatureService creatureService;
	
	@GetMapping("/")
	public ModelAndView index() {
		Creature c = provider.getWorms();
		return new ModelAndView("index", "creature", Mapper.toDTO(c));
	}
	
	@GetMapping("/jeu")
	public ModelAndView creationJeu() {
		
		Utilisateur joueur1 = ModelFactory.eINSTANCE.createUtilisateur();
		joueur1.setNom("Joueur 1");
		
		Utilisateur joueur2 = ModelFactory.eINSTANCE.createUtilisateur();
		joueur2.setNom("Joueur 2");
		
//		Salle salle = ModelFactory.eINSTANCE.create
		CarteCreatureDTO c = creatureService.findById(1).get();
		return new ModelAndView("index", "creature", c);
	}
}
