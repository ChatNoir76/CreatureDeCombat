package fr.cnam.chatnoir76.creaturedecombat.modelcore.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cnam.chatnoir76.creaturedecombat.domain.degat.dto.DegatDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dto.CalculDegatDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dto.TypeDegatDTO;
import fr.cnam.chatnoir76.creaturedecombat.model.Degat;
import fr.cnam.chatnoir76.creaturedecombat.modelcore.factory.CoreModelFactory;

@Service
public class DegatMapper {

	@Autowired
	EnumerationMapper enumMapper;
	
	public Degat toCore(DegatDTO dto) {
		if(dto == null) return null;
		return CoreModelFactory.eINSTANCE.createDegat(dto);
	}
	
	public DegatDTO toDTO(Degat degat) {
		if(degat == null) return null;
		TypeDegatDTO typeDegat = enumMapper.toDTO(degat.getType());
		CalculDegatDTO calculDegat = enumMapper.toDTO(degat.getModeCalcul());
		
		DegatDTO dto = new DegatDTO();
		dto.setDegat(degat.getDegat());
		dto.setId(String.valueOf(degat.getId()));
		dto.setMode(calculDegat.getNom());
		dto.setPrecision(degat.getIncertitude());
		dto.setRattage(degat.getChanceRattage());
		dto.setType(typeDegat.getNom());
		return dto;
	}
	
}
