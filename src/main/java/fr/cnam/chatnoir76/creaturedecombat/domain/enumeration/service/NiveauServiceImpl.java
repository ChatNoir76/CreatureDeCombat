package fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.EnumerationFactory;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dao.NiveauDAO;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dto.EnumerationDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dto.NiveauDTO;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class NiveauServiceImpl implements EnumerationService<NiveauDTO> {

	@Autowired
	NiveauDAO dao;
	
	private final EnumerationDTOMapper mapper = EnumerationDTOMapper.INSTANCE;
	
	@Override
	public NiveauDTO getById(String id) {
		return (NiveauDTO) mapper.fromEntityToDTO(dao.getReferenceById(Integer.valueOf(id)));
	}

	@Override
	public NiveauDTO getByName(String nom) {
		return (NiveauDTO) mapper.fromEntityToDTO(dao.findByNom(nom));
	}

	@Override
	public List<NiveauDTO> getAll() {
		return dao.findAll().stream().map(e -> this.cast(mapper.fromEntityToDTO(e))).toList();
	}

	private NiveauDTO cast(EnumerationDTO dto) {
		return EnumerationFactory.createNiveauDTO(dto.getId(), dto.getNom());
	}
}
