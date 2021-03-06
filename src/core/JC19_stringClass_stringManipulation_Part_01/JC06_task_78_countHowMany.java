package core.JC19_stringClass_stringManipulation_Part_01;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC06_task_78_countHowMany {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * Write a program to count the number of occurrences for specific char String
		 * word = "abcabqcabc” Number of a in this string is: 3
		 */

		String word = "abcabqacbaqfeacse";
		int counter = 0;

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'a') {
				counter++;
			}
		}

		System.out.println("Count for " + "\'" + word + "\' is : " + counter);

	}

}
