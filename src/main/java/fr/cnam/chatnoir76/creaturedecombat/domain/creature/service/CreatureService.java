package fr.cnam.chatnoir76.creaturedecombat.domain.creature.service;

import java.util.Optional;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CreatureDTO;

public interface CreatureService {
	
	Optional<CreatureDTO> findById(int id);
		
}
