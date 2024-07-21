package fr.cnam.chatnoir76.creaturedecombat.domain.energie.entity;

import fr.cnam.chatnoir76.creaturedecombat.domain.carte.entity.CarteEntity;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.entity.CategorieEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name= EnergieEntity.TABLE_NAME)
public class EnergieEntity extends CarteEntity {

	public final static String TABLE_NAME = "energie";
	
	@ManyToOne
    @NotNull
    @JoinColumn(name = "fk_categorie")
	private CategorieEntity categorie;
	
	public CategorieEntity getCategorie() {
		return categorie;
	}
	public void setCategorie(CategorieEntity categorie) {
		this.categorie = categorie;
	}
	
}
