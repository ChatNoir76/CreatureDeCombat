package fr.cnam.chatnoir76.creaturedecombat.domain.attaque.dto;

public class AttaqueDTO {

	private String nom;
	private String description;
	private int energiePrimaire;
	private int energieSecondaire;
	private String categorie;
	
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
	public void setEnergieSecondaire(int energieSecondaire) {
		this.energieSecondaire = energieSecondaire;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
}
