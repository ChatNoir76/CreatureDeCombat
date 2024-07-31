package fr.cnam.chatnoir76.creaturedecombat.core.mapper;

import org.springframework.stereotype.Service;

import fr.cnam.chatnoir76.creaturedecombat.core.factory.CoreModelFactory;
import fr.cnam.chatnoir76.creaturedecombat.domain.dresseur.dto.CarteDresseurDTO;
import fr.cnam.chatnoir76.creaturedecombat.model.Dresseur;

@Service
public class DresseurMapper {

	public Dresseur toCore(CarteDresseurDTO dto) {
		if(dto == null) return null;
		return CoreModelFactory.eINSTANCE.createDresseur(dto);
	}
	
}
