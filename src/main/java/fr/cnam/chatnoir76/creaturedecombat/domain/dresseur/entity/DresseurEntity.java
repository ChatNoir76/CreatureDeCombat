package fr.cnam.chatnoir76.creaturedecombat.domain.dresseur.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name= "dresseur")
public class DresseurEntity {

	@Id
	@NotBlank
	private int id;
	@NotBlank
	private String nom;
	@NotBlank
	private String description;
	
}
