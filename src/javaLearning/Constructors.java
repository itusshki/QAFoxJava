package javaLearning;

public class Constructors {

	public static void main(String[] args) {

		Cars ford = new Cars("Fiesta", "Purple", 700000, 19);
		Cars mahindra = new Cars("Scorpio", "Black", 1700000, 14);
		Cars tata = new Cars("Safari", "Navy Blue", 1900000, 15);

		ford.carDetails();
		mahindra.carDetails();
		tata.carDetails();
	}
}

class Cars {

	String model;
	String color;
	int cost;
	double mileage;

	// This is a constructor
	public Cars(String model, String color, int cost, double mileage) {
		this.model = model;
		this.color = color;
		this.cost = cost;
		this.mileage = mileage;
	}

	public void carDetails() {

		System.out.println("Car Name: " + model);
		System.out.println("Car Color: " + color);
		System.out.println("Car Cost: " + cost);
		System.out.println("Car Mileage: " + mileage);
		System.out.println("===================");

	}
}
