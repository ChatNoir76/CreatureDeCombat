package fr.cnam.chatnoir76.creaturedecombat.domain.energie.dto;

import fr.cnam.chatnoir76.creaturedecombat.domain.carte.dto.CarteDTO;

public class CarteEnergieDTO extends CarteDTO {

	private String categorie;

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	
}
