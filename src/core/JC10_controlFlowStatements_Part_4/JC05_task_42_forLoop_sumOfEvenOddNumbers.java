package core.JC10_controlFlowStatements_Part_4;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC05_task_42_forLoop_sumOfEvenOddNumbers {

	/**
	 * @param args
	 */

	// Write a program that displays sum of even and odd numbers between 1 and 100
	// exluding 100
	public static void main(String[] args) {

		int sumEven = 0;
		int sumOdd = 0;

		for (int i = 1; i < 100; i++) {
			if (i % 2 == 0) {

				sumEven = sumEven + i;

			} else {

				sumOdd = sumOdd + i;

			}
		}

		System.out.println("Sum of even numbers : " + sumEven);
		System.out.println("Sum of odd numbers : " + sumOdd);

	}

}
