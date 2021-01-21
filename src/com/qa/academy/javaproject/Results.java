package com.qa.academy.javaproject;

public class Results {
	
	public static int Physics = 100;
	public static int Chemistry = 100;
	public static int Biology = 100;
	
	public int total;
	public int percentage;
	
	public static void resultsTotal(int P, int C, int B) {
		System.out.println("Your Physics Exam results is: " + P);
		System.out.println("Your Chemistry Exam results is: " + C);
		System.out.println("Your Biology Exam results is: " + B);
		System.out.println("Your total mark is: " + (P + C + B));
	}
	
	public static void examPercentage(int P, int C, int B) {
		System.out.println("The percentage you achived at this examination is: " + ((P + C + B)*100/450) + "%");
		
	}
	
	public static void main(String[] arg) {
		
		resultsTotal(Physics, Chemistry,Biology);
		examPercentage(Physics, Chemistry, Biology);
		
	}

}
