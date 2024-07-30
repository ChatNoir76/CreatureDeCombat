package fr.cnam.chatnoir76.creaturedecombat.domain.deckcarte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import fr.cnam.chatnoir76.creaturedecombat.domain.carte.entity.CarteEntity;
import fr.cnam.chatnoir76.creaturedecombat.domain.deck.dao.DeckDAO;
import fr.cnam.chatnoir76.creaturedecombat.domain.deck.entity.DeckEntity;
import fr.cnam.chatnoir76.creaturedecombat.domain.deckcarte.dao.DeckCarteDAO;
import fr.cnam.chatnoir76.creaturedecombat.domain.deckcarte.dto.DeckCarteDTO;
import jakarta.transaction.Transactional;

@Service
@Transactional
@Validated
public class DeckCarteServiceImpl implements DeckCarteService {

	@Autowired
	DeckCarteDAO dao;
	
	@Autowired
	DeckDAO deckDAO;
	
	private final DeckCarteDTOMapper mapper = DeckCarteDTOMapper.INSTANCE;
	
	@Override
	public DeckCarteDTO getByDeckAndCarte(DeckEntity deck, CarteEntity carte) {
		return mapper.fromEntityToDTO(dao.findByDeckEntityAndCarteEntity(deck, carte));
	}

	@Override
	public List<DeckCarteDTO> getByDeck(DeckEntity deck) {
		return dao.findByDeck(deck).stream().map(entity -> mapper.fromEntityToDTO(entity)).toList();
	}

	@Override
	public List<DeckCarteDTO> getByDeckId(String deckId) {
		return getByDeck(deckDAO.getReferenceById(Integer.valueOf(deckId)));
	}

}
