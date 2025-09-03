package exercises;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int soma = numero;
		
		System.out.println("Let's count!");
		System.out.println("Type the numbers you want to sum, we will stop when you type 0.");
		
		while (numero != 0) {
			numero = sc.nextInt();
			soma += numero;
		}
		
		System.out.println("The sum is " + soma);
		
		sc.close();
	}
}