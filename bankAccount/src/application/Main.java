package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter accounter holder: ");
		sc.nextLine();
		String name = sc.nextLine();
				
		System.out.print("Is there a initial deposit (y/n)? ");
		char answer = sc.next().charAt(0);
				
		Account account = new Account(number, name);
		
		/* if you define "answer" as String, it'll be necessary to use "answer.equalsIgnoreCase("y")" in the if...
		 * but... if you define "answer" as char... you can use answer == 'y' (just don't forget that it can't be "y")
		 */
		
		if ( answer == 'y' || answer == 'Y' ) {
			System.out.print("Enter initial deposit value: ");
			double saldoInicial = sc.nextDouble();
			account = new Account(number, name, saldoInicial);
		}
		
		System.out.println();
		
		System.out.println("Account data: ");
		System.out.printf("%s %n%n", account);
		
		System.out.print("Enter a deposit value: ");
		double amountDeposit = sc.nextDouble();
		account.deposit(amountDeposit);
		System.out.println("Updated account data: ");
		System.out.printf("%s %n%n", account);

		
		System.out.print("Enter a withdraw value: ");
		double amountWithdraw = sc.nextDouble();
		account.withdraw(amountWithdraw);
		System.out.println("Updated account data: ");
		System.out.printf("%s %n%n", account);
		
		sc.close();
	}

}
