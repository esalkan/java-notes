package exercises.questionsANDanswers.qa01_test01;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Question_19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// What will be the output of this code?

		int var1 = 12;
		int var2 = 21;

		if (var1 != var2) {
			System.out.println("var1 is not equal to var2");
			if (var1 > var2) {
				System.out.println("var1 is greater than var2");
			} else {
				System.out.println("var2 is greater than var1");
			}
		} else {
			System.out.println("var1 is equal to var2");
		}
	}

}
