package a_everythingTogether;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	/*  To declare static member PI:
	public static double PI = 3.14159;
	
	If I want it to be a constant, it's necessary to add "final"  */
	public static final double PI = 3.14159;
	//  Obs: default to constant is using uppercase and split with _
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inform the radius: ");
		double radius = sc.nextDouble();
		
		double circumference = circumference(radius);
		double volume = volume(radius);
		
		System.out.printf("Circumference: %.2f%n", circumference);
		System.out.printf("Volume: %.2f%n", volume);
		System.out.printf("Value of PI: %.2f", PI);
		
		sc.close();
	}
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
