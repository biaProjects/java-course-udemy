package program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("We will verify if two numbers are multiples.");

		int number1, number2;
		System.out.println("Type the first number (you don't need to worry about the order)");
		number1 = sc.nextInt();
		System.out.println("Now, type the other number");
		number2 = sc.nextInt();

		if (number1 % number2 == 0 || number2 % number1 == 0) {
			System.out.println("Multiples");
		} else {
			System.out.println("Not multiples");
		}

		sc.close();

	}
}
