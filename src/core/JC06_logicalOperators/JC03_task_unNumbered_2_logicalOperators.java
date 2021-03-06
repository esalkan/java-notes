package core.JC06_logicalOperators;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC03_task_unNumbered_2_logicalOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String outsideWeather;
		int Degree;
		outsideWeather = "Shinny";
		Degree = 70;

		System.out.println(
				"String outsideWeather;\n" + "int Degree;\n" + "outsideWeather = \"Shinny\";\n" + "Degree = 70;\n");

		System.out.println("True || True = True\n");
		boolean comp1 = (Degree == 70); // True
		boolean comp2 = (!(outsideWeather == "Rainy")); // True
		boolean result = (!(outsideWeather == "Rainy") || Degree == 70); // True || True = True
		System.out.println("boolean comp1 = (Degree == 70);\nResult is :" + comp1 + "\n");
		System.out.println("boolean comp2 = (!(outsideWeather==\"Rainy\")); // True\nResult is : " + comp2 + "\n");
		System.out.println(
				"boolean result = (!(outsideWeather==\"Rainy\") || Degree == 70); // True || True = True\nResult is : "
						+ result);

	}

}
