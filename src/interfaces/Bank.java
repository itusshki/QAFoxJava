package interfaces;

public interface Bank {

	String accountType1 = "Savings"; // static and final by default
	String accountType2 = "Current"; // static and final by default

	public void viewBalance(); // abstract method by default

	public void transferAmount(); // abstract method by default

	public void openFD(); // abstract method by default

}
