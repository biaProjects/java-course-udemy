package program;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		/* Example:
		 * We will verify, bit to bit, if a certain "bit local" is how we want.
		 * In this case, we want the 6th bit (from right to left) to be 1.
		 * To do this verification, we can create a "mask". We will simulate what we want
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// int mask = 32; or
		int mask = 0b00100000; // 0b to tell it's binary
		
		if ((n & mask) != 0 ) {
			System.out.println("6th is true");
		}
		else {
			System.out.println("6th is false");
		}
		
		sc.close();
	}

}
