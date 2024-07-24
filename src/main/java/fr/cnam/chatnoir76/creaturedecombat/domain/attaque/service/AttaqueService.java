package fr.cnam.chatnoir76.creaturedecombat.domain.attaque.service;

import java.util.List;

import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.dto.AttaqueDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CarteCreatureDTO;

public interface AttaqueService {

	public AttaqueDTO getById(String id);
	
	public List<AttaqueDTO> getByCreature(CarteCreatureDTO creature);
	
	public List<AttaqueDTO> getByCreatureId(String creatureId);
	
	public List<AttaqueDTO> getAll();
	
}
