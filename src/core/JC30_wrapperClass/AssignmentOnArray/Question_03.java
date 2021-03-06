package core.JC30_wrapperClass.AssignmentOnArray;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Question_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Below is One-dimensional array code:
		 * 
		 * char arr [] = new char[] {'A', 'Z', 'B', 'N', 'P', 'T', 'X', 'C'};
		 * 
		 * Write the code to search for particular character in above array. If I search
		 * for 'B', then output should be: "B found!" If I search for 'E', then output
		 * should be: "E Not found!"
		 */

		char arr[] = new char[] { 'A', 'Z', 'B', 'N', 'P', 'T', 'X', 'C' };
		Character search = 'C';

		for (Character value : arr) {
			if (value.equals(search)) {
				System.out.println(value + " Found!");
				return;
			}
		}

		System.out.println(search + " Not Found!.");

	}

}
