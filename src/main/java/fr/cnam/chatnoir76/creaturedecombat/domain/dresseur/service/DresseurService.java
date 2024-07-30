package fr.cnam.chatnoir76.creaturedecombat.domain.dresseur.service;

import java.util.List;

import fr.cnam.chatnoir76.creaturedecombat.domain.dresseur.dto.CarteDresseurDTO;

public interface DresseurService {

	public CarteDresseurDTO getById(String id);
	
	public List<CarteDresseurDTO> getAll();
	
}
