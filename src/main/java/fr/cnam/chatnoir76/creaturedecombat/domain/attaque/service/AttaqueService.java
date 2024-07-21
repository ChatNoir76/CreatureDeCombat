package fr.cnam.chatnoir76.creaturedecombat.domain.attaque.service;

import java.util.List;

import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.dto.AttaqueDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CarteCreatureDTO;

public interface AttaqueService {

	public AttaqueDTO getById(int id);
	
	public List<AttaqueDTO> getByCreature(CarteCreatureDTO creature);
	
}
