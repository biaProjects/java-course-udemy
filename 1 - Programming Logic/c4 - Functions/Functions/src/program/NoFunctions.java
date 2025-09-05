// let's do a program that read 3 numbers and print the highest

package program;

import java.util.Scanner;

public class NoFunctions {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Type three numbers and we will check which is the highest.");

		System.out.println("The #1: ");
		int number1 = sc.nextInt();
		System.out.println("The #2: ");
		int number2 = sc.nextInt();
		System.out.println("The #3: ");
		int number3 = sc.nextInt();

		int highest = number1;

		if (number2 > highest)
			highest = number2;
		if (number3 > highest)
			highest = number3;

		System.out.println("Highest: " + highest);

		sc.close();

	}
}
