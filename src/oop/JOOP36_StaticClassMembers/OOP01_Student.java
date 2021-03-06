package oop.JOOP36_StaticClassMembers;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class OOP01_Student {

	// Instanvce Variables
	String name;
	int age;
	int idNumber;

	// A static variable
	static String school = "Middle East Technical University";

	// Constructor with parameter
	public OOP01_Student(String name, int age, int idNumber) {
		this.name = name;
		this.age = age;
		this.idNumber = idNumber;
	}

	@Override
	public String toString() {
		return "_01_Student [name=" + name + ", age=" + age + ", idNumber=" + idNumber + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
