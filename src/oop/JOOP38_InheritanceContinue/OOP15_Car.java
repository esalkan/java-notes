package oop.JOOP38_InheritanceContinue;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class OOP15_Car extends OOP14_Vehicle {

	int maxSpeed = 180;

	public void display() {
		// That will take the maxSpeed value from _14_Vehicle Class instance variable
		// and print it. How it is taken it? _14_Vehicle is extended to _15_Car and with
		// super.methodName or super.variableName we can call it.
		System.out.println("Maximum Speed : " + super.maxSpeed);

		// That will take the maxSpeed value from the _15_Car class instance variable
		System.out.println("Maximum Speed : " + maxSpeed);
	}

}
