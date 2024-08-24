package fr.cnam.chatnoir76.creaturedecombat.domain.carte.entity;

import java.util.Set;

import fr.cnam.chatnoir76.creaturedecombat.domain.deckcarte.entity.DeckCarteEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name= CarteEntity.TABLE_NAME)
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class CarteEntity {

	public final static String TABLE_NAME = "carte";
	
	@Id
	@NotNull
	private int id;
	@NotBlank
	private String nom;
	@NotBlank
	private String description;
	@NotBlank
	private String image;
	
	@OneToMany(mappedBy = "carte", cascade = CascadeType.ALL)
	private Set<DeckCarteEntity> deckCarte;
	
//	public void addDeck(DeckEntity deck) {
//		if(!decks.contains(deck)) {
//			decks.add(deck);
//			deck.addCarte(this);
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
}
