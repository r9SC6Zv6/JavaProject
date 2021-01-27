package com.qa.garage;

public class Runner {

	public static void main(String[] args) {
		
		Garage.addVehicle(1, 3, "Small", "Green", 200, false, 2);
		Garage.addVehicle(2, 6, "Large", "Grey", 50, "High", true);

		Garage.printList();
		Garage.calcualteBill(1);
	}

}
