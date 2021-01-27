package com.qa.garage;

public class Car extends Vehicle {

	boolean hasAC;
	int noOfDoors;

	public Car(int id, int noOfWeels, String size, String colour, int maxSpeed, boolean hasAC, int noOfDoors) {
		super(id, noOfWeels, size, colour, maxSpeed);
		this.hasAC = hasAC;
		this.noOfDoors = noOfDoors;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + " hasAC=" + hasAC + ", noOfDoors=" + noOfDoors + ", noOfWeels=" + noOfWeels + ", size=" + size
				+ ", colour=" + colour + ", maxSpeed=" + maxSpeed + "]";
	}

}
