package com.qa.garage;

import java.util.ArrayList;

public class Garage {

	static ArrayList<Vehicle> vehicles = new ArrayList<>();

	public static void printList() {
		for (Vehicle i : vehicles) {
			System.out.println(i.toString());
		}
	}

	public static void calcualteBill(int searchId) {
		int cost = 0;
		for (Vehicle i : vehicles) {
			int multiplyer = 1;

			switch (i.size) {
			case "Large":
				multiplyer = 10;
				break;
			case "Medium":
				multiplyer = 7;
				break;
			case "Small":
				multiplyer = 5;
				break;
			}
			if (i.id == searchId) {
				if (i.getClass().getName().endsWith("Car")) {
					cost = 4 * multiplyer * i.noOfWeels;
				} else if (i.getClass().getName().endsWith("Motorcycle")) {
					cost = 2 * multiplyer * i.noOfWeels;
				} else if (i.getClass().getName().endsWith("Tractor")) {
					cost = 7 * multiplyer * i.noOfWeels;
				}
			}
		}
		System.out.println("The total bill for vehicle with id " + searchId + " is £" + cost + ".");
	}

	public static void addVehicle(int id, int noOfWeels, String size, String colour, int maxSpeed, boolean hasAC,
			int noOfDoors) {
		vehicles.add(new Car(id, noOfWeels, size, colour, maxSpeed, hasAC, noOfDoors));
	}

	public static void addVehicle(int id, int noOfWeels, String size, String colour, int maxSpeed, int cylinderSize,
			String rideStyle) {
		vehicles.add(new Motorcycle(id, noOfWeels, size, colour, maxSpeed, cylinderSize, rideStyle));
	}

	public static void addVehicle(int id, int noOfWeels, String size, String colour, int maxSpeed, String powerLevel,
			boolean hadPoweredAttachment) {
		vehicles.add(new Tractor(id, noOfWeels, size, colour, maxSpeed, powerLevel, hadPoweredAttachment));
	}

	public void removeVehicle(int searchId) {
		for (Vehicle i : vehicles) {
			if (i.id == searchId) {
				vehicles.remove(i);
			}
		}
	}

	public void removeVehicle(String vehicleType) {
		for (Vehicle i : vehicles) {
			if (i.getClass().getName().endsWith(vehicleType)) {
				vehicles.remove(i);
			}
		}
	}

	public void emptyGarage() {
		vehicles.clear();
	}

}
