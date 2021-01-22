package com.qa.academy.javaproject;

public class GreatestCommonDivisor {

	public static int gcd(int x, int y) {
		for (int i = Integer.min(x, y); i > 0; i--) {
			if (x % i == 0 && y % i == 0) {
				return i;
			}
		}
		return 1;
	}
	
	public static void main(String[] args) {
		System.out.println(gcd(372, 174));
	}
	
}
