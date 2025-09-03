package exercises;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("How many numbers do you want to sum?");
		int quantity = sc.nextInt();

		int sum = 0;

		for (int i = 0; i < quantity; i++) {
			// i++ => i += 1
			System.out.println("Type the #" + (i + 1) + " number:");
			int x = sc.nextInt();
			sum += x;
			// System.out.println(sum);
			// imprimiria a soma parcial
		}

		System.out.println(sum);
		// imprime soma total

		sc.close();
	}
}
