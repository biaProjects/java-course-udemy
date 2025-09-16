package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers each vector will have? ");
		int quantity = sc.nextInt();
		
		int vectorA[] = new int[quantity];
		int vectorB[] = new int[quantity];
		
		System.out.println("Type the numbers of vector A:");
		for (int i = 0; i < quantity; i++) {
			int number = sc.nextInt();
			vectorA[i] = number;
		}
		
		System.out.println("Type the numbers of vector B:");
		for (int i = 0; i < quantity; i++) {
			int number = sc.nextInt();
			vectorB[i] = number;
		}
		
		int resultant[] = new int [quantity];
		for (int i = 0; i < quantity; i++) {
			resultant[i] = vectorA[i] + vectorB[i];
		}
		
		System.out.println("RESULTANT VECTOR: ");
		for (int i = 0; i < resultant.length; i++) {
			System.out.println(resultant[i]);;
		}
		
		sc.close();
	}
}
