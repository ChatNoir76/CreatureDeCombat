package fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.entity.TypeDegatEntity;

public interface TypeDegatDAO extends JpaRepository<TypeDegatEntity, Integer> {

	TypeDegatEntity findByNom(String nom);
	
}
