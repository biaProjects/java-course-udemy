package exercises;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Type the number you want to calculate the factorial:");
		int number = sc.nextInt();
		int mult = 1;

		for (int i = 1; i <= number; i += 1) {
			mult *= i;
		}

		System.out.println(mult);

		sc.close();
	}
}
