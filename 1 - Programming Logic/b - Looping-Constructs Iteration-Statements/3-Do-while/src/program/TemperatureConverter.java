package program;

import java.util.Locale;
import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to you tempertature converter!");
		char vontade;
		
		do {
			System.out.println("Type the temperature in Celsius:");
			double temp = sc.nextDouble();
			double f = (9*temp)/5 + 32;
			System.out.printf("Equivalent in Fahrenheit: %.1f %n", f);
			
			System.out.printf("Do you want to repeat? \nY - yes | N - no \n");
			vontade = sc.next().charAt(0);
		} while (vontade == 'Y' || vontade == 'y');
		
		System.out.println("Thanks for using the temperature converter!");
		
		sc.close();
	}
}
