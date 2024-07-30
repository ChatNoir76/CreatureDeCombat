package fr.cnam.chatnoir76.creaturedecombat.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.cnam.chatnoir76.creaturedecombat.domain.energie.dto.CarteEnergieDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.energie.service.EnergieService;
import fr.cnam.chatnoir76.creaturedecombat.ui.service.HateoasService;

@RestController
@RequestMapping(value = "/energies")
public class EnergieController {

	@Autowired
	HateoasService hateoas;
	
	@Autowired
	EnergieService energieService;
	
	@GetMapping(value = "")
	public List<CarteEnergieDTO> getAllCreature() {
		List<CarteEnergieDTO> energies = energieService.getAll();
		return energies;
	}
	
	@GetMapping(value = "/{energieId}")
	public CarteEnergieDTO getEnergieById(@PathVariable("energieId") String energieId) {
		CarteEnergieDTO energie = energieService.getById(energieId);
		return energie;
	}
	
}
