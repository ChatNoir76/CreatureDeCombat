/**
 */
package fr.cnam.chatnoir76.creaturedecombat.domain.model;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.CalculDegat;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Degat;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.ModelFactory;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.TypeDegat;

@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
public class DegatTest {

	@Mock
	private Creature creature_100;
	@Mock
	private Creature creature_10;
	
	private final static int DEGAT_30 = 30;
	private final static int DEGAT_50 = 50;
	private final static int PV_ATTAQUANT = 100;
	private final static int PV_DEFENSEUR = 10;
	
	@BeforeEach
	public void beforeEach() {
		when(creature_100.getPv()).thenReturn(PV_ATTAQUANT);
		when(creature_10.getPv()).thenReturn(PV_DEFENSEUR);
	}
	
	private void calculDegat(Degat degat, int attendu) {
		int value = degat.getCalculDegat(creature_100, creature_10);
		assertTrue(value == attendu, "GetDegat donne %d au lieu de %d".formatted(value, attendu));
	}
	
	private void calculDegat(Degat degat, int min, int max) {
		int value = degat.getCalculDegat(creature_100, creature_10);
		assertTrue(value >= min && value<=max, "GetDegat donne %d au d'être entre %d et %d".formatted(value, min,  max));
	}
	
	@Test
	public void stableBaseTest() {
		Degat stable = ModelFactory.eINSTANCE.createDegat();
		stable.setChanceRattage(0);
		stable.setIncertitude(0);
		stable.setDegat(DEGAT_30);
		stable.setType(TypeDegat.ATTAQUE);
		stable.setModeCalcul(CalculDegat.BASE);
		calculDegat(stable, DEGAT_30);
		
		stable.setType(TypeDegat.DEFENSE);
		calculDegat(stable, DEGAT_30 * -1);
	}
	
	@Test
	public void variableBaseTest() {
		int incertitude = 10;
		Degat variable = ModelFactory.eINSTANCE.createDegat();
		variable.setChanceRattage(0);
		variable.setIncertitude(incertitude);
		variable.setDegat(DEGAT_30);
		variable.setType(TypeDegat.ATTAQUE);
		variable.setModeCalcul(CalculDegat.BASE);
		
		for(int i = 0; i<20;i++) {
			calculDegat(variable, DEGAT_30-incertitude, DEGAT_30+incertitude);
		}
		
		variable.setType(TypeDegat.DEFENSE);
		for(int i = 0; i<20;i++) {
			calculDegat(variable, DEGAT_30*-1-incertitude, DEGAT_30*-1+incertitude);
		}
	}
	
	@Test
	public void rattageBaseTest() {
		Degat rattage = ModelFactory.eINSTANCE.createDegat();
		rattage.setChanceRattage(100);
		rattage.setIncertitude(0);
		rattage.setDegat(DEGAT_30);
		rattage.setType(TypeDegat.ATTAQUE);
		rattage.setModeCalcul(CalculDegat.BASE);
		calculDegat(rattage, 0);
	}
	
	@Test
	public void stableRatioTest() {
		Degat stable = ModelFactory.eINSTANCE.createDegat();
		stable.setChanceRattage(0);
		stable.setIncertitude(0);
		stable.setDegat(DEGAT_50);
		stable.setType(TypeDegat.ATTAQUE);
		stable.setModeCalcul(CalculDegat.RATIO_ATTAQUANT);
		calculDegat(stable, 50);

		stable.setModeCalcul(CalculDegat.RATIO_DEFENSEUR);
		calculDegat(stable, 5);
		
	}
	
	@Test
	public void variableRatioTest() {
		int incertitude = 10;
		Degat variable = ModelFactory.eINSTANCE.createDegat();
		variable.setChanceRattage(0);
		variable.setIncertitude(incertitude);
		variable.setDegat(DEGAT_50);
		variable.setType(TypeDegat.ATTAQUE);
		variable.setModeCalcul(CalculDegat.RATIO_ATTAQUANT);
		
		
		for(int i = 0; i<20;i++) {
			calculDegat(variable, DEGAT_50-incertitude, DEGAT_50+incertitude);
		}
		
		variable.setType(TypeDegat.DEFENSE);
		for(int i = 0; i<20;i++) {
			calculDegat(variable, DEGAT_50*-1-incertitude, DEGAT_50*-1+incertitude);
		}
		
	}
	
	@Test
	public void rattageRatioTest() {
		Degat rattage = ModelFactory.eINSTANCE.createDegat();
		rattage.setChanceRattage(100);
		rattage.setIncertitude(0);
		rattage.setDegat(DEGAT_30);
		rattage.setType(TypeDegat.ATTAQUE);
		rattage.setModeCalcul(CalculDegat.RATIO_ATTAQUANT);
		calculDegat(rattage, 0);
	}

}
