package oop.JOOP34_Constructors_PassingObjectsToMethods;

import java.util.Random;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class OOP05_Dice {

	int sides;
	int value;

	public OOP05_Dice(int numSides) {
		sides = numSides;
		roll();
	}

	public void roll() {
		Random rand = new Random();
		value = rand.nextInt(sides) + 1;
	}

	public int getSides() {
		return sides;
	}

	public int getValue() {
		return value;
	}
}
