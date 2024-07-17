package fr.cnam.chatnoir76.creaturedecombat.domain.deck.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.cnam.chatnoir76.creaturedecombat.domain.deck.entity.DeckEntity;

public interface DeckDAO extends JpaRepository<DeckEntity, Integer> {

}
