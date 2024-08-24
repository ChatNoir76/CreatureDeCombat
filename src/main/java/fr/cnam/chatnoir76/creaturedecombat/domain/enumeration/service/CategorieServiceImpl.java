package fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.EnumerationFactory;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dao.CategorieDAO;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dto.CategorieDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dto.EnumerationDTO;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class CategorieServiceImpl implements EnumerationService<CategorieDTO> {

	@Autowired
	CategorieDAO dao;
	
	private final EnumerationDTOMapper mapper = EnumerationDTOMapper.INSTANCE;
	
	@Override
	public CategorieDTO getById(String id) {
		return (CategorieDTO) mapper.fromEntityToDTO(dao.getReferenceById(Integer.valueOf(id)));
	}

	@Override
	public CategorieDTO getByName(String nom) {
		return (CategorieDTO) mapper.fromEntityToDTO(dao.findByNom(nom));
	}

	@Override
	public List<CategorieDTO> getAll() {
		return dao.findAll().stream().map(e -> this.cast(mapper.fromEntityToDTO(e))).toList();
	}
	
	private CategorieDTO cast(EnumerationDTO dto) {
		return EnumerationFactory.createCategorieDTO(dto.getId(), dto.getNom());
	}

}
