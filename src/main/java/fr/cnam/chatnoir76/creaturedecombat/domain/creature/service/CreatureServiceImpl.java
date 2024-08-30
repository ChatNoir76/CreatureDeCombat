package fr.cnam.chatnoir76.creaturedecombat.domain.creature.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.dao.AttaqueDAO;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dao.CreatureDAO;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CarteCreatureDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.entity.CreatureEntity;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dao.CategorieDAO;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dao.NiveauDAO;
import fr.cnam.chatnoir76.creaturedecombat.sequence.IdSequenceService;
import jakarta.transaction.Transactional;

@Service
@Transactional
@Validated
public class CreatureServiceImpl implements CreatureService {

	@Autowired
	CreatureDAO dao;
	
	@Autowired
	CategorieDAO categorieDAO;
	
	@Autowired
	AttaqueDAO attaqueDAO;
	
	@Autowired
	NiveauDAO niveauDAO;
	
	private final CreatureDTOMapper mapper = CreatureDTOMapper.INSTANCE;
	
	@Autowired
    IdSequenceService idSequenceService;

	@Override
	public CarteCreatureDTO getById(String id) {
		if(id == null) return null;
		int creatureId = Integer.valueOf(id);
		if(creatureId < 1) return null;
		return mapper.fromEntityToDTO(dao.getReferenceById(Integer.valueOf(id)));
	}

	@Override
	public List<CarteCreatureDTO> getAll() {
		return dao.findAll().stream().map(entity -> {
			return mapper.fromEntityToDTO(entity);
		}).toList();
	}

	@Override
	public CarteCreatureDTO save(CarteCreatureDTO dto) {
		int newId = idSequenceService.nextCreatureId();
		dto.setId(String.valueOf(newId));
		CreatureEntity entity = mapper.fromDTOToEntity(dto);
		entity.setCategorie(categorieDAO.findById(Integer.valueOf(dto.getCategorieId())).get());
		entity.setNiveau(niveauDAO.findById(Integer.valueOf(dto.getNiveauId())).get());
		entity.setAttaques(dto.getAttaqueIds().stream().map(id -> attaqueDAO.getReferenceById(id)).collect(Collectors.toSet()));
		if(dto.getIdCreatureBase() != null && Integer.valueOf(dto.getNiveauId()) != 1) {
			entity.setCreatureBase(dao.getReferenceById(Integer.valueOf(dto.getIdCreatureBase())));
		}
		return mapper.fromEntityToDTO(dao.saveAndFlush(entity));
	}

	@Override
	public CarteCreatureDTO update(CarteCreatureDTO dto) {
		dto.setId(dto.getId());
		CreatureEntity entity = mapper.fromDTOToEntity(dto);
		entity.setCategorie(categorieDAO.findById(Integer.valueOf(dto.getCategorieId())).get());
		entity.setNiveau(niveauDAO.findById(Integer.valueOf(dto.getNiveauId())).get());
		entity.setAttaques(dto.getAttaqueIds().stream().map(id -> attaqueDAO.getReferenceById(id)).collect(Collectors.toSet()));
		if(dto.getIdCreatureBase() != null && Integer.valueOf(dto.getNiveauId()) != 1) {
			entity.setCreatureBase(dao.getReferenceById(Integer.valueOf(dto.getIdCreatureBase())));
		}
		return mapper.fromEntityToDTO(dao.saveAndFlush(entity));
	}

	@Override
	public boolean delete(CarteCreatureDTO dto) {
		CreatureEntity entity = mapper.fromDTOToEntity(dto);
		try {
			dao.delete(entity);
			return true;
		} catch (Exception e) {
			return false;
		}

	}
	
}
