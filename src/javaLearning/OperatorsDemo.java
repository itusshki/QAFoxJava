package javaLearning;

public class OperatorsDemo {

	public static void main(String[] args) {

		// Arithmetic Operators

		int a = 10, b = 5;

		System.out.println(a + b); // Prints the addition of two numbers
		System.out.println(a - b); // Prints the subtraction of two numbers
		System.out.println(a * b); // Prints the multiplication of two numbers
		System.out.println(a / b); // Prints the division of two numbers
		System.out.println(a % b); // Prints the reminder of division
		System.out.println(++a); // Increments the value by 1 and prints it
		System.out.println(--b); // Decrements the value by 1 and prints it

		// Relational Operators

		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);

		// Logical Operators

		System.out.println(true && true);
		System.out.println(false || true);
		System.out.println(!true);

		// Assignment Operators

		int c = 8;
		System.out.println(c);

		int d = 5;
		d += 7;
		System.out.println(d);

		int e = 10;
		e -= 3;
		System.out.println(e);

		int f = 12;
		f *= 2;
		System.out.println(f);

		int g = 15;
		g /= 3;
		System.out.println(g);

		int h = 7;
		h %= 4;
		System.out.println(h);

		// Conditional Operator

		String s = (10 > 5) ? "Greater" : "Smaller";
		System.out.println(s);

		int p = (1 > 5) ? 6 : 9;
		System.out.println(p);

	}

}