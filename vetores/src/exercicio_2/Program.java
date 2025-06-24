package exercicio_2;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantity = sc.nextInt();
		
		Product[] product_vect = new Product[quantity];
		
		for (int i = 0; i< quantity; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			product_vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for (int i = 0; i < quantity; i++) {
			sum += product_vect[i].get_price();
		}
		
		double average = sum / quantity;
		
		System.out.printf("Average price = %.2f", average);
		
		sc.close();
	}

}
