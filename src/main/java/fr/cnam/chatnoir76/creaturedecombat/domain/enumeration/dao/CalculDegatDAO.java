package fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.entity.CalculDegatEntity;

public interface CalculDegatDAO extends JpaRepository<CalculDegatEntity, Integer> {

	CalculDegatEntity findByNom(String nom);
	
}
