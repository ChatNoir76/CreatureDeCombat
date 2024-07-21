package fr.cnam.chatnoir76.creaturedecombat.domain.creature.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dao.CreatureDAO;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CarteCreatureDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.entity.CreatureEntity;
import fr.cnam.chatnoir76.creaturedecombat.sequence.IdSequenceService;
import jakarta.transaction.Transactional;

@Service
@Transactional
@Validated
public class CreatureServiceImpl implements CreatureService {

	@Autowired
	CreatureDAO creatureDAO;
	
	@Autowired
    IdSequenceService idSequenceService;
	
	@Override
	public Optional<CarteCreatureDTO> findById(int id) {
		return creatureDAO.findById(id).map(creatureEntity -> CreatureDTOMapper.toDTO(creatureEntity));
	}

}
