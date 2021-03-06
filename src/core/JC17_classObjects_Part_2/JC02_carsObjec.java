package core.JC17_classObjects_Part_2;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC02_carsObjec {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JC01_bmw b1 = new JC01_bmw();
		JC01_bmw b2 = new JC01_bmw();

		// We assign to default value "BMW"
		// and it will printed
		System.out.println("Default Make for b1 : " + b1.make);
		System.out.println("Default Make for b2 : " + b2.make);

		// Now we assing new value to make as shown below
		System.out.println();
		b1.make = "2021 BMW";
		// it will print new value as "2021 BMW"
		System.out.println("B1 Make : " + b1.make);

		// It will print default value "BMW"
		System.out.println();
		System.out.println("B2 Make : " + b2.make);

		System.out.println();
		System.out.println("Default B1 Model : " + b1.model);
		// Assign a model to b1
		b1.model = "m3";
		// In switch case already for m3 price assigned and that will print the price
		// for m3 model.
		b1.showPrice();
		System.out.println("Assigned model for b1 : " + b1.model);
	}

}
