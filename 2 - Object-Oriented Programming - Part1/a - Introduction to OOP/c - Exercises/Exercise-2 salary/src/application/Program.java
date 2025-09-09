package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, inform the following informations od the employee:");		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();

		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("Employee: " + employee);
		System.out.println();
		
		System.out.print("Which percentage to increase salary of the employee? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println();
		
		System.out.println("Updated data: " + employee);
		
		sc.close();
	}
}

/*
|                   Employee                   |
| -------------------------------------------- |
|                - Name : string               |
|            - GrossSalary : double            |
|                - Tax : double                |
| -------------------------------------------- |
|            + NetSalary() : double            |
| + IncreaseSalary(percentage : double) : void |
*/
