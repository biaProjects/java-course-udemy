package exercises;

import java.util.Locale;
import java.util.Scanner;

public class B {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("How many students do you want to check the average grade?");
		int quant = sc.nextInt();

		for (int i = 1; i <= quant; i++) {
			System.out.println("Student" + i + ":");
			
			System.out.println("#1 Grade");
			double grade1 = sc.nextDouble();
			
			System.out.println("#2 Grade");
			double grade2 = sc.nextDouble();
			
			System.out.println("#3 Grade");
			double grade3 = sc.nextDouble();

			// peso 2, peso 3 e peso 5, sucessivamente
			double media = (grade1 * 2 + grade2 * 3 + grade3 * 5) / 10;

			System.out.printf("%.1f \n", media);
		}

		sc.close();
	}
}