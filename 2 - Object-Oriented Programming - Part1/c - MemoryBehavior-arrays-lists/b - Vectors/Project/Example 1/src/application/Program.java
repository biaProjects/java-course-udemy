package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many people will you register the heights?");		
		int quantity = sc.nextInt();
		
		double[] height_vect = new double[quantity];
		
		for (int i = 0; i < quantity; i++) {
			height_vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for (int i = 0; i < quantity; i+=1) {
			sum += height_vect[i];
		}
		
		double average = sum / quantity;
		
		System.out.printf("Average height = %.2f%n", average);
		
		sc.close();
	}
}
