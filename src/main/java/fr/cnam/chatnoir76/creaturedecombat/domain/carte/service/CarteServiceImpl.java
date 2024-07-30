package fr.cnam.chatnoir76.creaturedecombat.domain.carte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import fr.cnam.chatnoir76.creaturedecombat.domain.carte.dao.CarteDAO;
import fr.cnam.chatnoir76.creaturedecombat.domain.carte.dto.CarteDTO;
import jakarta.transaction.Transactional;

@Service
@Transactional
@Validated
public class CarteServiceImpl implements CarteService {

	@Autowired
	CarteDAO dao;
	
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

}
