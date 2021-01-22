package com.qa.academy.javaproject;

public class Coins {

	public static void main(String[] args) {
		float cost = 4.58F;
		float dealt = 20.00F;
		float change = dealt - cost;
		int[] pounds = { 50, 20, 10, 5, 2, 1 };

		change *= 100;
		for (int i = 0; i < 6; i++) {
			if (change / (pounds[i] * 100) >= 1) {
				System.out.println((int) (change / (pounds[i] * 100)) + " £" + pounds[i] + " note");
				change -= (int) (change / (pounds[i] * 100)) * (pounds[i] * 100);
			}
		}
		for (int i = 0; i < 6; i++) {
			if (change / pounds[i] >= 1) {
				System.out.println((int) (change / pounds[i]) + " " + pounds[i] + "p coin");
				change -= (int) (change / pounds[i]) * pounds[i];
			}
		}
	}

}
