package versao2_toString;

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data:");
		
		System.out.print("Name: ");
		product.name = sc.nextLine();
		
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		
		System.out.println("Product data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		int toAdd = sc.nextInt();
		product.addProducts(toAdd);
		System.out.println();
		
		System.out.println("Updated data:" + product);
		
		System.out.print("Enter the number of products to be removed from stock: ");
		int toRemove = sc.nextInt();
		product.removeProducts(toRemove);
		System.out.println();
		
		System.out.println("Updated data:" + product);
		
		sc.close();
	}
}