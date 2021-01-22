package com.qa.academy.javaproject;

public class ExamResults {

	public static int Physics = 100;
	public static int Chemistry = 100;
	public static int Biology = 10;

	public static void resultsTotal(int P, int C, int B) {
		int total = P + C + B;
		System.out.println("Your Physics Exam results is: " + P);
		System.out.println("Your Chemistry Exam results is: " + C);
		System.out.println("Your Biology Exam results is: " + B);
		System.out.println("Your total mark is: " + total);

	}

	public static void examPercentage(int P, int C, int B) {
		int percentage = (P + C + B) * 100 / 450;
		System.out.println("The percentage you achived at this examination is: " + percentage + "%");
		if (percentage < 60) {
			System.out.print("You failed.");
		}
	}

	public static void failMessage(int P, int C, int B) {

		int subjectsFailedCounter = 0;
		if (P < 90) {
			subjectsFailedCounter++;
		}
		if (C < 90) {
			subjectsFailedCounter++;
		}
		if (B < 90) {
			subjectsFailedCounter++;
		}
		if (subjectsFailedCounter > 0) {
			System.out.print(" Because you failed " + subjectsFailedCounter + " subject");
			if (subjectsFailedCounter > 1) {
				System.out.println("s.");
			} else {
				System.out.println(".");
			}
		}
	}

	public static void main(String[] arg) {

		resultsTotal(Physics, Chemistry, Biology);
		examPercentage(Physics, Chemistry, Biology);
		failMessage(Physics, Chemistry, Biology);

	}

}
