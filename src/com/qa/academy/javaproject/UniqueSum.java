package com.qa.academy.javaproject;

public class UniqueSum {
	
	public static int Input(int x, int y, int z) {
		int sum = 0;
		if (x != y && x != z) {
			sum += x;
		}
		if (x != y && y != z) {
			sum += y;
		}
		if (x != z && y != z) {
			sum += z;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(Input(1,2,3));
		System.out.println(Input(1,2,2));
		System.out.println(Input(1,1,1));
	}

}
