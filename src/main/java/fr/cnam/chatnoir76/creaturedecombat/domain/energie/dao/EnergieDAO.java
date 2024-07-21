package fr.cnam.chatnoir76.creaturedecombat.domain.energie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.cnam.chatnoir76.creaturedecombat.domain.energie.entity.EnergieEntity;

public interface EnergieDAO extends JpaRepository<EnergieEntity, Integer> {

}
