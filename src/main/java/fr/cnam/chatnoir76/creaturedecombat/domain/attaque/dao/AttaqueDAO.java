package fr.cnam.chatnoir76.creaturedecombat.domain.attaque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.entity.AttaqueEntity;

public interface AttaqueDAO extends JpaRepository<AttaqueEntity, Integer> {

}
