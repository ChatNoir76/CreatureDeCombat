package fr.cnam.chatnoir76.creaturedecombat.domain.dresseur.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import fr.cnam.chatnoir76.creaturedecombat.domain.dresseur.dao.DresseurDAO;
import fr.cnam.chatnoir76.creaturedecombat.domain.dresseur.dto.CarteDresseurDTO;
import jakarta.transaction.Transactional;

@Service
@Transactional
@Validated
public class DresseurServiceImpl implements DresseurService {

	@Autowired
	DresseurDAO dao;
	
	private final DresseurDTOMapper mapper = DresseurDTOMapper.INSTANCE;
	
	@Override
	public CarteDresseurDTO getById(int id) {
		return mapper.fromEntityToDTO(dao.getReferenceById(id));
	}

}
