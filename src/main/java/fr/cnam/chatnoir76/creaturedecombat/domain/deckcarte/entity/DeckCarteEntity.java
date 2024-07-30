package fr.cnam.chatnoir76.creaturedecombat.domain.deckcarte.entity;

import fr.cnam.chatnoir76.creaturedecombat.domain.carte.entity.CarteEntity;
import fr.cnam.chatnoir76.creaturedecombat.domain.deck.entity.DeckEntity;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name= DeckCarteEntity.TABLE_NAME)
public class DeckCarteEntity {

	public final static String TABLE_NAME = "deck_carte";
	
	@EmbeddedId
	private DeckCarteId id;
	
	@NotBlank
	private int count;
	
	@ManyToOne
    @MapsId("id_deck")
    @JoinColumn(name = "id_deck")
	private DeckEntity deck;
	
	@ManyToOne
    @MapsId("id_carte")
    @JoinColumn(name = "id_carte")
	private CarteEntity carte;

	public DeckCarteId getId() {
		return id;
	}

	public void setId(DeckCarteId id) {
		this.id = id;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public DeckEntity getDeck() {
		return deck;
	}

	public void setDeck(DeckEntity deck) {
		this.deck = deck;
	}

	public CarteEntity getCarte() {
		return carte;
	}

	public void setCarte(CarteEntity carte) {
		this.carte = carte;
	}
	
}
