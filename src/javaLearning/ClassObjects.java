package javaLearning;

public class ClassObjects {

	public static void main(String[] args) {
		Car ford = new Car();
		Car mahindra = new Car();
		Car tata = new Car();

		ford.model = "Fiesta - TDCI";
		ford.color = "Purple";
		ford.cost = 700000;

		ford.startCar();
		ford.stopCar();
		ford.carDetails();

		mahindra.model = "Scorpio";
		mahindra.color = "Black";
		mahindra.cost = 1400000;

		mahindra.startCar();
		mahindra.stopCar();
		mahindra.carDetails();

		tata.model = "Safari";
		tata.color = "Navy Blue";
		tata.cost = 1700000;

		tata.startCar();
		tata.stopCar();
		tata.carDetails();

	}
}

class Car {

	String model;
	String color;
	int cost;

	void startCar() {
		System.out.println("~~~~~~~~~~~~~~~~");
		System.out.println(model + " Car Started");
	}

	void stopCar() {

		System.out.println(model + " Car Stopped");
	}

	void carDetails() {

		System.out.println("Car Name: " + model);
		System.out.println("Car Color: " + color);
		System.out.println("Car Cost: " + cost);
		System.out.println("===================");

	}
}