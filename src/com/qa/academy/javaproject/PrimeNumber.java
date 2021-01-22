package com.qa.academy.javaproject;

public class PrimeNumber {

	public static boolean primeNumber(int p) {
		boolean isPrime = true;
		for (int i = 2; i < p; i++) {
			if (p % i == 0) {
				isPrime = false;
			}
		}
		if (p < 2) {
			isPrime = false;
		}
		return isPrime;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(i + " " + primeNumber(i));
		}
	}
	
}
