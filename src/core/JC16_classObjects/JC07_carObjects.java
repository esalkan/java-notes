package core.JC16_classObjects;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC07_carObjects {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JC02_carClass car1 = new JC02_carClass();

		car1.printCarInfo();

		car1.make = "Ford";
		car1.model = "Fiesta";
		car1.color = "Grey";
		car1.currentSpeed = 55;

		car1.printCarInfo();

		car1.showCurrentSpeed(70);
		car1.showCurrentSpeed(35);

		car1.drive();

		System.out.println("before:" + car1.currentSpeed);

		car1.accelerate(20);

		System.out.println("after: " + car1.currentSpeed);

	}

}
