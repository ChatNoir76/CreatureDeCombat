package fr.cnam.chatnoir76.creaturedecombat.core.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cnam.chatnoir76.creaturedecombat.domain.carte.dto.CarteDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CarteCreatureDTOFull;
import fr.cnam.chatnoir76.creaturedecombat.domain.dresseur.dto.CarteDresseurDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.energie.dto.CarteEnergieDTO;
import fr.cnam.chatnoir76.creaturedecombat.model.Carte;

@Service
public class CarteMapper {

	@Autowired
	CreatureMapper creatureMapper;
	
	@Autowired
	EnergieMapper energieMapper;
	
	@Autowired
	DresseurMapper dresseurMapper;
	
	public Carte toCore(CarteDTO dto) {
		if(dto == null) return null;
		if(dto instanceof CarteCreatureDTOFull) {
			return creatureMapper.toCore((CarteCreatureDTOFull) dto);
		} else if(dto instanceof CarteEnergieDTO) {
			return energieMapper.toCore((CarteEnergieDTO) dto);
		} else if(dto instanceof CarteDresseurDTO) {
			return dresseurMapper.toCore((CarteDresseurDTO) dto);
		} else {
			return null;
		}
	}
	
}
