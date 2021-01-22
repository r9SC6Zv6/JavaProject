package com.qa.academy.javaproject;

public class Taxes {
	// Tax calculations are threshold based and the tax percentage is not directly
	// applied to the final salary, so the exercise doesn't make much sense but
	// here it goes.

	// Returns the final percentage of tax after thresholds for the given salary.
	// Not pretty but just following instructions.
	public static double taxPercentageCalc(double salary) {
		if (salary < 15000) {
			return 0;
		} else if (salary < 20000) {
			return (1 - 15000 / salary) * 10 / 100;
		} else if (salary < 30000) {
			return (1 - 15000 / salary - (1 - 20000 / salary)) * 10 / 100 + (1 - 20000 / salary) * 15 / 100;
		} else if (salary < 45000) {
			return (1 - 15000 / salary - (1 - 20000 / salary)) * 10 / 100
					+ (1 - 20000 / salary - (1 - 30000 / salary)) * 15 / 100 + (1 - 30000 / salary) * 20 / 100;
		} else {
			return (1 - 15000 / salary - (1 - 20000 / salary)) * 10 / 100
					+ (1 - 20000 / salary - (1 - 30000 / salary)) * 15 / 100
					+ (1 - 30000 / salary - (1 - 45000 / salary)) * 20 / 100 + (1 - 45000 / salary) * 25 / 100;
		}
	}

	// Multiplies salary with its final tax percentage. Not accurate due to
	// truncation errors.
	public static int taxCalc(int salary) {
		return (int) (salary * taxPercentageCalc(salary));
	}

	// I much simpler calculator doing the same job more accurately.
	public static int muchBetterCalc(int salary) {
		if (salary >= 45000) {
			return 5000 + (salary - 45000) * 25 / 100;
		} else if (salary >= 30000) {
			return 2000 + (salary - 30000) * 20 / 100;
		} else if (salary >= 20000) {
			return 500 + (salary - 20000) * 15 / 100;
		} else if (salary >= 15000) {
			return (salary - 15000) * 10 / 100;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {

		int salary = 23500;

		System.out.println(taxCalc(salary));
		System.out.println(muchBetterCalc(salary));

	}

}
