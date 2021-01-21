package com.qa.academy.javaproject;

public class Coins {

	public static void main(String[] args) {
		double cost = 4.58;
		double dealt = 20.00;
		double change = dealt - cost;
		int[] pounds = { 50, 20, 10, 5, 2, 1 };

		for (int i = 0; i < 6; i++) {
			if (change / pounds[i] >= 1) {
				System.out.println((int) (change / pounds[i]) + " £" + pounds[i] + " note");
				change -= (int) (change / pounds[i]) * pounds[i];
			}
		}
		change *= 100;
		for (int i = 0; i < 6; i++) {
			if (change / pounds[i] >= 1) {
				System.out.println((int) (change / pounds[i]) + " " + pounds[i] + "p coin");
				change -= (int) (change / pounds[i]) * pounds[i];
			}
		}
	}

}
