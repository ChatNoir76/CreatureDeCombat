package fr.cnam.chatnoir76.creaturedecombat.domain.carte.service;

import java.util.Optional;

import fr.cnam.chatnoir76.creaturedecombat.domain.carte.dto.CarteDTO;

public interface CarteService {

	Optional<CarteDTO> findById(int id);
}
