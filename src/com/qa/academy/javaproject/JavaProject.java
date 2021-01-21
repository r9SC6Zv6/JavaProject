package com.qa.academy.javaproject;

public class JavaProject {
	
	public static int a = 7;
	public static int b = 5;
	
	public static int addition(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int multiplication(int num1, int num2) {
		return num1 * num2;
	}
	
	public static int substraction(int num1, int num2) {
		return num1 - num2;
	}
	
	public static double division(double num1, double num2) {
		return num1 / num2;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(addition(a,b));
		System.out.println(multiplication(a,b));
		System.out.println(substraction(a,b));
		System.out.println(division(a,b));
		
	}

}
