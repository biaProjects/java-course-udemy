package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		/* this constructor is not valid anymore
		Product product = new Product();
		*/
		
		System.out.println("Enter product data:");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		// product.name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		// product.price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		// product.quantity = sc.nextInt();

		// now we can instantiate our product
		Product product = new Product(name, price, quantity);
		
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
