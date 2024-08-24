package fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name= NiveauEntity.TABLE_NAME)
public class NiveauEntity extends EnumerationEntity {

	public final static String TABLE_NAME = "niveau";

}
