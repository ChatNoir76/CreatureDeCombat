package fr.cnam.chatnoir76.creaturedecombat.domain.deckcarte.dto;

import org.springframework.hateoas.RepresentationModel;

public class DeckCarteDTO extends RepresentationModel<DeckCarteDTO>{

	private int count;
	
	private String id_deck;
	
	private String nom_deck;
	
	private String id_carte;
	
	private String nom_carte;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getId_deck() {
		return id_deck;
	}

	public void setId_deck(String id_deck) {
		this.id_deck = id_deck;
	}

	public String getNom_deck() {
		return nom_deck;
	}

	public void setNom_deck(String nom_deck) {
		this.nom_deck = nom_deck;
	}

	public String getId_carte() {
		return id_carte;
	}

	public void setId_carte(String id_carte) {
		this.id_carte = id_carte;
	}

	public String getNom_carte() {
		return nom_carte;
	}

	public void setNom_carte(String nom_carte) {
		this.nom_carte = nom_carte;
	}
	
}
