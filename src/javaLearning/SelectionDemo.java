package javaLearning;

public class SelectionDemo {

	public static void main(String[] args) {

		int a = 88, b = 55, c = 44, d = 33;

		if (a < b) {
			System.out.println("A is greater than B");
		} else if (b > c) {
			System.out.println("B is less than C");
		} else if (c < d) {
			System.out.println("C is less than D");
		} else {
			System.out.println("All above conditions are false");
		}
	}
}
