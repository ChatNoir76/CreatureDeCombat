package fr.cnam.chatnoir76.creaturedecombat.domain.carte.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import fr.cnam.chatnoir76.creaturedecombat.domain.carte.dao.CarteDAO;
import fr.cnam.chatnoir76.creaturedecombat.domain.carte.dto.CarteDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.deck.dto.DeckDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.deckcarte.dto.DeckCarteDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.deckcarte.service.DeckCarteService;
import jakarta.transaction.Transactional;

@Service
@Transactional
@Validated
public class CarteServiceImpl implements CarteService {

	@Autowired
	CarteDAO dao;
	
	@Autowired
	DeckCarteService dcService;
	
	@Autowired
	CarteDTOMapper mapper;
	
	@Override
	public CarteDTO getById(String id) {
		return mapper.fromEntityToDTO(dao.getReferenceById(Integer.valueOf(id)));
	}

	@Override
	public List<CarteDTO> getAll() {
		return dao.findAll().stream().map(entity -> mapper.fromEntityToDTO(entity)).toList();
	}

	@Override
	public List<CarteDTO> getByDeck(DeckDTO deck) {
		List<DeckCarteDTO> cdeck = dcService.getByDeckId(deck.getId());
		List<CarteDTO> cartes = new ArrayList<CarteDTO>();
		cdeck.forEach(dc -> {
			CarteDTO carte = mapper.fromEntityToDTO(dao.getReferenceById(Integer.valueOf(dc.getId_carte())));
			cartes.addAll(Collections.nCopies(dc.getCount(), carte));
		});
		return cartes;
	}


}
