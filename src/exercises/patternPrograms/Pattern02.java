package exercises.patternPrograms;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Pattern02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Printing Pascal’s triangle Pattern
		 * 
		 * Pascal’s triangle is a triangular array of the binomial coef cients.
		 * 
		 * It is named after Blaise Pascal.
		 * 
		 * The triangle may be constructed in the following manner: In row 0 (the
		 * topmost row), there is a unique nonzero entry 1. Each entry of each
		 * subsequent row is constructed by adding the number above and to the left with
		 * the number above and to the right, treating blank entries as 0.
		 */

		int n = 5;
		for (int i = 0; i < n; i++) {
			int number = 1;
			System.out.printf("%" + (n - i) * 2 + "s", "");
			for (int j = 0; j <= i; j++) {
				System.out.printf("%4d", number);
				number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}

}
