package b_withDelegation;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calculate calculations = new Calculate();
		
		System.out.print("Inform the radius: ");
		double radius = sc.nextDouble();
		
		double circumference = calculations.circumference(radius);
		double volume = calculations.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", circumference);
		System.out.printf("Volume: %.2f%n", volume);
		System.out.printf("Value of PI: %.2f", calculations.PI);
		
		sc.close();
	}
}

