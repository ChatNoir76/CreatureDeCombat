package fr.cnam.chatnoir76.creaturedecombat.ui.forms;

import java.util.ArrayList;
import java.util.List;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CreatureCreateForm {

	@NotBlank(message = "champ obligatoire")
	@Size(max=25)
	private String nom;
	
	@Min(10)
	@Max(300)
	private int pv;
	
	private String categorie;
	
	@NotBlank(message = "champ obligatoire")
	@Size(min=15, max=250)
	private String description;
	
	@NotBlank
	private String image;
	
	private List<Integer> attaques;

	public CreatureCreateForm() {
		attaques = new ArrayList<Integer>();
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<Integer> getAttaques() {
		return attaques;
	}

	public void setAttaques(List<Integer> attaques) {
		this.attaques = attaques;
	}
	
}
