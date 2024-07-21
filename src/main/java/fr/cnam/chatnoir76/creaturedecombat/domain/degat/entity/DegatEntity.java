package fr.cnam.chatnoir76.creaturedecombat.domain.degat.entity;

import java.util.Set;

import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.entity.AttaqueEntity;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.entity.CalculDegatEntity;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.entity.TypeDegatEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name= DegatEntity.TABLE_NAME)
public class DegatEntity {

	public final static String TABLE_NAME = "degat";
	
	@Id
	@NotBlank
	private int id;
	@NotBlank
	private int degat;
	@NotBlank
	private int dprecision;
	@NotBlank
	private int drattage;
	@ManyToOne
    @NotNull
    @JoinColumn(name = "fk_typedegat")
    private TypeDegatEntity typeDegat;
	@ManyToOne
    @NotNull
    @JoinColumn(name = "fk_calculdegat")
    private CalculDegatEntity calculdegat;
	@OneToMany(mappedBy="degat")
	private Set<AttaqueEntity> attaques;
	
	public void addAttaque(AttaqueEntity attaque) {
		if(!attaques.contains(attaque)) {
			attaques.add(attaque);
			attaque.setDegat(this);
		}
	}
	public void removeAttaque(AttaqueEntity attaque) {
		attaques.remove(attaque);
		attaque.setDegat(null);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDegat() {
		return degat;
	}
	public void setDegat(int degat) {
		this.degat = degat;
	}
	public int getDprecision() {
		return dprecision;
	}
	public void setDprecision(int dprecision) {
		this.dprecision = dprecision;
	}
	public int getDrattage() {
		return drattage;
	}
	public void setDrattage(int drattage) {
		this.drattage = drattage;
	}
	public TypeDegatEntity getTypeDegat() {
		return typeDegat;
	}
	public void setTypeDegat(TypeDegatEntity typeDegat) {
		this.typeDegat = typeDegat;
	}
	public CalculDegatEntity getCalculdegat() {
		return calculdegat;
	}
	public void setCalculdegat(CalculDegatEntity calculdegat) {
		this.calculdegat = calculdegat;
	}
	
}
