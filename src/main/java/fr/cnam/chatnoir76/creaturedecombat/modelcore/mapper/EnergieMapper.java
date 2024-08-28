package fr.cnam.chatnoir76.creaturedecombat.modelcore.mapper;

import org.springframework.stereotype.Service;

import fr.cnam.chatnoir76.creaturedecombat.domain.energie.dto.CarteEnergieDTO;
import fr.cnam.chatnoir76.creaturedecombat.model.Energie;
import fr.cnam.chatnoir76.creaturedecombat.modelcore.factory.CoreModelFactory;

@Service
public class EnergieMapper {

	public Energie toCore(CarteEnergieDTO dto) {
		if(dto == null) return null;
		return CoreModelFactory.eINSTANCE.createEnergie(dto);
	}
	
}
