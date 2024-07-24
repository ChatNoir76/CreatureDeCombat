package fr.cnam.chatnoir76.creaturedecombat.domain.degat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.dto.AttaqueDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.service.AttaqueDTOMapper;
import fr.cnam.chatnoir76.creaturedecombat.domain.degat.dao.DegatDAO;
import fr.cnam.chatnoir76.creaturedecombat.domain.degat.dto.DegatDTO;
import fr.cnam.chatnoir76.creaturedecombat.sequence.IdSequenceService;
import jakarta.transaction.Transactional;

@Service
@Transactional
@Validated
public class DegatServiceImpl implements DegatService {

	@Autowired
	DegatDAO dao;
	
	private final DegatDTOMapper degatMapper = DegatDTOMapper.INSTANCE;
	
	private final AttaqueDTOMapper attaqueMapper = AttaqueDTOMapper.INSTANCE;
	
	@Autowired
    IdSequenceService idSequenceService;
	
	@Override
	public DegatDTO getById(String id) {
		return degatMapper.fromEntityToDTO(dao.getReferenceById(Integer.valueOf(id)));
	}

	@Override
	public DegatDTO getByAttaque(AttaqueDTO attaque) {
		return degatMapper.fromEntityToDTO(dao.findDegatEntityByAttaque(attaqueMapper.fromDTOToEntity(attaque)));
	}

	@Override
	public List<DegatDTO> getAll() {
		return dao.findAll().stream().map(entity -> degatMapper.fromEntityToDTO(entity)).toList();
	}

}
