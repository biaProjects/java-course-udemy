package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;  // so we can use the class Triangle

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y; // ctrl + shift + o  --> import
		x = new Triangle(); // instantiating
		y = new Triangle(); // instantiating
		
		System.out.println("Enter the measure of triangle X:");
		x.sideA = sc.nextDouble();
		x.sideB = sc.nextDouble();
		x.sideC = sc.nextDouble();
		
		System.out.println("Enter the measure of triangle Y:");
		y.sideA = sc.nextDouble();
		y.sideB = sc.nextDouble();
		y.sideC = sc.nextDouble();
		
		double p = (x.sideA + x.sideB + x.sideC) / 2;
		double areaX = Math.sqrt(p * (p - x.sideA) * (p - x.sideB) * (p - x.sideC));
		
		p = (y.sideA + y.sideB + y.sideC) / 2;
		double areaY = Math.sqrt(p * (p - y.sideA) * (p - y.sideB) * (p - y.sideC));
		
		System.out.printf("Triangle X area: %.4f %n", areaX);
		System.out.printf("Triangle Y area: %.4f %n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
	}
}

