package fr.cnam.chatnoir76.creaturedecombat.domain.attaque.dto;

import fr.cnam.chatnoir76.creaturedecombat.domain.degat.dto.DegatDTO;

public class AttaqueDTO {

	private String nom;
	private String description;
	private String degat = "10%";
	private int energiePrimaire;
	private int energieSecondaire;
	private DegatDTO degatDto;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getEnergiePrimaire() {
		return energiePrimaire;
	}
	public void setEnergiePrimaire(int energiePrimaire) {
		this.energiePrimaire = energiePrimaire;
	}
	public int getEnergieSecondaire() {
		return energieSecondaire;
	}
	public String getDegat() {
		return degat;
	}
	public void setDegat(String degat) {
		this.degat = degat;
	}
	public void setEnergieSecondaire(int energieSecondaire) {
		this.energieSecondaire = energieSecondaire;
	}
	public DegatDTO getDegatDto() {
		return degatDto;
	}
	public void setDegatDto(DegatDTO degatDto) {
		this.degatDto = degatDto;
	}

}
