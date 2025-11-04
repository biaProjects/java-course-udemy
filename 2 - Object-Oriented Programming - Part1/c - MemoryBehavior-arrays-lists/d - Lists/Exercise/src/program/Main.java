package program;  
  
import entities.Employee;  
  
import java.util.ArrayList;  
import java.util.List;  
import java.util.Scanner;  
  
public class Main {  
  
    public static void main(String[] args) {  
  
        System.out.print("How many employees will be registered? ");  
  
        Scanner sc = new Scanner(System.in);  
        int quantity = sc.nextInt();  
        System.out.println();  
  
        List<Employee> employees = new ArrayList<>();  
  
        for (int i = 0; i < quantity; i++) {  
            System.out.println("Employee #" + (i+1));  
            System.out.print("Id: ");  
            int id = sc.nextInt();  
  
            sc.nextLine();  
            System.out.print("Name: ");  
            String name = sc.nextLine();  
  
            System.out.print("Salary: ");  
            double salary = sc.nextDouble();  
  
            Employee employee = new Employee(id, name, salary);  
            employees.add(employee);  
  
            System.out.println();  
        }  
  
        System.out.print("Enter the employee id that will have salary increase: ");  
        int idIncrease = sc.nextInt();  
  
        Employee toIncrease = employees.stream().filter(x -> x.getId() == idIncrease).findFirst().orElse(null);  
  
        if (toIncrease == null) {  
            System.out.println("This id does not exist");  
        } else {  
            System.out.print("Enter the percentage: ");  
            double percentage = sc.nextDouble();  
  
            toIncrease.setSalary(toIncrease.getSalary() * (1 + (percentage / 100)));  
        }  
  
        System.out.println();  
  
        for (Employee employee : employees) {  
            System.out.println(employee);  
        }  
  
        sc.close();  
    }  
}
