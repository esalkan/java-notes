package core.JC21_stringClass_stringManipulation_Part_03;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC04_String_trim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * trim() Method
		 * 
		 * --> trim() method removes whitespaces from both ends of a string.
		 */

		String str = " 342 "; // |342|
		System.out.println("|" + str.trim() + "|");

		System.out.println();

		String str1 = "     Programming is fun";
		System.out.println(str1.trim());

		String str2 = "Programming is fun     ";
		System.out.println(str2.trim());

		String str3 = "     Programming is fun     ";
		System.out.println(str3.trim());

		String str4 = "  Prog   ramm     ing is fun     ";
		System.out.println(str4.trim());
	}

}
