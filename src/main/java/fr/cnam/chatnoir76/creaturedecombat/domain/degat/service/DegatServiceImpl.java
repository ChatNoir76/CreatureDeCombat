package fr.cnam.chatnoir76.creaturedecombat.domain.degat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

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
	
	private final DegatDTOMapper mapper = DegatDTOMapper.INSTANCE;
	
	@Autowired
    IdSequenceService idSequenceService;
	
	@Override
	public DegatDTO getById(int id) {
		return mapper.fromEntityToDTO(dao.getReferenceById(id));
	}

}
