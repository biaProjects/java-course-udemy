package program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		String day;

		switch (number) { // will test the number
		case 1: // if ( number = 1)
			day = "sunday";
			break; // force to finish the case
		case 2:
			day = "monday";
			break;
		case 3:
			day = "tuesday";
			break;
		case 4:
			day = "wednesday";
			break;
		case 5:
			day = "thursday";
			break;
		case 6:
			day = "fryday";
			break;
		case 7:
			day = "saturday";
			break;
		default:
			day = "invalid";
			break;
		}
		
		System.out.println("Day of the week: " + day);

		sc.close();
	}
}
