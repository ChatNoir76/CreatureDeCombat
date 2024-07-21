package fr.cnam.chatnoir76.creaturedecombat.domain.dresseur.entity;

import fr.cnam.chatnoir76.creaturedecombat.domain.carte.entity.CarteEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name= DresseurEntity.TABLE_NAME)
public class DresseurEntity extends CarteEntity {

	public final static String TABLE_NAME = "dresseur";
	
	
}
