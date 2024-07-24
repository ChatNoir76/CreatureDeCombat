package fr.cnam.chatnoir76.creaturedecombat.domain.degat.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.entity.AttaqueEntity;
import fr.cnam.chatnoir76.creaturedecombat.domain.degat.entity.DegatEntity;

public interface DegatDAO extends JpaRepository<DegatEntity, Integer> {

	@Query("select d from DegatEntity d where :attaque member of d.attaques")
	DegatEntity findDegatEntityByAttaque(@Param("attaque")AttaqueEntity attaque);
	
}
