package fr.cnam.chatnoir76.creaturedecombat.modelcore.mapper;

import org.springframework.stereotype.Service;

import fr.cnam.chatnoir76.creaturedecombat.domain.degat.dto.DegatDTO;
import fr.cnam.chatnoir76.creaturedecombat.model.Degat;
import fr.cnam.chatnoir76.creaturedecombat.modelcore.factory.CoreModelFactory;

@Service
public class DegatMapper {

	public Degat toCore(DegatDTO dto) {
		if(dto == null) return null;
		return CoreModelFactory.eINSTANCE.createDegat(dto);
	}
	
}
