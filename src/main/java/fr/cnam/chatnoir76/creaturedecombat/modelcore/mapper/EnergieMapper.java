package fr.cnam.chatnoir76.creaturedecombat.modelcore.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cnam.chatnoir76.creaturedecombat.domain.carte.dto.CarteDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.energie.dto.CarteEnergieDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dto.CategorieDTO;
import fr.cnam.chatnoir76.creaturedecombat.model.Energie;
import fr.cnam.chatnoir76.creaturedecombat.modelcore.factory.CoreModelFactory;

@Service
public class EnergieMapper {

	@Autowired
	EnumerationMapper enumMapper;
	
	public Energie toCore(CarteEnergieDTO dto) {
		if(dto == null) return null;
		return CoreModelFactory.eINSTANCE.createEnergie(dto);
	}

	public CarteDTO toDTO(Energie carte) {
		if(carte == null) return null;
		CategorieDTO categorieDTO = enumMapper.toDTO(carte.getCategorie());
		CarteEnergieDTO dto = new CarteEnergieDTO();
		dto.setCategorie(categorieDTO.getNom());
		dto.setDescription(carte.getDescription());
		dto.setId(String.valueOf(carte.getId()));
		dto.setImage(null);
		dto.setNom(carte.getNom());
		dto.setVisible(false);
		return dto;
	}
	
}
