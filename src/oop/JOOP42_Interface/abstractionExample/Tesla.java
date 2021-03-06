package oop.JOOP42_Interface.abstractionExample;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Tesla extends ElectricCar {

	public Tesla(String model, double price, String color) {
		super(model, price, color);
	}

	@Override
	public void start() {
		System.out.println("Tesla starting quitely...");
		System.out.println("Change to Drive mode...");
	}

	@Override
	public void charge() {	
		System.out.println("Tesla charging - Plugin to Electric hub...");
	}

	@Override
	public void drive() {	
		System.out.println("Tesla is driving.");
	}

}
