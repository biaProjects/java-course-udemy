package program;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the measure of triangle X:");
		double sideAX = sc.nextDouble();
		double sideBX = sc.nextDouble();
		double sideCX = sc.nextDouble();
		
		System.out.println("Enter the measure of triangle Y:");
		double sideAY = sc.nextDouble();
		double sideBY = sc.nextDouble();
		double sideCY = sc.nextDouble();
		
		double p = (sideAX + sideBX + sideCX) / 2;
		double areaX = Math.sqrt(p * (p - sideAX) * (p - sideBX) * (p - sideCX));
		
		p = (sideAY + sideBY + sideCY) / 2;
		double areaY = Math.sqrt(p * (p - sideAY) * (p - sideBY) * (p - sideCY));
		
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
