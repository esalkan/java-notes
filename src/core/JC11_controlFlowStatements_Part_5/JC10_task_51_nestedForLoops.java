package core.JC11_controlFlowStatements_Part_5;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC10_task_51_nestedForLoops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int hours = 1; hours <= 12; hours++) {
			for (int minutes = 0; minutes <= 59; minutes++) {
				for (int seconds = 0; seconds <= 59; seconds++) {
					// System.out.println(hours+":"+minutes+":"+seconds); //window preferences run
					// debug console limit console output
					System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);

					// https://www.baeldung.com/java-printstream-printf
				}

			}
		}

	}

}
