package fr.cnam.chatnoir76.creaturedecombat.domain.carte.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name= "creature")
public class CarteEntity {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@NotBlank
	private int id;
	@NotBlank
	private String nom;
	@NotBlank
	private String description;
	
}
