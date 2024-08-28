package fr.cnam.chatnoir76.creaturedecombat.modelcore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cnam.chatnoir76.creaturedecombat.model.Action;
import fr.cnam.chatnoir76.creaturedecombat.modelcore.mapper.JeuMapper;
import fr.cnam.chatnoir76.creaturedecombat.ui.service.SalleBeanSession;

@Service
public class CoreService {

	@Autowired
	SalleBeanSession salle;
	
	@Autowired
	JeuMapper jeuMapper;
	
	public void initialisation() {
		
		Action jeu1 = jeuMapper.toCore(salle.getJeu1());
		
//		jeu1.attaquer();
//		
//		jeu1.abandonner();
		
		
	}
	
}
