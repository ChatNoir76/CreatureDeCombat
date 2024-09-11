package fr.cnam.chatnoir76.creaturedecombat.modelcore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cnam.chatnoir76.creaturedecombat.model.Action;
import fr.cnam.chatnoir76.creaturedecombat.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.model.Jeu;
import fr.cnam.chatnoir76.creaturedecombat.modelcore.mapper.JeuMapper;
import fr.cnam.chatnoir76.creaturedecombat.modelcore.rule.engine.InitialisationRuleEngine;
import fr.cnam.chatnoir76.creaturedecombat.ui.service.SalleBeanSession;

@Service
public class CoreService {

	@Autowired
	SalleBeanSession salle;
	
	@Autowired
	InitialisationRuleEngine initEngine;
	
	@Autowired
	JeuMapper jeuMapper;
	
	public void ajoutBaseSurBanc(String id) {
		Action jeu1 = jeuMapper.toCore(salle.getJeu1());
		Jeu jeu = (Jeu) jeu1;
		
		Creature base = (Creature) jeu.getMain().stream()
				.filter(carte -> (carte instanceof Creature) && ((Creature) carte).getId() == Integer.valueOf(id))
				.findFirst().get();
		jeu.getBanc().add(base);
		jeu.getMain().remove(base);
		
		salle.setJeu1(jeuMapper.toDTO(jeu));
	}
	
	public void initialisation() {		
		Action jeu1 = jeuMapper.toCore(salle.getJeu1());
		Action jeu2 = jeuMapper.toCore(salle.getJeu2());
		
		while(!initEngine.matches((Jeu) jeu1)) {
			jeu1.ajoutCarteMain(jeu1.piocher());
		}
		
		salle.setJeu1(jeuMapper.toDTO((Jeu) jeu1));
		
		while(!initEngine.matches((Jeu) jeu2)) {
			jeu2.ajoutCarteMain(jeu2.piocher());
		}
		
		salle.setJeu2(jeuMapper.toDTO((Jeu) jeu2));
		
	}
	
}
