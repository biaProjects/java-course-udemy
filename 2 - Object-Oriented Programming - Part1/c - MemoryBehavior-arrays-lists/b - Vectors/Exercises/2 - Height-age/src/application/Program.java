package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.print("How many people will you register? ");
		int quantity = sc.nextInt();
		
		Person people[] = new Person[quantity];
		
		for (int i = 0; i < quantity; i++) {
			System.out.printf("Informations of #%d person: %n", i+1);
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Age: ");
			int age = sc.nextInt();
			System.out.print("Height: ");
			double height = sc.nextDouble();
			
			Person person = new Person(name, age, height);
			people[i] = person;
			
			System.out.println();
		}
		
		double sumHeight = 0.0;
		double youngerThan16 = 0;
		for (int i = 0; i < people.length; i++) {
			sumHeight += people[i].getHeight();
			
			if ( people[i].getAge() < 16 ) {
				youngerThan16 += 1;
			}
		}
		
		double averageHeight = sumHeight / people.length;
		youngerThan16 = youngerThan16 / people.length * 100;
		
		System.out.println();
		System.out.printf("Average height: %.2f %n", averageHeight);
		System.out.print("Percentage of people younger than 16: ");
		System.out.printf("%.1f", youngerThan16);
		System.out.println("%");
		
		for (int i = 0; i < people.length; i++) {
			System.out.println("They are:");
			if ( people[i].getAge() < 16 ) {
				System.out.println(people[i].getName());
			}
		}
		
		sc.close();
	}

}