package core.reviews.week_08;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class _01_ArrayListPractice {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		/**
		 * create a method, listGenerator(), when I call this method, it will prompt the
		 * user to enter a number And it will ask again?, if the answer NO, then will
		 * return an ArrayList
		 */

		System.out.println(listGenerator());

	}

	public static ArrayList<Integer> listGenerator() {

		Scanner scan = new Scanner(System.in); // created a local scanner object which is only good inside this method

		ArrayList<Integer> list = new ArrayList<>(); // create an empty list so we can put user inputs

		while (true) {
			System.out.println("Enter a number");
			list.add(scan.nextInt());

			System.out.println("Do you want to enter another number?");
			String response = scan.next();
			if (response.toLowerCase().equals("no")) {
				break;
			}
		}
		return list;
	}

}
