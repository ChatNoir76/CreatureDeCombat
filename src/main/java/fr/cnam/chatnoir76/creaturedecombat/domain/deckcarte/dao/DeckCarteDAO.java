package fr.cnam.chatnoir76.creaturedecombat.domain.deckcarte.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.cnam.chatnoir76.creaturedecombat.domain.carte.entity.CarteEntity;
import fr.cnam.chatnoir76.creaturedecombat.domain.deck.entity.DeckEntity;
import fr.cnam.chatnoir76.creaturedecombat.domain.deckcarte.entity.DeckCarteEntity;
import fr.cnam.chatnoir76.creaturedecombat.domain.deckcarte.entity.DeckCarteId;


public interface DeckCarteDAO extends JpaRepository<DeckCarteEntity, DeckCarteId> {

	@Query("select dc from DeckCarteEntity dc where dc.deck = :deck and dc.carte = :carte")
	DeckCarteEntity findByDeckEntityAndCarteEntity(@Param("deck")DeckEntity deckEntity, @Param("carte")CarteEntity carteEntity);
	
	List<DeckCarteEntity> findByDeck(DeckEntity deckEntity);
	
	List<DeckCarteEntity> findByCarte(CarteEntity carteEntity);
	
}
