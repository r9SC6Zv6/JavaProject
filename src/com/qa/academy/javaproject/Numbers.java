package com.qa.academy.javaproject;

public class Numbers {

	public static void sumDigits() {
		for (int i = 10; i < 100; i++) {
			System.out.println(i / 10 + i % 10);
		}
	}

	public static void intToString(int x) {
		int decPlaceCounter = 1;
		String textRep = "";

		while (x > 0) { // Remove the last digit from int in each iteration
			String decPlace = "";
			String textDigit = "";
			// Get the last digit of int
			int digit = x % 10; 

			// Choose the decimal place text
			switch (decPlaceCounter) {
			case 1:
				decPlace = "";
				break;
			case 2:
				decPlace = "ty";
				break;
			case 3:
				decPlace = "hundred";
				break;
			case 4:
				decPlace = "thousand";
				break;
			}

			// Choose the digit text
			switch (digit) {
			case 0:
				textDigit = "";
				break;
			case 1:
				textDigit = "one";
				break;
			case 2:
				textDigit = "two";
				break;
			case 3:
				textDigit = "three";
				break;
			case 4:
				textDigit = "four";
				break;
			case 5:
				textDigit = "five";
				break;
			case 6:
				textDigit = "six";
				break;
			case 7:
				textDigit = "seven";
				break;
			case 8:
				textDigit = "eight";
				break;
			case 9:
				textDigit = "nine";
				break;
			}

			// Place "-" between digits where needed
			if (decPlaceCounter >= 2 && !textRep.isEmpty() && digit != 1) {
				textRep = "-" + textRep;
			}
			
			// Check for grammatical exceptions then prepend new digit text
			// to front of text representation
			if (decPlaceCounter == 2 && digit == 1) {
				if (textRep.isEmpty()) {
					textRep = "ten";
				} else if (textRep.contains("one")) {
					textRep = "eleven";
				} else if (textRep.contains("two")) {
					textRep = "twelve";
				} else if (textRep.contains("three")) {
					textRep = "thirteen";
				} else if (textRep.contains("five")) {
					textRep = "fifteen";
				} else {
					textRep = textRep + "teen";
				}
			} else if (digit == 0) {
				;
			} else if (decPlaceCounter == 2 && digit == 2) {
				textRep = "twenty" + textRep;
			} else if (decPlaceCounter == 2 && digit == 3) {
				textRep = "thirty" + textRep;
			} else if (decPlaceCounter == 2 && digit == 5) {
				textRep = "fifty" + textRep;
			} else {
				textRep = textDigit + decPlace + textRep;
			}
			x = x / 10;
			decPlaceCounter++;
		}
		System.out.println(textRep);
	}
	
	public static void loopIntToString() {
		for (int i = 1; i <= 100; i++) {
			intToString(i);
		}
	}

	public static void main(String[] args) {
//		sumDigits();
//		intToString(2021);
		loopIntToString();
	}

}
