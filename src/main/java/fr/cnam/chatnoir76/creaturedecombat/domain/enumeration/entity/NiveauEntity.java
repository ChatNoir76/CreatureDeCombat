package fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name= NiveauEntity.TABLE_NAME)
public class NiveauEntity {

	public final static String TABLE_NAME = "niveau";
	
	@Id
	@NotBlank
	private int id;
	
	private String nom;

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
	
}
