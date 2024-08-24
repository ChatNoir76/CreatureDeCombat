package fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name= CategorieEntity.TABLE_NAME)
public class CategorieEntity extends EnumerationEntity {

	public final static String TABLE_NAME = "categorie";
	
}
