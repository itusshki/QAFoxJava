package Inheritance;

public class Car {

	String carModel;
	int speed;

	public Car(String carModel, int speed) {
		this.carModel = carModel;
		this.speed = speed;
	}

	public void startCar() {
		System.out.println(carModel + " Car has been Started");
	}

	public void speedCar() {
		System.out.println("Current Car speed " + speed);
	}

	public void stopCar() {
		System.out.println(carModel + " Car has been Stopped");
	}

}
