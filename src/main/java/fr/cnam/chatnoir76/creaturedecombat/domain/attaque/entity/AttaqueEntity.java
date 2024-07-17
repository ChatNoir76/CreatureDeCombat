package fr.cnam.chatnoir76.creaturedecombat.domain.attaque.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name= "attaque")
public class AttaqueEntity {

	@Id
	@NotBlank
	private int id;
	@NotBlank
	private String nom;
	@NotBlank
	private String description;
	
}
