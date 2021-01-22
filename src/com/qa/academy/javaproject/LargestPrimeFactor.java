package com.qa.academy.javaproject;

public class LargestPrimeFactor {

	public static int largestPrimeFactor(int p) {
		for (int i = p; i >= 2; i--) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}
			if (i < 2) {
				isPrime = false;
			}
			if (isPrime == true && p % i == 0) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		System.out.println(largestPrimeFactor(455));
		
	}
	
}
