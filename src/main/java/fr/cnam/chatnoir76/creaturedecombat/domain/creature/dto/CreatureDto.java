package fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto;

import java.util.ArrayList;
import java.util.List;

public class CreatureDto {

	private int pv;
	private int pvInit;
	private String nom;
	private String description;
	private String niveau;
	private String categorie;
	private String image;

	public String getImage() {
		return image;
	}

	public String getPourcentage() {
		double value = Float.valueOf(pv)/Float.valueOf(pvInit)*100;
		return String.format("%.0f",value) + '%';
	}

	public void setImage(String image) {
		this.image = image;
	}
	private List<AttaqueDto> attaques;
	
	public CreatureDto() {
		attaques = new ArrayList<AttaqueDto>();
	}
	
	public List<AttaqueDto> getAttaques() {
		return attaques;
	}

	public void setAttaques(List<AttaqueDto> attaques) {
		this.attaques = attaques;
	}

	public int getPv() {
		return pv;
	}
	public void setPv(int pv) {
		this.pv = pv;
	}
	public int getPvInit() {
		return pvInit;
	}
	public void setPvInit(int pvInit) {
		this.pvInit = pvInit;
	}
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
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
}
