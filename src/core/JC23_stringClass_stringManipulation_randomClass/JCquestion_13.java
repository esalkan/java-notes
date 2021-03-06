package core.JC23_stringClass_stringManipulation_randomClass;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JCquestion_13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * Given a string, return a string where for every char in the original, there
		 * are two chars.
		 * 
		 * doubleChar("The") → "TThhee"
		 * 
		 * doubleChar("AAbb") → "AAAAbbbb" doubleChar("Hi-There") → "HHii--TThheerree"
		 */

		String str = "Hi-there";

		String newString = "";

		for (int i = 0; i < str.length(); i++) {
			newString = newString + str.substring(i, i + 1).concat(str.substring(i, i + 1));
		}

		System.out.println(newString);
	}
}
