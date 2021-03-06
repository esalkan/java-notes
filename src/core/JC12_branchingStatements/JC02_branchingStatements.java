package core.JC12_branchingStatements;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC02_branchingStatements {

	/**
	 * @param args
	 */

	/*
	 * BRANCHING STATEMENTS
	 *
	 * break : This keyword causes the termination of the loop and tells the
	 * interpreter to go onto the next statement of code outside of the loop.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int number = 0;

		while (number < 15) {

			number++;

			if (number <= 5) {

				System.out.println("Skipping number " + number);

				continue;
			}

			System.out.println("number = " + number);

			if (number >= 10) {

				System.out.println("Breaking at " + number);

				break;
			}
		}
	}

}
