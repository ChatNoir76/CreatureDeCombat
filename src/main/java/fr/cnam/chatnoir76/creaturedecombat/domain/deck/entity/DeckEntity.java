package fr.cnam.chatnoir76.creaturedecombat.domain.deck.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name= "deck")
public class DeckEntity {

	@Id
	@NotBlank
	private int id;
	@NotBlank
	private String nom;
	@NotBlank
	private String description;
	
}
