package com.qa.academy.javaproject;

import java.util.ArrayList;
import java.util.Collections;

public class Arrays {

	public static void ex1() {
		int[] array = new int[10];

		array[0] = 9;
		array[1] = 8;
		array[2] = 7;
		array[3] = 6;
		array[4] = 5;
		array[5] = 4;
		array[6] = 3;
		array[7] = 2;
		array[8] = 1;
		array[9] = 0;

		System.out.print(array[0] + ", ");
		System.out.print(array[1] + ", ");
		System.out.print(array[2] + ", ");
		System.out.print(array[3] + ", ");
		System.out.print(array[4] + ", ");
		System.out.print(array[5] + ", ");
		System.out.print(array[6] + ", ");
		System.out.print(array[7] + ", ");
		System.out.print(array[8] + ", ");
		System.out.print(array[9] + ",\n");
	}

	public static void ex2() {
		int[] array = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = 9 - i;
			System.out.print(array[i] + ", ");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			array[i] *= 10;
			System.out.print(array[i] + ", ");
		}
		System.out.println();
	}
	
	public static void enhancedEx1() {
		String[] array = {"one", "two", "three", "four", "five", "six"};
		for (String str : array) {
			System.out.print(str + ", ");
		}
		System.out.println();
	}
	
	public static void enhancedEx2() {
		int[] array = new int[20];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		
		for (int i : array) {
			System.out.print(i * i + ", ");
		}
		System.out.println();
	}
	
	public static boolean enhancedEx3(int i) {
		if (i % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void enhancedEx4() {
		int[] array = new int[20];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (i + 1) * (i + 1);
		}
		
		for (int i : array) {
			boolean parity = enhancedEx3(i);
			if (parity == true) {
				System.out.print(i * i * i + ", ");
			} else {
				System.out.print(i * i + ", ");
			}
		}
		System.out.println();
	}
	
	public static void arrayList() {
		ArrayList<String> array = new ArrayList<>();
		
		array.add("one");
		array.add("two");
		array.add("three");
		array.add("four");
		array.add("five");
		array.add("six");
		
		System.out.println(array);
		
		for (int i = 0; i < array.size(); i++) {
			System.out.print(array.get(i) + ", ");
		}
		System.out.println();
		
		for (String i : array) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		System.out.println(array.get(4));
		
		array.set(4,  "four");
		System.out.println(array.get(4));
		
		array.remove(4);
		System.out.println(array);
	}
	
	public static void collections() {
		ArrayList<String> stringArray = new ArrayList<>();
		ArrayList<Integer> intArray = new ArrayList<>();
		
		stringArray.add("one");
		stringArray.add("two");
		stringArray.add("three");
		stringArray.add("four");
		stringArray.add("five");
		stringArray.add("six");
		
		for (int i = 0; i < 6; i++) {
			if (i % 2 == 0) {
				intArray.add(i);
			} else {
				intArray.add(6 - i);
			}
		}
		
		System.out.println(stringArray);
		Collections.sort(stringArray);
		System.out.println(stringArray);
		
		System.out.println(intArray);
		Collections.sort(intArray);
		System.out.println(intArray);
		Collections.reverse(intArray);
		System.out.println(intArray);
		Collections.swap(intArray, 1, 4);
		System.out.println(intArray);
	}

	public static void main(String[] args) {
		ex1();
		ex2();
		
		enhancedEx1();
		enhancedEx2();
		System.out.println(enhancedEx3(373));
		enhancedEx4();
		
		arrayList();
		collections();
	}

}
