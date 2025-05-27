package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int numero = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter accounter holder: ");
		String nome = sc.nextLine();
				
		System.out.print("Is there a initial deposit (y/n)? ");
		String resposta = sc.nextLine();
				
		Conta conta = new Conta(numero, nome);
		if ( resposta.equalsIgnoreCase("y") ) {
			System.out.print("Enter initial deposit value: ");
			double saldoInicial = sc.nextDouble();
			conta = new Conta(numero, nome, saldoInicial);
		}
		
		System.out.println();
		
		System.out.println("Account data: ");
		System.out.printf("%s %n%n", conta);
		
		System.out.print("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		conta.depositar(deposito);
		System.out.println("Updated account data: ");
		System.out.printf("%s %n%n", conta);

		
		System.out.print("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		conta.sacar(saque);
		System.out.println("Updated account data: ");
		System.out.printf("%s %n%n", conta);
		
		sc.close();
	}

}
