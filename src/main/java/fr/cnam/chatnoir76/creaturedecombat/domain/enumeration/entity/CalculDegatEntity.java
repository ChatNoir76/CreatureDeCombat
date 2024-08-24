package fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name= CalculDegatEntity.TABLE_NAME)
public class CalculDegatEntity extends EnumerationEntity {

	public final static String TABLE_NAME = "calculdegat";

}
