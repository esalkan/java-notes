package exercises.questionsANDanswers.qa01_test01;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Question_16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// What will be the output of this code?

		boolean b1 = false;
		boolean b2 = false;

		if ((b2 = b1) == false) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
