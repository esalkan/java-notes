package oop.JOOP35_Encapsulation;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class OOP02_Carpet {

	/**
	 * Write a class with the name Carpet. The class needs one field (instance
	 * variable) with name cost of type double.
	 * 
	 * The class needs to have one constructor with parameter cost of type double
	 * and it needs to initialize the field.
	 * 
	 * In case the cost parameter is less than 0 it needs to set the cost field
	 * value to o.
	 * 
	 * 
	 */

	double cost;

	public OOP02_Carpet(double cost) {

		if (cost < 0) {

			this.cost = 0;

		} else {

			this.cost = cost;

		}
	}

	public double getCost() {
		return cost;
	}
}
