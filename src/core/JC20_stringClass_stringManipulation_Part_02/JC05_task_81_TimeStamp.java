package core.JC20_stringClass_stringManipulation_Part_02;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC05_task_81_TimeStamp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * Write a method that accept the date with time and creates a timeStamp for
		 * your automation report.
		 * 
		 * String date = "10/10/2019 14:59:00"; timeStamp(date); // 10102019145900
		 */

		/**
		 * String date = "10/10/2019 14:59:00";
		 * System.out.println(date.replace("/","").replace(":", "").replace(" ", ""));
		 */

		String time = "27/1072021 09:18";
		System.out.println(timeStamp(time));
	}

	public static String timeStamp(String time) {
		time = time.replace("/", "").replace(":", "").replace(" ", "");
		return time;
	}

}
