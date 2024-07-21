package fr.cnam.chatnoir76.creaturedecombat.domain.attaque.entity;

import java.util.Set;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.entity.CreatureEntity;
import fr.cnam.chatnoir76.creaturedecombat.domain.degat.entity.DegatEntity;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.entity.CategorieEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name= AttaqueEntity.TABLE_NAME)
public class AttaqueEntity {

	public final static String TABLE_NAME = "attaque";
	
	@Id
	@NotBlank
	private int id;
	@ManyToOne
    @NotNull
    @JoinColumn(name = "fk_degat")
	private DegatEntity degat;
	@NotBlank
	private String nom;
	@NotBlank
	private String description;
	@Column(name="e_primaire")
	private int ePrimaire;
	@Column(name="e_secondaire")
	private int eSecondaire;
	@ManyToOne
    @NotNull
    @JoinColumn(name = "fk_categorie")
	private CategorieEntity categorie;
	@ManyToMany(mappedBy = "attaques")
	private Set<CreatureEntity> creatures;
	  
	public void addCreature(CreatureEntity creature) {
		if(!creatures.contains(creature)) {
			creatures.add(creature);
			creature.addAttaque(this);
		}
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public DegatEntity getDegat() {
		return degat;
	}
	public void setDegat(DegatEntity newDegat) {
		if (degat != null){
			if(!degat.equals(newDegat)) {
				degat.removeAttaque(this);
			}
		}
		this.degat = newDegat;
		if(newDegat != null) {
			degat.addAttaque(this);
		}
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
	public int getePrimaire() {
		return ePrimaire;
	}
	public void setePrimaire(int ePrimaire) {
		this.ePrimaire = ePrimaire;
	}
	public int geteSecondaire() {
		return eSecondaire;
	}
	public void seteSecondaire(int eSecondaire) {
		this.eSecondaire = eSecondaire;
	}
	public CategorieEntity getCategorie() {
		return categorie;
	}
	public void setCategorie(CategorieEntity categorie) {
		this.categorie = categorie;
	}
	
}
