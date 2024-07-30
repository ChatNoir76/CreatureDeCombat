package fr.cnam.chatnoir76.creaturedecombat.domain.carte.service;

import java.util.List;

import fr.cnam.chatnoir76.creaturedecombat.domain.carte.dto.CarteDTO;

public interface CarteService {

	CarteDTO getById(String id);
	
	List<CarteDTO> getAll();
	
}
