package fr.cnam.chatnoir76.creaturedecombat.domain.carte.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import fr.cnam.chatnoir76.creaturedecombat.domain.carte.dto.CarteDTO;
import jakarta.transaction.Transactional;

@Service
@Transactional
@Validated
public class CarteServiceImpl implements CarteService {

	@Override
	public Optional<CarteDTO> findById(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
