package fr.cnam.chatnoir76.creaturedecombat.domain.model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Categorie;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Energie;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.ModelFactory;

@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
public class EnergieTest {

	@Mock
	private Creature cAdorable;
	@Mock
	private Creature cMalefique;
	@Mock
	private Creature cMajestueux;
	@Mock
	private Creature cWTF;
	@Mock
	private Creature cClassique;
	
	@BeforeEach
	public void beforeEach() {
		when(cAdorable.getCategorie()).thenReturn(Categorie.ADORABLE);
		when(cMalefique.getCategorie()).thenReturn(Categorie.MALEFIQUE);
		when(cMajestueux.getCategorie()).thenReturn(Categorie.MAJESTUEUX);
		when(cWTF.getCategorie()).thenReturn(Categorie.WHAT_THE_FUCK);
		when(cClassique.getCategorie()).thenReturn(Categorie.CLASSIQUE);	
	}
	
	@Test
	public void adorableTest() {
		Energie eAdorable = ModelFactory.eINSTANCE.createEnergie(Categorie.ADORABLE);
		assertTrue(eAdorable.estCompatible(cAdorable));
		assertFalse(eAdorable.estCompatible(cMalefique));
		assertFalse(eAdorable.estCompatible(cMajestueux));
		assertFalse(eAdorable.estCompatible(cWTF));
		assertTrue(eAdorable.estCompatible(cClassique));
	}
	
	@Test
	public void malefiqueTest() {
		Energie eMalefique = ModelFactory.eINSTANCE.createEnergie(Categorie.MALEFIQUE);
		assertFalse(eMalefique.estCompatible(cAdorable));
		assertTrue(eMalefique.estCompatible(cMalefique));
		assertFalse(eMalefique.estCompatible(cMajestueux));
		assertFalse(eMalefique.estCompatible(cWTF));
		assertTrue(eMalefique.estCompatible(cClassique));
		
	}
	
	@Test
	public void majestueuxTest() {
		Energie eMajestueux = ModelFactory.eINSTANCE.createEnergie(Categorie.MAJESTUEUX);
		assertFalse(eMajestueux.estCompatible(cAdorable));
		assertFalse(eMajestueux.estCompatible(cMalefique));
		assertTrue(eMajestueux.estCompatible(cMajestueux));
		assertFalse(eMajestueux.estCompatible(cWTF));
		assertTrue(eMajestueux.estCompatible(cClassique));
	}
	
	@Test
	public void wtfTest() {
		Energie eWTF = ModelFactory.eINSTANCE.createEnergie(Categorie.WHAT_THE_FUCK);
		assertFalse(eWTF.estCompatible(cAdorable));
		assertFalse(eWTF.estCompatible(cMalefique));
		assertFalse(eWTF.estCompatible(cMajestueux));
		assertTrue(eWTF.estCompatible(cWTF));
		assertTrue(eWTF.estCompatible(cClassique));
	}
	
	@Test
	public void classiqueTest() {
		Energie eClassique = ModelFactory.eINSTANCE.createEnergie();
		assertTrue(eClassique.estCompatible(cAdorable));
		assertTrue(eClassique.estCompatible(cMalefique));
		assertTrue(eClassique.estCompatible(cMajestueux));
		assertTrue(eClassique.estCompatible(cWTF));
		assertTrue(eClassique.estCompatible(cClassique));
	}
	
}
