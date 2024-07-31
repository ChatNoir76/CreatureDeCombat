package fr.cnam.chatnoir76.creaturedecombat.core.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cnam.chatnoir76.creaturedecombat.core.factory.CoreModelFactory;
import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.dto.AttaqueDTOFull;
import fr.cnam.chatnoir76.creaturedecombat.model.Attaque;

@Service
public class AttaqueMapper {
	
	@Autowired
	DegatMapper degatMapper;

	public Attaque toCore(AttaqueDTOFull dto) {
		if(dto == null) return null;
		Attaque attaque = CoreModelFactory.eINSTANCE.createAttaque(dto);
		attaque.setDegatAttaque(degatMapper.toCore(dto.getDegatDTO()));
		return attaque;
	}
	
}
