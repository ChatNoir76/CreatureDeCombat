package fr.cnam.chatnoir76.creaturedecombat.domain.attaque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.dao.AttaqueDAO;
import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.dto.AttaqueDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dao.CreatureDAO;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CarteCreatureDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.service.CreatureDTOMapper;
import fr.cnam.chatnoir76.creaturedecombat.sequence.IdSequenceService;
import jakarta.transaction.Transactional;

@Service
@Transactional
@Validated
public class AttaqueServiceImpl implements AttaqueService {

	@Autowired
	AttaqueDAO dao;
	
	@Autowired
	CreatureDAO creatureDAO;
	
	private final AttaqueDTOMapper mapper = AttaqueDTOMapper.INSTANCE;
	
	private final CreatureDTOMapper mapperCreature = CreatureDTOMapper.INSTANCE;
	
	@Autowired
    IdSequenceService idSequenceService;
	
	@Override
	public AttaqueDTO getById(String id) {
		return mapper.fromEntityToDTO(dao.getReferenceById(Integer.valueOf(id)));
	}

	@Override
	public List<AttaqueDTO> getByCreature(CarteCreatureDTO creature) {
		return dao.findAttaqueEntityByCreature(mapperCreature.fromDTOToEntity(creature)).stream().map(mapper::fromEntityToDTO).toList();
	}

	@Override
	public List<AttaqueDTO> getByCreatureId(String creatureId) {
		return dao.findAttaqueEntityByCreature(creatureDAO.getReferenceById(Integer.valueOf(creatureId))).stream().map(mapper::fromEntityToDTO).toList();
	}

	@Override
	public List<AttaqueDTO> getAll() {
		return dao.findAll().stream().map(entity -> mapper.fromEntityToDTO(entity)).toList();
	}

}
