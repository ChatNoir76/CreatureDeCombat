package fr.cnam.chatnoir76.creaturedecombat.ui;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.dto.AttaqueDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.service.AttaqueService;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CarteCreatureDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.service.CreatureService;

@RestController
public class HelloWorldController {

	@Autowired
	EntityLinks el;
	
	@Autowired
	CreatureService creatureService;
	
	@Autowired
	AttaqueService attaqueService;
	
	@GetMapping("/")
	public ModelAndView index() {
		CarteCreatureDTO c = creatureService.getById(1);
		List<AttaqueDTO> AttaquesDTO = attaqueService.getByCreature(c);
		return new ModelAndView("index", Map.of("creature", c, "attaques", AttaquesDTO));
	}
	
//	@GetMapping("/jeu")
//	public ModelAndView creationJeu() {
//		
//		Utilisateur joueur1 = ModelFactory.eINSTANCE.createUtilisateur();
//		joueur1.setNom("Joueur 1");
//		
//		Utilisateur joueur2 = ModelFactory.eINSTANCE.createUtilisateur();
//		joueur2.setNom("Joueur 2");
//		
////		Salle salle = ModelFactory.eINSTANCE.create
//		CarteCreatureDTO c = creatureService.findById(1).get();
//		return new ModelAndView("index", "creature", c);
//	}
}
