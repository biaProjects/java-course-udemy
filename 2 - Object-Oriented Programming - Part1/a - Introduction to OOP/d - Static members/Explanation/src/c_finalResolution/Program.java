package c_finalResolution;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// The methods, now, are static, so we don't need to make the instantiation 
		// Calculate calculations = new Calculate();
		
		System.out.print("Inform the radius: ");
		double radius = sc.nextDouble();
		
		double circumference = Calculate.circumference(radius);
		double volume = Calculate.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", circumference);
		System.out.printf("Volume: %.2f%n", volume);
		System.out.printf("Value of PI: %.2f", Calculate.PI);
		
		sc.close();
	}
}
