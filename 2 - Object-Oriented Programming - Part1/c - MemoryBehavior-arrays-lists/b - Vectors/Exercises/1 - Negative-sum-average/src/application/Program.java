package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers will you type? ");
		int quantity = sc.nextInt();
		
		double vect[] = new double [quantity];
		
		double sum = 0.0;
		
		for (int i = 0; i<quantity; i++) {
			System.out.print("Type a number: ");
			int number = sc.nextInt();
			vect[i] = number;
			sum += number;
		}
		
		
		System.out.print("Numbers typed: ");
		for (int i = 0; i < vect.length; i++) {
			System.out.print(vect[i] + " ");
		}
		System.out.println();
		
		
		System.out.println();
		System.out.println("NEGATIVE NUMBERS");
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		
		double average = sum/quantity;
		System.out.println();
		
		System.out.printf("SUM = %.1f %n", sum);
		System.out.printf("Average = %.2f %n", average);
		
		sc.close();
	}

}
