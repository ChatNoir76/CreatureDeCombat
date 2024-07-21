package fr.cnam.chatnoir76.creaturedecombat.domain.creature.entity;

import java.util.Set;

import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.entity.AttaqueEntity;
import fr.cnam.chatnoir76.creaturedecombat.domain.carte.entity.CarteEntity;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.entity.CategorieEntity;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.entity.NiveauEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name= CreatureEntity.TABLE_NAME)
public class CreatureEntity extends CarteEntity {

	public final static String TABLE_NAME = "creature";
	
	@NotBlank
	private int pv;
	@ManyToOne
    @NotNull
    @JoinColumn(name = "fk_categorie")
	private CategorieEntity categorie;
	@ManyToOne
    @NotNull
    @JoinColumn(name = "fk_niveau")
	private NiveauEntity niveau;
	@ManyToOne
    @JoinColumn(name = "fk_creature")
	private CreatureEntity creatureBase;
	@ManyToMany
    @JoinTable(name ="creature_attaque", 
    	joinColumns = @JoinColumn(name = "fk_creature"),
    	inverseJoinColumns = @JoinColumn(name = "fk_attaque"))
    private Set<AttaqueEntity> attaques;
	
	public void addAttaque(AttaqueEntity attaque) {
		if(!attaques.contains(attaque)) {
			attaques.add(attaque);
			attaque.addCreature(this);
		}
	}
	public CreatureEntity getCreatureBase() {
		return creatureBase;
	}
	public void setCreatureBase(CreatureEntity creatureBase) {
		this.creatureBase = creatureBase;
	}
	public int getPv() {
		return pv;
	}
	public void setPv(int pv) {
		this.pv = pv;
	}
	public CategorieEntity getCategorie() {
		return categorie;
	}
	public void setCategorie(CategorieEntity categorie) {
		this.categorie = categorie;
	}
	public NiveauEntity getNiveau() {
		return niveau;
	}
	public void setNiveau(NiveauEntity niveau) {
		this.niveau = niveau;
	}

}
