package core.JC13_methods_Part_1;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC15_task_61_ageCalculator {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ageCalculator(int currentYear,int birthyear)
		ageCalculator(2019, 1965);
		ageCalculator(2019, 1875);
	}

	public static void ageCalculator(int currentYear, int birthyear) {
		int age = currentYear - birthyear;
		System.out.println(age);
	}
}
