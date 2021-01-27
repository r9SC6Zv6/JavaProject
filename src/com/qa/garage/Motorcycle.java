package com.qa.garage;

public class Motorcycle extends Vehicle {
	int cylinderSize;
	String rideStyle;

	public Motorcycle(int id, int noOfWeels, String size, String colour, int maxSpeed, int cylinderSize,
			String rideStyle) {
		super(id, noOfWeels, size, colour, maxSpeed);
		this.cylinderSize = cylinderSize;
		this.rideStyle = rideStyle;
	}

	@Override
	public String toString() {
		return "Motorcycle [id=" + id + " cylinderSize=" + cylinderSize + ", rideStyle=" + rideStyle + ", noOfWeels=" + noOfWeels
				+ ", size=" + size + ", colour=" + colour + ", maxSpeed=" + maxSpeed + "]";
	}

}
