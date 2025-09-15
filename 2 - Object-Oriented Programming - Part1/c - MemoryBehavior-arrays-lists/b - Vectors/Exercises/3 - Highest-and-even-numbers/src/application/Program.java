package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers will you type? ");
		int quantity = sc.nextInt();
		
		int numbers[] = new int [quantity];
		
		for (int i = 0; i < quantity; i++) {
			System.out.print("Type a number: ");
			int number = sc.nextInt();
			numbers[i] = number;
		}
		
		int even = 0;
		
		System.out.println();
		System.out.println("Even numbers:");
		
		for (int i = 0; i < numbers.length; i++) {
			if ( numbers[i] % 2 == 0 ) {
				even += 1;
				System.out.printf("%d ", numbers[i]);
			}
		}
		
		System.out.printf("%nQuantity of even numbers: %d%n", even);
		
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
