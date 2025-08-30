package exercicio_1;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantity = sc.nextInt();
		
		// type_vect'll_have[] name_variable = new type'll_have[length]
		Product[] product_vect = new Product[quantity];
		
		for (int i = 0; i< product_vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			product_vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for (int i = 0; i < product_vect.length; i++) {
			sum += product_vect[i].get_price();
		}
		
		double average = sum / quantity;
		
		System.out.printf("Average price = %.2f", average);
		
		sc.close();
	}

}
