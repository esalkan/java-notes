package core.reviews.week_05;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class S05_StringReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String name = "JAVA";
		// creating a dummy string is best practice

		String reverse = "";

		reverse += name.charAt(3); // name.length()-1
		reverse += name.charAt(2);
		reverse += name.charAt(1);
		reverse += name.charAt(0);

		System.out.println(reverse);

//		My solution
//		String name = "Java";
//		int length = name.length()-1;
//		for (int i = length; i >= 0; i--) {
//			System.out.print(name.charAt(i));
//		}

		String str = "Java Programmin Is Awesome Language";
		String reverseResult = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseResult += str.charAt(i);
		}

		System.out.println(reverseResult);

		System.out.println("\n--- reverse() method created ---");
		System.out.println(reverse(str));

		System.out.println("\n--- stringCustomMethod() method created ---");

		// String reversedFromClassMethod = S06_StringCustomMethod.reverse(str);
		// System.out.println(reversedFromClassMethod);

	}

	public static String reverse(String str) {

		String reverseResult = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverseResult += str.charAt(i);
		}

		return reverseResult;
	}

}
