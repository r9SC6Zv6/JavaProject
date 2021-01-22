package com.qa.academy.javaproject;

public class PackageRiceBags {

	public static boolean packageRiceBags(int rice, int smallBag) {
		if (smallBag >= rice % 5) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int minPackageRiceBags(int rice, int smallBag) {
		if (smallBag < rice % 5) {
			return -1;
		} else {
			return rice % 5;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(packageRiceBags(43, 2));
		System.out.println(minPackageRiceBags(43, 7));
		
	}
	
}
