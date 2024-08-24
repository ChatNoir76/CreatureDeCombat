package fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.EnumerationFactory;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dao.CalculDegatDAO;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dto.CalculDegatDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dto.EnumerationDTO;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class CalculDegatServiceImpl implements EnumerationService<CalculDegatDTO> {

	@Autowired
	CalculDegatDAO dao;
	
	private final EnumerationDTOMapper mapper = EnumerationDTOMapper.INSTANCE;
	
	@Override
	public CalculDegatDTO getById(String id) {
		return (CalculDegatDTO) mapper.fromEntityToDTO(dao.getReferenceById(Integer.valueOf(id)));
	}

	@Override
	public CalculDegatDTO getByName(String nom) {
		return (CalculDegatDTO) mapper.fromEntityToDTO(dao.findByNom(nom));
	}

	@Override
	public List<CalculDegatDTO> getAll() {
		return dao.findAll().stream().map(e -> this.cast(mapper.fromEntityToDTO(e))).toList();
	}

	private CalculDegatDTO cast(EnumerationDTO dto) {
		return EnumerationFactory.createCalculDegatDTO(dto.getId(), dto.getNom());
	}
	
}
