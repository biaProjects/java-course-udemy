// let's do a program that read 3 numbers and print the highest

package program;

import java.util.Scanner;

public class WithFunctions {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Type three numbers and we will check which is the highest.");

		System.out.println("The #1: ");
		int number1 = sc.nextInt();
		System.out.println("The #2: ");
		int number2 = sc.nextInt();
		System.out.println("The #3: ");
		int number3 = sc.nextInt();

		// let's use our functions:
		int higher = max(number1, number2, number3);

		showResult(higher);

		sc.close();
	}

	public static int max(int x, int y, int z) {
		int aux; // local variable (it only exists in this function scope - and so is x, y, z)
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}

		return aux;
	}

	// let's create another one, just to print the result
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
}
