package javaLearning;

public class Person {
	String name;
	int age;
	double weight;

	public Person() {
		System.out.println("This is blank Constructor");
	}

	public Person(int age) {
		this.age = age;
		System.out.println("This is overloaded constructor with parameter age " + age);
	}

	public Person(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;

		System.out.println(
				"This is overloaded constructor with multiple parameters " + name + " " + " " + age + " " + weight);
	}

	public void personDetaills() {
		System.out.println("Name of the Person is " + name);
		System.out.println("Age of the Person is " + age);
		System.out.println("Weight of the Person is " + weight);
	}
}
