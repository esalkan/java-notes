package core.JC18_readingUserInput;

import java.util.Scanner;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC06_task_73_guessingGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int userInput;
		int secretNumber = 8;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number:");
		do {

			userInput = sc.nextInt();

			if (userInput < secretNumber) {
				System.out.print("Enter a bigger number:");
			} else if (userInput > secretNumber) {
				System.out.print("Enter a smaller number:");
			} else {
				System.out.print("Congrat you got it...");
			}

		} while (userInput != secretNumber);
	}

}
