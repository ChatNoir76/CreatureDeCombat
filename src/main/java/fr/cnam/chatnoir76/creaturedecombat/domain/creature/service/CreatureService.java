package fr.cnam.chatnoir76.creaturedecombat.domain.creature.service;

import java.util.List;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CarteCreatureDTO;

public interface CreatureService {
	
	CarteCreatureDTO getById(String id);
	
	List<CarteCreatureDTO> getAll();
	
	CarteCreatureDTO save(CarteCreatureDTO dto);
	
	CarteCreatureDTO update(CarteCreatureDTO dto);
	
	boolean delete(CarteCreatureDTO dto);
			
}
