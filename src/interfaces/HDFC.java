package interfaces;

public class HDFC implements Bank {

	@Override
	public void viewBalance() {
		System.out.println("HDFC View Balance");
	}

	@Override
	public void transferAmount() {
		System.out.println("HDFC Transfer Amount");
	}

	@Override
	public void openFD() {
		System.out.println("HDFC Open Fixed Deposit");
	}

	public void checkInterestRates() {
		System.out.println("HDFC Check Loan Interest Rates");
	}
}
