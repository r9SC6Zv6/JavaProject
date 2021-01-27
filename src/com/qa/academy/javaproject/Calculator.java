package com.qa.academy.javaproject;

import java.util.Scanner;

public class Calculator {

	public static int a = 7;
	public static int b = 5;
	private static Scanner userInput;

	public static void addition(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	public static void multiplication(int num1, int num2) {
		System.out.println(num1 * num2);
	}

	public static void subtraction(int num1, int num2) {
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

//		addition(a, b);
//		multiplication(a, b);
//		subtraction(a, b);
//		division(a, b);
		
		userInput = new Scanner(System.in);
		
		System.out.println("Please choose the operation by entering: ");
		System.out.println("  +  for addition");
		System.out.println("  -  for subtraction");
		System.out.println("  *  for multiplication");
		System.out.println("  /  for division");
		System.out.print("here: ");
		
		String operation = userInput.next();
		
		System.out.print("Now enter the first number: ");
		int a = userInput.nextInt();
		
		System.out.print("And the second number: ");
		int b = userInput.nextInt();
		
		System.out.print("The solution is: ");
		
		switch (operation) {
		case "+":
			addition(a ,b);
			break;
		case "-":
			subtraction(a, b);
			break;
		case "*":
			multiplication(a, b);
			break;
		case "/":
			division(a, b);
			break;
		default:
			System.out.println("Invalid operation");
		}
	}

}
