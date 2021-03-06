package core.JC17_classObjects_Part_2;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC04_capitalOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JC03_bankAccountClass acc1 = new JC03_bankAccountClass();

		// Assign Account Holder
		acc1.accountHolder = "Eyüp Sabri ALKAN";

		// Assign the Account Number
		acc1.accountNumber = 620981291;

		// Put some cash to the account (deposit)
		acc1.deposit(250);

		// Printing Account Informations
		acc1.showBalance();

		// Withdraw Some Cash From The Bank
		acc1.withdraw(100);

		// Printing Account Informations
		acc1.showBalance();

		// Purchase a book
		System.out.println("Purchase something : ");
		acc1.charge(50, "book");

		acc1.showBalance();
	}

}
