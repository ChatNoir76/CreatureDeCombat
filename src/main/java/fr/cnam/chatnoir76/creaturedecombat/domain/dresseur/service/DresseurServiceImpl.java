package fr.cnam.chatnoir76.creaturedecombat.domain.dresseur.service;

import java.util.List;

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
	public CarteDresseurDTO getById(String id) {
		return mapper.fromEntityToDTO(dao.getReferenceById(Integer.valueOf(id)));
	}

	@Override
	public List<CarteDresseurDTO> getAll() {
		return dao.findAll().stream().map(entity -> mapper.fromEntityToDTO(entity)).toList();
	}

}
