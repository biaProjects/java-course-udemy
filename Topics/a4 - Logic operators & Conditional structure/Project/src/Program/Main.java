package Program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("How old are you?");
		int age;
		age = sc.nextInt();

		if (age >= 120 || age < 0)
			System.out.println("Are you sure you typed the right age?");
		// When you have only 1 command, the {} is optional
		else {
			if (age >= 60) {
				System.out.println("You are elderly");
			} else {
				if (age >= 18) {
					System.out.println("You are of age");
				} else if (age < 18) {
					// it's possible to put the "else" and "if" together
					System.out.println("You are underage");
				}
			}
		}
		
		sc.close();
	}
}