package fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.entity.NiveauEntity;

public interface NiveauDAO extends JpaRepository<NiveauEntity, Integer> {

	NiveauEntity findByNom(String nom);
	
}
