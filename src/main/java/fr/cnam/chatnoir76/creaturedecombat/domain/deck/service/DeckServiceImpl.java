package fr.cnam.chatnoir76.creaturedecombat.domain.deck.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import fr.cnam.chatnoir76.creaturedecombat.domain.deck.dao.DeckDAO;
import fr.cnam.chatnoir76.creaturedecombat.domain.deck.dto.DeckDTO;
import jakarta.transaction.Transactional;

@Service
@Transactional
@Validated
public class DeckServiceImpl implements DeckService {

	@Autowired
	DeckDAO dao;
	
	private final DeckDTOMapper mapper = DeckDTOMapper.INSTANCE;
	
	@Override
	public DeckDTO getById(int id) {
		return mapper.fromEntityToDTO(dao.getReferenceById(id));
	}

}
