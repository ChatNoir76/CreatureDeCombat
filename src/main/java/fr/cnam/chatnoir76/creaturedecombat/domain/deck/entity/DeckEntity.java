package fr.cnam.chatnoir76.creaturedecombat.domain.deck.entity;

import java.util.Set;

import fr.cnam.chatnoir76.creaturedecombat.domain.carte.entity.CarteEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name= DeckEntity.TABLE_NAME)
public class DeckEntity {

	public final static String TABLE_NAME = "deck";
	
	@Id
	@NotBlank
	private int id;
	@NotBlank
	private String nom;
	@NotBlank
	private String description;
	@ManyToMany
    @JoinTable(name ="deck_carte", 
    	joinColumns = @JoinColumn(name = "fk_deck"),
    	inverseJoinColumns = @JoinColumn(name = "fk_carte"))
    private Set<CarteEntity> cartes;
	
	public void addCarte(CarteEntity carte) {
		if(!cartes.contains(carte)) {
			cartes.add(carte);
			carte.addDeck(this);
		}
	}
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
