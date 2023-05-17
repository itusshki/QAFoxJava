package javaLearning;

public class temp {

	static int a = 5;

	double b = 6.73;

	char c = 's';

	boolean d = true;

	String str = "This is a sample text";
	/*
	 * This is a instance variable which has been declared by static keyword, so
	 * that we can call it in static methods
	 */

	public static void main(String[] args) {
		System.out.println(a);
		randomMethod();
	}

	public static void randomMethod() {
		System.out.println(a);
	}
}
