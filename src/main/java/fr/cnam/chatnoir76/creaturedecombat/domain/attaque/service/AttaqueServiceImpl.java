package fr.cnam.chatnoir76.creaturedecombat.domain.attaque.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.dto.AttaqueDTO;
import jakarta.transaction.Transactional;

@Service
@Transactional
@Validated
public class AttaqueServiceImpl implements AttaqueService {

	@Override
	public Optional<AttaqueDTO> findById(int id) {
		return Optional.empty();
	}

}
