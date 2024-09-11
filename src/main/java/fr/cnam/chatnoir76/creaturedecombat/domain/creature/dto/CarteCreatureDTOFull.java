package fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto;

import java.util.List;

import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.dto.AttaqueDTOFull;
import fr.cnam.chatnoir76.creaturedecombat.domain.degat.dto.DegatDTO;

public class CarteCreatureDTOFull extends CarteCreatureDTO {

	private CarteCreatureDTOFull creatureBase;
	private List<AttaqueDTOFull> attaques;
	private DegatDTO degatDefense;
	
	public CarteCreatureDTOFull(CarteCreatureDTO creature) {
		this.setCategorie(creature.getCategorie());
		this.setCategorieId(creature.getCategorieId());
		this.setDescription(creature.getDescription());
		this.setId(creature.getId());
		this.setIdCreatureBase(creature.getIdCreatureBase());
		this.setImage(creature.getImage());
		this.setNiveau(creature.getNiveau());
		this.setNiveauId(creature.getNiveauId());
		this.setNom(creature.getNom());
		this.setNomCreatureBase(creature.getNomCreatureBase());
		this.setIdCreatureBase(creature.getIdCreatureBase());
		this.setPv(creature.getPv());
		this.setPvInit(creature.getPvInit());
		this.setVisible(creature.isVisible());
		this.setAttaqueIds(creature.getAttaqueIds());
	}

	public DegatDTO getDegatDefense() {
		return degatDefense;
	}

	public void setDegatDefense(DegatDTO degatDefense) {
		this.degatDefense = degatDefense;
	}

	public CarteCreatureDTOFull getCreatureBase() {
		return creatureBase;
	}

	public void setCreatureBase(CarteCreatureDTOFull creatureBase) {
		this.creatureBase = creatureBase;
	}

	public List<AttaqueDTOFull> getAttaques() {
		return attaques;
	}

	public void setAttaques(List<AttaqueDTOFull> attaques) {
		this.attaques = attaques;
	}
	
}
