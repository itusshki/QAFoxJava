package javaLearning;

public class WrapperClass {
	public static void main(String[] args) {
		int a = 9;
		Integer obj;

		obj = a;

		System.out.println(a); // Output => 9
		System.out.println(obj); // Output => 9

		@SuppressWarnings("removal")
		Integer obj2 = new Integer(8);
		int x;

		x = obj2;

		System.out.println(obj2); // Output => 8
		System.out.println(x); // Output => 8
	}
}
