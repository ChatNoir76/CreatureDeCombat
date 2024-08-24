package fr.cnam.chatnoir76.creaturedecombat.domain.deck.entity;

import java.util.Set;

import fr.cnam.chatnoir76.creaturedecombat.domain.deckcarte.entity.DeckCarteEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name= DeckEntity.TABLE_NAME)
public class DeckEntity {

	public final static String TABLE_NAME = "deck";
	
	@Id
	@NotNull
	private int id;
	@NotBlank
	private String nom;
	@NotBlank
	private String description;
	@OneToMany(mappedBy = "deck", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<DeckCarteEntity> deckCarte;
	
//	public void addCarte(CarteEntity carte) {
//		if(!cartes.contains(carte)) {
//			cartes.add(carte);
//			carte.addDeck(this);
//		}
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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

}
