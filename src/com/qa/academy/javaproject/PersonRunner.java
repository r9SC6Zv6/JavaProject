package com.qa.academy.javaproject;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonRunner {

	public static void main(String[] args) {

		ArrayList<Person> persons = new ArrayList<>();
		persons.add(new Person("Akane", 23, "Software Engineer"));
		persons.add(new Person("Daisuke", 54, "Shef"));
		persons.add(new Person("Chitose", 32, "Receptionist"));
		
		menu(persons);
		
	}
	
	public static Person search(ArrayList<Person> persons, String name) {
		
		for (Person i : persons) {
			if (i.name.equals(name))
				return i;
		}
		return null;
		
	}
	
	public static void menu(ArrayList<Person> persons) {
		Scanner scan = new Scanner(System.in);
		boolean quit = false;
		while (!quit) {
			System.out.println("Please choose from the following options by entering:");
			System.out.println("  1  to create a person");
			System.out.println("  2  to list all people");
			System.out.println("  3  to search for a person");
			System.out.println("  any other number to quit");
			System.out.print("now: ");
			
			int option = scan.nextInt();
			
			switch (option) {
			case 1:
				System.out.print("Please enter new person's name: ");
				String name = scan.next();
				System.out.print("Please enter new person's age: ");
				int age = scan.nextInt();
				System.out.print("Please enter new person's job title: ");
				String jobTitle = scan.next();
				
				persons.add(new Person(name, age, jobTitle));
				break;
			case 2:
				for (Person i : persons) {
					System.out.println(i.toString());
				}
				break;
			case 3:
				System.out.print("Please enter a name to seach for: ");
				String nameSearch = scan.next();
				System.out.println(search(persons, nameSearch));
				break;
			default:
				quit = true;
				break;
			}
			System.out.println();
		}
		scan.close();
	}

}
