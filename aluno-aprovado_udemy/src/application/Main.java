package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Enter student's name: ");
		student.name = sc.nextLine();
		
		/*for (int i = 0; i < student.grades.length;i++) {
			System.out.print("Enter the grade #N" + (i + 1) + ": ");
			student.grades[i] = sc.nextDouble();
			
		}*/
		
		int count = 0;
		
		while(count < student.grades.length) {
			System.out.print("Enter the grade #N" + (count + 1) + ": ");
			student.grades[count] = sc.nextDouble();
			count++;
		}
		
		System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
		student.passOrFail(60);
		
		sc.close();

	}

}
