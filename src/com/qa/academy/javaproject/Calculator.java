package com.qa.academy.javaproject;

public class Calculator {

	public static int a = 7;
	public static int b = 5;

	public static void addition(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	public static void multiplication(int num1, int num2) {
		System.out.println(num1 * num2);
	}

	public static void substraction(int num1, int num2) {
		System.out.println(num1 - num2);
	}

	public static void division(double num1, double num2) {
		if (num1 < num2) {
			System.out.println(num1 / num2);
		}
		else {
			System.out.println("The division cannot be performed, due to the sipmle reason that I've been told so!");
		}
	}

	public static void main(String[] args) {

		addition(a, b);
		multiplication(a, b);
		substraction(a, b);
		division(a, b);

	}

}
