package fr.cnam.chatnoir76.creaturedecombat.domain.deckcarte.service;

import java.util.List;

import fr.cnam.chatnoir76.creaturedecombat.domain.carte.entity.CarteEntity;
import fr.cnam.chatnoir76.creaturedecombat.domain.deck.entity.DeckEntity;
import fr.cnam.chatnoir76.creaturedecombat.domain.deckcarte.dto.DeckCarteDTO;

public interface DeckCarteService {

	public DeckCarteDTO getByDeckAndCarte(DeckEntity deck, CarteEntity carte);
	
	public List<DeckCarteDTO> getByDeck(DeckEntity deck);
	
	public List<DeckCarteDTO> getByDeckId(String deckId);
	
	
	
}
