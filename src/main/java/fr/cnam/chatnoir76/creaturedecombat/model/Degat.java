package fr.cnam.chatnoir76.creaturedecombat.model;

import java.util.Random;

// This interface overrides the generated interface and will be returned by factory
public interface Degat extends GenDegat
{
	/**
	 * @return True si pas de rattage
	 */
	default boolean processRattage() {
		int rattage = getRandomBetween(0, 99);
		return rattage >= this.getChanceRattage();
	}

	default int processPrecision(int degat) {
		return getRandomBetween(degat - this.getIncertitude(), degat + this.getIncertitude());
	}
	
	default int getRandomBetween(int lowValue, int highValue) {
		Random random = new Random();
		return random.nextInt(highValue - lowValue + 1) + lowValue;
	}
}
