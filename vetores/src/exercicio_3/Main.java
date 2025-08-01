package exercicio_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers will you type? ");
		int quantity = sc.nextInt();
		
		double numbers[] = new double [quantity];
		
		for (int i = 0; i < quantity; i++) {
			System.out.print("Type a number: ");
			double number = sc.nextDouble();
			numbers[i] = number;
		}
		
		double highest = numbers[0];
		int position = 0;
		for (int i = 0; i < numbers.length; i++) {
			if ( numbers[i] > highest ) {
				highest = numbers[i];
				position = i;
			}
		}
		
		System.out.println();
		System.out.println("Highest value: " + highest);
		System.out.println("Highest value position: " + position);
		
		sc.close();
	}

}
