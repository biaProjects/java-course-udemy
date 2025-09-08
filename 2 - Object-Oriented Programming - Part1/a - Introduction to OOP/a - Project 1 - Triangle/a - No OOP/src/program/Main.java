package program;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the measure of triangle X:");
		double ladoAX = sc.nextDouble();
		double ladoBX = sc.nextDouble();
		double ladoCX = sc.nextDouble();
		
		System.out.println("Enter the measure of triangle Y:");
		double ladoAY = sc.nextDouble();
		double ladoBY = sc.nextDouble();
		double ladoCY = sc.nextDouble();
		
		double p = (ladoAX + ladoBX + ladoCX) / 2;
		double areaX = Math.sqrt(p * (p - ladoAX) * (p - ladoBX) * (p - ladoCX));
		
		p = (ladoAY + ladoBY + ladoCY) / 2;
		double areaY = Math.sqrt(p * (p - ladoAY) * (p - ladoBY) * (p - ladoCY));
		
		System.out.printf("Triangle X area: %.4f %n", areaX);
		System.out.printf("Triangle Y area: %.4f %n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
	}
}
