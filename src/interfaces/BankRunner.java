package interfaces;

public class BankRunner {

	public static void main(String[] args) {
		Bank bank;

		HDFC account = new HDFC();

		bank = account;

		account.viewBalance();
		account.transferAmount();
		account.openFD();
		account.checkInterestRates();

		bank.viewBalance();
		bank.transferAmount();
		bank.openFD();
		// bank.checkInterestRates(); // Using the interface reference variables, we can
		// now access only the methods
		// which are declared in the interface

		System.out.println(Bank.accountType1);
		System.out.println(Bank.accountType2);
	}
}try block