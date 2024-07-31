package fr.cnam.chatnoir76.creaturedecombat.core.mapper;

import org.springframework.stereotype.Service;

import fr.cnam.chatnoir76.creaturedecombat.core.factory.CoreModelFactory;
import fr.cnam.chatnoir76.creaturedecombat.domain.degat.dto.DegatDTO;
import fr.cnam.chatnoir76.creaturedecombat.model.Degat;

@Service
public class DegatMapper {

	public Degat toCore(DegatDTO dto) {
		if(dto == null) return null;
		return CoreModelFactory.eINSTANCE.createDegat(dto);
	}
	
}
