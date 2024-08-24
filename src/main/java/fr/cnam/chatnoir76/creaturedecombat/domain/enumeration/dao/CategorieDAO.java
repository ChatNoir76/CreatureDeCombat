package fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.entity.CategorieEntity;

public interface CategorieDAO extends JpaRepository<CategorieEntity, Integer> {

	CategorieEntity findByNom(String nom);
	
}
