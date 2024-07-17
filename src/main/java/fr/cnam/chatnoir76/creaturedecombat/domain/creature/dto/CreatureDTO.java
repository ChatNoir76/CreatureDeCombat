package fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto;

import java.util.ArrayList;
import java.util.List;

import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.dto.AttaqueDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.carte.dto.CarteDTO;

public class CreatureDTO extends CarteDTO {

	private int id;
	private int pv;
	private int pvInit;
	private String nom;
	private String description;
	private String niveau;
	private String categorie;

	public String getPourcentage() {
		double value = Float.valueOf(pv)/Float.valueOf(pvInit)*100;
		return String.format("%.0f",value) + '%';
	}

	private List<AttaqueDTO> attaques;
	
	public CreatureDTO() {
		attaques = new ArrayList<AttaqueDTO>();
	}
	
	public List<AttaqueDTO> getAttaques() {
		return attaques;
	}

	public void setAttaques(List<AttaqueDTO> attaques) {
		this.attaques = attaques;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
