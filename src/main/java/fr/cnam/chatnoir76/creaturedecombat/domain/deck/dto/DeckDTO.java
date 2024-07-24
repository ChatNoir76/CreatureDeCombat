package fr.cnam.chatnoir76.creaturedecombat.domain.deck.dto;

import org.springframework.hateoas.RepresentationModel;

public class DeckDTO extends RepresentationModel<DeckDTO> {

	private String id;
	private String nom;
	private String Description;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
}
