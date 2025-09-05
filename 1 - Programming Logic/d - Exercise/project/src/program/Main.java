package program;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many names will you register?");
		int quatityUsers = sc.nextInt();
		
		System.out.println("Type the names separated with a comma (,):");
		sc.nextLine();
		String users = sc.nextLine();
		
		String[] vect = users.split(","); 
		
		for (int i=0; i<quatityUsers; i++) {
			String name = vect[i];
			
			System.out.print("Name: " + name + " | ");
			
			int size = name.length();
			System.out.print("Chars: " + size + " | ");
			
			if (size <= 5) {
				System.out.printf("Short name%n");
			}
			else {
				System.out.printf("Long name%n");
			}
		}
		sc.close();
	}
}
