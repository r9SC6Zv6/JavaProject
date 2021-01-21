package com.qa.academy.javaproject;

public class BlackJack {

	public static int play(int x, int y) {
		if (x <= 21 && y <= 21) {
			if (x > y) {
				return x;
			} else if (x < y) {
				return y;
			} else {
				return 0;
			}
		} else if (x <= 21) {
			return x;
		} else if (y <= 21) {
			return y;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		System.out.println(play(19, 3));
	}

}
