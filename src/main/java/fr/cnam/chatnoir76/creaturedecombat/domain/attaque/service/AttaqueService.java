package fr.cnam.chatnoir76.creaturedecombat.domain.attaque.service;

import java.util.Optional;

import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.dto.AttaqueDTO;

public interface AttaqueService {

	Optional<AttaqueDTO> findById(int id);
	
}
