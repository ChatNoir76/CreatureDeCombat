package fr.cnam.chatnoir76.creaturedecombat.ui;

import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.service.AttaqueService;
import fr.cnam.chatnoir76.creaturedecombat.domain.carte.dto.CarteDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CarteCreatureDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CarteCreatureDTOFull;
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
	
	private Predicate<CarteDTO> estCreature = carte -> carte instanceof CarteCreatureDTO;
	
	private Predicate<CarteDTO> estCreatureBase = carte -> ((CarteCreatureDTO) carte).getNiveau().equals("Base");
	
	@GetMapping("/init")
	public SalleBeanSession initialisation() {
		
		core.initialisation();
		
		findCreatureToBanc();
		
		return salle;
	}
	
	@GetMapping("/banc/{creatureId}")
	public SalleBeanSession ajoutCreatureBaseBanc(@PathVariable("creatureId") String creatureId) {
		
		core.ajoutBaseSurBanc(creatureId);
		
//		CarteCreatureDTOFull creature = (CarteCreatureDTOFull) salle.getJeu1().getMain().stream()
//										.filter(estCreature)
//										.filter(estCreatureBase)
//										.filter(carte -> carte.getId().equals(creatureId))
//										.findFirst().get();
//		
//		salle.getJeu1().getMain().remove(creature);
//		salle.getJeu1().getBanc().add(creature);
		
		findCreatureToBanc();
		
		return salle;
	}
	
	private void findCreatureToBanc() {
		salle.removeLinks();
		salle.getJeu1().getMain().stream()
		.filter(estCreature)
		.filter(estCreatureBase)
		.forEach(carte -> {
			salle.add(hateoas.getRelLink(
					JeuController.class, 
					"ajoutCreatureBaseBanc",  
					carte.getId(),
					"Ajouter sur le banc %s".formatted(carte.getId()))
					);
		});
		
	}
	
}
