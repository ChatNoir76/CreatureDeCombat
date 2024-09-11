package fr.cnam.chatnoir76.creaturedecombat.domain.attaque.dto;

import fr.cnam.chatnoir76.creaturedecombat.domain.degat.dto.DegatDTO;

public class AttaqueDTOFull extends AttaqueDTO {

	private DegatDTO degatDTO;
	
	public AttaqueDTOFull (AttaqueDTO attaque) {
		this.setCategorie(attaque.getCategorie());
		this.setDegat(null);
		this.setDescription(attaque.getDescription());
		this.setEnergiePrimaire(attaque.getEnergiePrimaire());
		this.setEnergieSecondaire(attaque.getEnergieSecondaire());
		this.setId(attaque.getId());
		this.setNom(attaque.getNom());
	}

	public DegatDTO getDegatDTO() {
		return degatDTO;
	}

	public void setDegatDTO(DegatDTO degatDTO) {
		this.degatDTO = degatDTO;
	}

}
