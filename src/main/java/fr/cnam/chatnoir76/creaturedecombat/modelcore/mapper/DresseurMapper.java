package fr.cnam.chatnoir76.creaturedecombat.modelcore.mapper;

import org.springframework.stereotype.Service;

import fr.cnam.chatnoir76.creaturedecombat.domain.carte.dto.CarteDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.dresseur.dto.CarteDresseurDTO;
import fr.cnam.chatnoir76.creaturedecombat.model.Dresseur;
import fr.cnam.chatnoir76.creaturedecombat.modelcore.factory.CoreModelFactory;

@Service
public class DresseurMapper {

	public Dresseur toCore(CarteDresseurDTO dto) {
		if(dto == null) return null;
		return CoreModelFactory.eINSTANCE.createDresseur(dto);
	}

	public CarteDTO toDTO(Dresseur carte) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
