package exceptionHandling;

public class arithmeticException {

	public static void main(String[] args) {

		System.out.println("******Before Exception******");
		try {
			int a = 10 / 0;
		} catch (Exception e) {
			System.out.println("Exception is handled here ");
			System.out.println(e.getMessage());
		}
		System.out.println("******After Exception******");
	}
}
