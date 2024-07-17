package fr.cnam.chatnoir76.creaturedecombat.domain.creature.mapper;

import fr.cnam.chatnoir76.creaturedecombat.domain.carte.dto.CarteDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CreatureDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.degat.dto.DegatDTO;
import fr.cnam.chatnoir76.creaturedecombat.model.Carte;
import fr.cnam.chatnoir76.creaturedecombat.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.model.Degat;

public class Mapper {
	
	public final static CarteDTO toDTO(Carte carte) {
		return null;
	}

	public final static CreatureDTO toDTO(Creature creature) {
		CreatureDTO cc = new CreatureDTO();
		cc.setNom(creature.getNom());
		cc.setDescription(creature.getDescription());
		cc.setCategorie(creature.getCategorie().getLiteral());
		cc.setNiveau(creature.getNiveau().getLiteral());
		cc.setPv(creature.getPv());
		cc.setPvInit(creature.getPvInit());
		cc.setImage("img/1.jfif");
//		creature.getAttaques().forEach(a -> {
//			cc.getAttaques().add(Mapper.toDTO(a));
//		});
		
		return cc;
	}
	
	public final static DegatDTO toDTO(Degat degat) {
		DegatDTO deg = new DegatDTO();
		deg.setDegat(degat.getDegat());
		deg.setMode(degat.getModeCalcul().getLiteral());
		deg.setPrecision(degat.getIncertitude());
		deg.setRattage(degat.getChanceRattage());
		deg.setType(degat.getType().getLiteral());
		return deg;
	}
	
}
