package core.JC07_controlFlowStatements_if_ifElse_Part_1;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC03_smallTasks_task_2_ifStatement2 {

	/**
	 * @param args
	 */

	// Write an if statement that multiplies pay rate by 1.5 if hours is greater
	// than 40

	public static void main(String[] args) {
		double payRate = 1250;
		int hours = 45;

		if (hours > 40) {
			payRate = payRate * 1.5;
		}

		System.out.println("Payrate is : " + payRate);

	}

}
