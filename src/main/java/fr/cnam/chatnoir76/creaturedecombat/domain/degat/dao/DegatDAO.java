package fr.cnam.chatnoir76.creaturedecombat.domain.degat.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.cnam.chatnoir76.creaturedecombat.domain.degat.entity.DegatEntity;

public interface DegatDAO extends JpaRepository<DegatEntity, Integer> {

}
