package versao3_constutor;

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		/* agora, esse construtor não é mais valido
		Product product = new Product();
		*/
		
		System.out.println("Enter product data:");
		
		System.out.print("Name: ");
		// antes: product.name = sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		// antes: product.price = sc.nextDouble();
		double price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		// antes: product.quantity = sc.nextInt();
		int quantity = sc.nextInt();
		
		// agora sim, instanciamos nosso objeto
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
