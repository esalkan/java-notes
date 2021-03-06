package oop.JOOP38_InheritanceContinue;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class OOP11_FullTimeEmployee extends OOP10_Employee {

	// Override the method from Parent Class _10_Employee
	@Override
	void calculatePay(int hours, double rate) {
		double total = (hours * rate) * 1.05;
		System.out.println("FullTime Employee Total Pay : " + total);
	}

}
