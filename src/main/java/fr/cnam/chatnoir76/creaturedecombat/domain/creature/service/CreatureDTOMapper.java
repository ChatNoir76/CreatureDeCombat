package fr.cnam.chatnoir76.creaturedecombat.domain.creature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dao.CreatureDAO;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CreatureDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.entity.CreatureEntity;
import fr.cnam.chatnoir76.creaturedecombat.model.Categorie;
import fr.cnam.chatnoir76.creaturedecombat.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.model.Niveau;

@Service
public class CreatureDTOMapper {

	@Autowired
	CreatureDAO creatureDAO;
	
	public static final CreatureDTO toDTO(CreatureEntity creatureJpa) {
		CreatureDTO cc = new CreatureDTO();
		cc.setNom(creatureJpa.getNom());
		cc.setDescription(creatureJpa.getDescription());
		cc.setCategorie(Categorie.MAJESTUEUX.getLiteral());
		cc.setNiveau(Niveau.BASE.getLiteral());
		cc.setPv(creatureJpa.getPv());
		cc.setPvInit(creatureJpa.getPv());
		cc.setImage("img/1.jfif");
		return cc;
	}
	
	public static final CreatureDTO toDTO(Creature creature) {
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
	
	public static final CreatureEntity toEntity(CreatureDTO creatureDTO) {
		return new CreatureEntity(creatureDTO.getId(), creatureDTO.getNom(), creatureDTO.getDescription(), creatureDTO.getImage(), creatureDTO.getPv());
	}
	
}
