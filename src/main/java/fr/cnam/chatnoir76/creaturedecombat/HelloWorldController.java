package fr.cnam.chatnoir76.creaturedecombat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import fr.cnam.chatnoir76.creaturedecombat.model.CalculDegat;
import fr.cnam.chatnoir76.creaturedecombat.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.model.Degat;
import fr.cnam.chatnoir76.creaturedecombat.model.ModelFactory;

@RestController
public class HelloWorldController {

	@GetMapping("/")
	public ModelAndView index() {
		
		Degat stable_30 = ModelFactory.eINSTANCE.createDegat();
		stable_30.setChanceRattage(0);
		stable_30.setIncertitude(0);
		stable_30.setDegat(30);
		stable_30.setModeCalcul(CalculDegat.BASE);
		
		Creature c = ModelFactory.eINSTANCE.createCreature();
		c.setNom("Créaturindex");
		c.setPv(30);
		
		stable_30.getCalculDegat(c, c);
		
		return new ModelAndView("index", "creature", c);
	}
}
