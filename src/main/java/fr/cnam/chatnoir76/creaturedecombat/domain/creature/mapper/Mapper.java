package fr.cnam.chatnoir76.creaturedecombat.domain.creature.mapper;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.AttaqueDto;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CreatureDto;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Attaque;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Creature;

public class Mapper {

	public final static CreatureDto toDTO(Creature creature) {
		CreatureDto cc = new CreatureDto();
		cc.setNom(creature.getNom());
		cc.setDescription(creature.getDescription());
		cc.setCategorie(creature.getCategorie().getLiteral());
		cc.setNiveau(creature.getNiveau().getLiteral());
		cc.setPv(creature.getPv());
		cc.setPvInit(creature.getPvInit());
		cc.setImage("img/1.png");
		creature.getAttaques().forEach(a -> {
			cc.getAttaques().add(Mapper.toDTO(a));
		});
		
		return cc;
	}
	
	public final static AttaqueDto toDTO(Attaque attaque) {
		AttaqueDto att = new AttaqueDto();
		att.setNom(attaque.getNom());
		att.setDescription(attaque.getDescription());
		att.setEnergiePrimaire(attaque.getBesoinEnergieCategorie());
		att.setEnergieSecondaire(attaque.getBesoinEnergieAutre());
		return att;
	}
	
}
