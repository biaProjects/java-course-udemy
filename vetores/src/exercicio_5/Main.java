package exercicio_5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Rent[] rooms = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int quantity = sc.nextInt();
		
		for (int i = 0; i < quantity; i++) {
			Rent rent = new Rent();

			System.out.printf("Rent #%d %n", i + 1);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			rent.setName(name);
			
			System.out.print("Email: ");
			String email = sc.next();
			rent.setEmail(email);
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			rent.setRoom(room);
			
			System.out.println();
			
			rooms[room] = rent;
		}
				
		System.out.println("Busy rooms: ");
		for (int i = 0; i < rooms.length; i += 1) {
			if ( rooms[i] != null ) {
				System.out.println(rooms[i]);
			}
		}
		
		sc.close();
	}

}
