package core.JC06_logicalOperators;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC02_taks_unNumbered_1_logicalOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int ApplesCount = 20;
		int OrangesCount = 30;
		int PearsCount = 30;
		// compare = True || True = True
		// ( True ) || ( True )
		// result is : True
		boolean comp = ApplesCount < OrangesCount || OrangesCount >= PearsCount;

		System.out.println("//   compare = True || True = True\n"
				+ "//	       (          True          ) || (          True         )\n"
				+ "boolean comp = ApplesCount < OrangesCount || OrangesCount >= PearsCount;\n");
		System.out.println("Result is :" + comp);
	}

}
