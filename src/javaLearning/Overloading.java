package javaLearning;

public class Overloading {

	public static void main(String[] args) {

		Person ent = new Person("Tusshar", 32, 74.4);
		ent.personDetaills();

	}

	public void methodA() {
		System.out.println("This is method without parameter");
	}

	public void methodA(int a) {
		System.out.println("This is overloaded method with parameter");
	}

	public void methodA(String s, int a, double d) {
		System.out.println("This is overloaded method with parameters");
	}

}
