package fr.cnam.chatnoir76.creaturedecombat.domain.creature.service;

import java.util.Optional;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CarteCreatureDTO;

public interface CreatureService {
	
	Optional<CarteCreatureDTO> findById(int id);
		
}
