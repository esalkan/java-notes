package core.JC07_controlFlowStatements_if_ifElse_Part_1;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC02_smallTasks_task_1_ifStatement2 {

	/**
	 * @param args
	 */

	// Write an if statement that assigns 5 to x when y is equal to 20

	public static void main(String[] args) {
		
		int x, y;
		x = 10;
		y = 10;

		if (y == 20) {
			x = 5;
		}

		System.out.println("x = " + x + " y = " + y);
	}

}
