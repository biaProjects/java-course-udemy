package exercises;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Let´s check the fuel you use.");
		
		int ethanol = 0, gasoline = 0, diesel = 0;
		int type = 0;

		while (type != 4) {
			System.out.printf("1 for ethanol \n2 for gasoline \n3 for diesel \n4 to stop \n");
			switch (type) {
			case 1:
				ethanol += 1;
				break;
			case 2:
				gasoline += 1;
				break;
			case 3:
				diesel += 1;
				break;
			}

			type = sc.nextInt();
		}

		System.out.printf("The result is: %nEthanol: %d %nGasoline: %d %nDiesel: %d", ethanol, gasoline, diesel);

		sc.close();
	}
}