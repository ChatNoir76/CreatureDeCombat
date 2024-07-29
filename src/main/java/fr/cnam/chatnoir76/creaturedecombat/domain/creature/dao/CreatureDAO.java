package fr.cnam.chatnoir76.creaturedecombat.domain.creature.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.entity.CreatureEntity;

public interface CreatureDAO extends JpaRepository<CreatureEntity, Integer>{
	
}
