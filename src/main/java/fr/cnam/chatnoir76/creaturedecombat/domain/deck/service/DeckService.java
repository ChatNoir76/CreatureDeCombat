package fr.cnam.chatnoir76.creaturedecombat.domain.deck.service;

import java.util.List;

import fr.cnam.chatnoir76.creaturedecombat.domain.deck.dto.DeckDTO;

public interface DeckService {

	public DeckDTO getById(String id);
	
	public List<DeckDTO> getAll();
	
}
