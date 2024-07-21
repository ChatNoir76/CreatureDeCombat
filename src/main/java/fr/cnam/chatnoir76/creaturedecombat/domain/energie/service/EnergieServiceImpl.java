package fr.cnam.chatnoir76.creaturedecombat.domain.energie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import fr.cnam.chatnoir76.creaturedecombat.domain.energie.dao.EnergieDAO;
import fr.cnam.chatnoir76.creaturedecombat.domain.energie.dto.CarteEnergieDTO;
import jakarta.transaction.Transactional;

@Service
@Transactional
@Validated
public class EnergieServiceImpl implements EnergieService {

	@Autowired
	EnergieDAO dao;
	
	private final EnergieDTOMapper mapper = EnergieDTOMapper.INSTANCE;
	
	@Override
	public CarteEnergieDTO getById(int id) {
		return mapper.fromEntityToDTO(dao.getReferenceById(id));
	}

}
