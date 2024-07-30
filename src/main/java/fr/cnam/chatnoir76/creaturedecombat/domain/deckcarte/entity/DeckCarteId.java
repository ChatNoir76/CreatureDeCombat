package fr.cnam.chatnoir76.creaturedecombat.domain.deckcarte.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class DeckCarteId {

	private String id_deck;
	private String id_carte;
	
	public String getId_deck() {
		return id_deck;
	}
	public void setId_deck(String id_deck) {
		this.id_deck = id_deck;
	}
	public String getId_carte() {
		return id_carte;
	}
	public void setId_carte(String id_carte) {
		this.id_carte = id_carte;
	}
	
}
