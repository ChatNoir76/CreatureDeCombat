package fr.cnam.chatnoir76.creaturedecombat.domain.model;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import fr.cnam.chatnoir76.creaturedecombat.model.Attaque;
import fr.cnam.chatnoir76.creaturedecombat.model.Categorie;
import fr.cnam.chatnoir76.creaturedecombat.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.model.Degat;
import fr.cnam.chatnoir76.creaturedecombat.model.Energie;
import fr.cnam.chatnoir76.creaturedecombat.model.ModelFactory;

@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
public class AttaqueTest {

	@Mock
	private Degat degat_20;
	@Mock
	private Degat degat_50;
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
	
	private EList<Energie> energie_Adorable = new BasicEList<Energie>();
	private EList<Energie> energie_Malefique = new BasicEList<Energie>();
	private EList<Energie> energie_Majestueux = new BasicEList<Energie>();
	private EList<Energie> energie_WTF = new BasicEList<Energie>();
	private EList<Energie> energie_Classique = new BasicEList<Energie>();
	
	@BeforeEach
	public void beforeEach() {
		when(cAdorable.getCategorie()).thenReturn(Categorie.ADORABLE);
		when(cMalefique.getCategorie()).thenReturn(Categorie.MALEFIQUE);
		when(cMajestueux.getCategorie()).thenReturn(Categorie.MAJESTUEUX);
		when(cWTF.getCategorie()).thenReturn(Categorie.WHAT_THE_FUCK);
		when(cClassique.getCategorie()).thenReturn(Categorie.CLASSIQUE);
	}
	
	@Test
	public void attaqueTest() {
//		Base attaquant_base = ModelFactory.eINSTANCE.createBase();
//		attaquant_base.setNom("Creature_Base_Nom");
//		attaquant_base.setDescription("Creature_Base_Description");
//		attaquant_base.setPvInit(100);
//		attaquant_base.setCategorie(Categorie.ADORABLE);
//		Creature attaquant = ModelFactory.eINSTANCE.createCreature(attaquant_base);
//		
//		Base defenseur_base = ModelFactory.eINSTANCE.createBase();
//		defenseur_base.setNom("Creature_Base_Nom");
//		defenseur_base.setDescription("Creature_Base_Description");
//		defenseur_base.setPvInit(150);
//		defenseur_base.setCategorie(Categorie.MALEFIQUE);
//		defenseur_base.setDegatDefense(degat_20);
//		Creature defenseur = ModelFactory.eINSTANCE.createCreature(defenseur_base);
//		
//		when(degat_20.getCalculDegat(any(Creature.class), any(Creature.class))).thenReturn(20);
//		when(degat_50.getCalculDegat(any(Creature.class), any(Creature.class))).thenReturn(50);
//
//		Attaque attaque = ModelFactory.eINSTANCE.createAttaque();
//		attaque.setDegatAttaque(degat_50);
//		attaque.attaque(attaquant, defenseur);
//		
//		assertTrue(attaquant.getPv() == 80);
//		assertTrue(defenseur.getPv() == 100);
	}
	
	@Test
	public void estDisponibleTest() {
		when(cAdorable.getEnergies()).thenReturn(energie_Adorable);
		when(cMalefique.getEnergies()).thenReturn(energie_Malefique);
		when(cMajestueux.getEnergies()).thenReturn(energie_Majestueux);
		when(cWTF.getEnergies()).thenReturn(energie_WTF);
		when(cClassique.getEnergies()).thenReturn(energie_Classique);
		
		Attaque attaque = ModelFactory.eINSTANCE.createAttaque();
		attaque.setCategorie(Categorie.ADORABLE);
		attaque.setBesoinEnergieAutre(0);
		attaque.setBesoinEnergieCategorie(0);
		
		assertTrue(attaque.estDisponible(cAdorable));
		assertTrue(attaque.estDisponible(cMalefique));
		assertTrue(attaque.estDisponible(cMajestueux));
		assertTrue(attaque.estDisponible(cWTF));
		assertTrue(attaque.estDisponible(cClassique));
		
		energie_Adorable.add(ModelFactory.eINSTANCE.createEnergie(Categorie.ADORABLE));
		energie_Malefique.add(ModelFactory.eINSTANCE.createEnergie(Categorie.MALEFIQUE));
		energie_Majestueux.add(ModelFactory.eINSTANCE.createEnergie(Categorie.MAJESTUEUX));
		energie_WTF.add(ModelFactory.eINSTANCE.createEnergie(Categorie.WHAT_THE_FUCK));
		energie_Classique.add(ModelFactory.eINSTANCE.createEnergie(Categorie.CLASSIQUE));
		attaque.setBesoinEnergieAutre(1);
		attaque.setBesoinEnergieCategorie(0);
		
		assertTrue(attaque.estDisponible(cAdorable));
		assertTrue(attaque.estDisponible(cMalefique));
		assertTrue(attaque.estDisponible(cMajestueux));
		assertTrue(attaque.estDisponible(cWTF));
		assertTrue(attaque.estDisponible(cClassique));
		
		attaque.setBesoinEnergieAutre(0);
		attaque.setBesoinEnergieCategorie(1);
		
		assertTrue(attaque.estDisponible(cAdorable));
		assertFalse(attaque.estDisponible(cMalefique));
		assertFalse(attaque.estDisponible(cMajestueux));
		assertFalse(attaque.estDisponible(cWTF));
		assertFalse(attaque.estDisponible(cClassique));
		
		energie_Adorable.add(ModelFactory.eINSTANCE.createEnergie(Categorie.ADORABLE));
		energie_Malefique.add(ModelFactory.eINSTANCE.createEnergie(Categorie.MALEFIQUE));
		energie_Majestueux.add(ModelFactory.eINSTANCE.createEnergie(Categorie.MAJESTUEUX));
		energie_WTF.add(ModelFactory.eINSTANCE.createEnergie(Categorie.WHAT_THE_FUCK));
		energie_Classique.add(ModelFactory.eINSTANCE.createEnergie(Categorie.CLASSIQUE));
		attaque.setBesoinEnergieAutre(1);
		attaque.setBesoinEnergieCategorie(1);
		
		assertTrue(attaque.estDisponible(cAdorable));
		assertFalse(attaque.estDisponible(cMalefique));
		assertFalse(attaque.estDisponible(cMajestueux));
		assertFalse(attaque.estDisponible(cWTF));
		assertFalse(attaque.estDisponible(cClassique));
		
		energie_Adorable.add(ModelFactory.eINSTANCE.createEnergie(Categorie.ADORABLE));
		energie_Malefique.add(ModelFactory.eINSTANCE.createEnergie(Categorie.ADORABLE));
		energie_Majestueux.add(ModelFactory.eINSTANCE.createEnergie(Categorie.ADORABLE));
		energie_WTF.add(ModelFactory.eINSTANCE.createEnergie(Categorie.ADORABLE));
		energie_Classique.add(ModelFactory.eINSTANCE.createEnergie(Categorie.ADORABLE));
		attaque.setBesoinEnergieAutre(2);
		attaque.setBesoinEnergieCategorie(1);
		
		assertTrue(attaque.estDisponible(cAdorable));
		assertTrue(attaque.estDisponible(cMalefique));
		assertTrue(attaque.estDisponible(cMajestueux));
		assertTrue(attaque.estDisponible(cWTF));
		assertTrue(attaque.estDisponible(cClassique));
		
		attaque.setBesoinEnergieAutre(2);
		attaque.setBesoinEnergieCategorie(2);
		
		assertFalse(attaque.estDisponible(cAdorable));
		assertFalse(attaque.estDisponible(cMalefique));
		assertFalse(attaque.estDisponible(cMajestueux));
		assertFalse(attaque.estDisponible(cWTF));
		assertFalse(attaque.estDisponible(cClassique));
	}
	
	@Test
	public void estCompatibleTest() {
		Attaque attaque = ModelFactory.eINSTANCE.createAttaque();
		
		attaque.setCategorie(Categorie.ADORABLE);
		assertTrue(attaque.estCompatible(cAdorable));
		assertFalse(attaque.estCompatible(cMalefique));
		assertFalse(attaque.estCompatible(cMajestueux));
		assertFalse(attaque.estCompatible(cWTF));
		assertFalse(attaque.estCompatible(cClassique));
		
		attaque.setCategorie(Categorie.MALEFIQUE);
		assertFalse(attaque.estCompatible(cAdorable));
		assertTrue(attaque.estCompatible(cMalefique));
		assertFalse(attaque.estCompatible(cMajestueux));
		assertFalse(attaque.estCompatible(cWTF));
		assertFalse(attaque.estCompatible(cClassique));
		
		attaque.setCategorie(Categorie.MAJESTUEUX);
		assertFalse(attaque.estCompatible(cAdorable));
		assertFalse(attaque.estCompatible(cMalefique));
		assertTrue(attaque.estCompatible(cMajestueux));
		assertFalse(attaque.estCompatible(cWTF));
		assertFalse(attaque.estCompatible(cClassique));
		
		attaque.setCategorie(Categorie.WHAT_THE_FUCK);
		assertFalse(attaque.estCompatible(cAdorable));
		assertFalse(attaque.estCompatible(cMalefique));
		assertFalse(attaque.estCompatible(cMajestueux));
		assertTrue(attaque.estCompatible(cWTF));
		assertFalse(attaque.estCompatible(cClassique));
		
		attaque.setCategorie(Categorie.CLASSIQUE);
		assertTrue(attaque.estCompatible(cAdorable));
		assertTrue(attaque.estCompatible(cMalefique));
		assertTrue(attaque.estCompatible(cMajestueux));
		assertTrue(attaque.estCompatible(cWTF));
		assertTrue(attaque.estCompatible(cClassique));
	}
	
}
