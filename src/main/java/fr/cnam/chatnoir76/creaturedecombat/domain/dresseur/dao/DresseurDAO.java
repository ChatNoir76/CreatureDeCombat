package fr.cnam.chatnoir76.creaturedecombat.domain.dresseur.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.cnam.chatnoir76.creaturedecombat.domain.dresseur.entity.DresseurEntity;

public interface DresseurDAO extends JpaRepository<DresseurEntity, String> {

}
