package fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.EnumerationFactory;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dao.TypeDegatDAO;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dto.EnumerationDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dto.TypeDegatDTO;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class TypeDegatServiceImpl implements EnumerationService<TypeDegatDTO> {

	@Autowired
	TypeDegatDAO dao;
	
	private final EnumerationDTOMapper mapper = EnumerationDTOMapper.INSTANCE;

	@Override
	public TypeDegatDTO getById(String id) {
		return (TypeDegatDTO) mapper.fromEntityToDTO(dao.getReferenceById(Integer.valueOf(id)));
	}

	@Override
	public TypeDegatDTO getByName(String nom) {
		return (TypeDegatDTO) mapper.fromEntityToDTO(dao.findByNom(nom));
	}

	@Override
	public List<TypeDegatDTO> getAll() {
		return dao.findAll().stream().map(e -> this.cast(mapper.fromEntityToDTO(e))).toList();
	}
	
	private TypeDegatDTO cast(EnumerationDTO dto) {
		return EnumerationFactory.createTypeDegatDTO(dto.getId(), dto.getNom());
	}
	
}
