package fr.cnam.chatnoir76.creaturedecombat.domain.creature.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name= CreatureEntity.TABLE_NAME)
public class CreatureEntity {

	public final static String TABLE_NAME = "creature";
	
	@Id
	@NotBlank
	private int id;
	@NotBlank
	private String nom;
	@NotBlank
	private String description;
	@NotBlank
	private String image;
	@NotBlank
	private int pv;
	
	public CreatureEntity() {
		this.id = -1;
	}
	
	public CreatureEntity(@NotBlank int id, @NotBlank String nom, @NotBlank String description, @NotBlank String image,
			@NotBlank int pv) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.image = image;
		this.pv = pv;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}
	
}
