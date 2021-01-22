package com.qa.academy.javaproject;

public class FizzBuzz {

	public static String fizzBuzz(int x) {
		String string = "";
		if (x % 3 == 0) {
			string = "Fizz";
		}
		if (x % 5 == 0) {
			string = string + "Buzz";
		}
		if (string.isEmpty()) {
			string = String.valueOf(x);
		}
		return string;
	}
	
	public static void main(String[] args) {
		System.out.println(fizzBuzz(7));
		System.out.println(fizzBuzz(5));
		System.out.println(fizzBuzz(15));
	}
	
}
