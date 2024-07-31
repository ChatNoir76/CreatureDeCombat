package fr.cnam.chatnoir76.creaturedecombat.core.mapper;

import org.springframework.stereotype.Service;

import fr.cnam.chatnoir76.creaturedecombat.core.factory.CoreModelFactory;
import fr.cnam.chatnoir76.creaturedecombat.domain.energie.dto.CarteEnergieDTO;
import fr.cnam.chatnoir76.creaturedecombat.model.Energie;

@Service
public class EnergieMapper {

	public Energie toCore(CarteEnergieDTO dto) {
		if(dto == null) return null;
		return CoreModelFactory.eINSTANCE.createEnergie(dto);
	}
	
}
