package fr.cnam.chatnoir76.creaturedecombat.domain.attaque.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.entity.AttaqueEntity;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.entity.CreatureEntity;

public interface AttaqueDAO extends JpaRepository<AttaqueEntity, Integer> {

	@Query("select a from AttaqueEntity a where :creature member of a.creatures")
	List<AttaqueEntity> findAttaqueEntityByCreature(@Param("creature")CreatureEntity creature);
	
}
