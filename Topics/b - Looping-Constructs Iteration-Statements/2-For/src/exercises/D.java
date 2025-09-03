package exercises;

import java.util.Scanner;

public class D {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Type the number you want to check the divisors:");
		int number = sc.nextInt();

		for (int i = 1; i <= number; i += 1) {
			double div = number % i;
			if (div == 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}
}

// 6. leia um numero e calcule todos os seus divisores