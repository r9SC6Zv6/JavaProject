package com.qa.academy.javaproject;

public class Numbers {

	public static void sumDigits() {
		for (int i = 10; i < 100; i++) {
			System.out.println(i / 10 + i % 10);
		}
	}
	
	public static void intToString(int x) {
		while (x > 0) {
			
			x = x / 10;
		}
	}
	
	public static void main(String[] args) {
//		sumDigits();
		intToString(9876);
	}
	
}
