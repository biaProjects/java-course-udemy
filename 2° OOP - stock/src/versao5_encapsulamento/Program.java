package versao5_encapsulamento;

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data:");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		// product
		Product product = new Product(name, price);
		System.out.println();
		
		System.out.println("Product data: " + product);
		System.out.println();

		// adding products
		System.out.print("Enter the number of products to be added in stock: ");
		int toAdd = sc.nextInt();
		product.addProducts(toAdd);
		System.out.println();
		
		System.out.println("Updated data:" + product);
		System.out.println();

		// removing products
		System.out.print("Enter the number of products to be removed from stock: ");
		int toRemove = sc.nextInt();
		product.removeProducts(toRemove);
		System.out.println();
		
		System.out.println("Updated data:" + product);
		
		sc.close();
	}

}
