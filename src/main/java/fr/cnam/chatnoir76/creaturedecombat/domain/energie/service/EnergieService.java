package fr.cnam.chatnoir76.creaturedecombat.domain.energie.service;

import java.util.List;

import fr.cnam.chatnoir76.creaturedecombat.domain.energie.dto.CarteEnergieDTO;

public interface EnergieService {

	public CarteEnergieDTO getById(String id);
	
	public List<CarteEnergieDTO> getAll();
	
}
