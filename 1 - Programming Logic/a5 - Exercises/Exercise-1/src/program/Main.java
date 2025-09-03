package program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Type the number you want to verify if it's positive or not and if it's even or odd");

		int number = sc.nextInt();

		if (number >= 0) {
			System.out.println("Positive");
		} else {
			System.out.println("Negative");
		}
		
		if (number % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

		sc.close();

	}
}
