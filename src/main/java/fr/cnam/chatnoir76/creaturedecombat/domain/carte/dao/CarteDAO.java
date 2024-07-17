package fr.cnam.chatnoir76.creaturedecombat.domain.carte.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.cnam.chatnoir76.creaturedecombat.domain.carte.entity.CarteEntity;

public interface CarteDAO extends JpaRepository<CarteEntity, String> {

}
