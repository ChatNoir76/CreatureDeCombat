package fr.cnam.chatnoir76.creaturedecombat.domain.creature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dao.CreatureDAO;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CarteCreatureDTO;
import fr.cnam.chatnoir76.creaturedecombat.sequence.IdSequenceService;
import jakarta.transaction.Transactional;

@Service
@Transactional
@Validated
public class CreatureServiceImpl implements CreatureService {

	@Autowired
	CreatureDAO dao;
	
	private final CreatureDTOMapper mapper = CreatureDTOMapper.INSTANCE;
	
	@Autowired
    IdSequenceService idSequenceService;

	@Override
	public CarteCreatureDTO getById(String id) {
		if(id == null) return null;
		return mapper.fromEntityToDTO(dao.getReferenceById(Integer.valueOf(id)));
	}

	@Override
	public List<CarteCreatureDTO> getAll() {
		return dao.findAll().stream().map(entity -> mapper.fromEntityToDTO(entity)).toList();
	}
	
}
