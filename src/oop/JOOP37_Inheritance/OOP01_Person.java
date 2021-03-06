package oop.JOOP37_Inheritance;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class OOP01_Person {

	// Main, General, Parent Class
	public String name; // public
	int age; // default
	char gender;

	// Parent Class Methods
	public void eat(String food) {
		System.out.println(name + " is eating " + food);
	}

	public void walk() {
		System.out.println(name + " is walking");
	}

	public void sleep(int hours) {
		System.out.println(name + " is sleeping for " + hours + " hours");
	}
}
