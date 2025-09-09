package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
	
		/* The program will read the 3 grades of the student and it's name
		 * The first is worth 30, the second and third is 35
		 * To be approved, the student needs to have, at least, 60
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Student's name: ");
		student.name = sc.nextLine();
		
		System.out.println("#1 grade");
		student.grade1 = sc.nextDouble();
		System.out.println("#2 grade");
		student.grade2 = sc.nextDouble();
		System.out.println("#3 grade");
		student.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
		student.passOrFail(60);
		
		sc.close();
	}
}

/*
|                    Student                     |
| ---------------------------------------------- |
|                - Name : string                 |
|               - Grade 1 : double               |
|               - Grade 2 : double               |
|               - Grade 3 : double               |
| ---------------------------------------------- |
| + FinalGrade(int peso1, peso2, peso3) : double |
|      + PassOrFail(minimum : int) : string      |


Exemplos:

| Entrada                                  | Saída                           |
| ---------------------------------------- | ------------------------------- |
| Alex Green <br>27.00 <br>31.00 <br>32.00 |  FINAL GRADE = 90.00 <br> PASS  |

| Entrada                                  | Saída                                                  |
| ---------------------------------------- | ------------------------------------------------------ |
| Alex Green <br>17.00 <br>20.00 <br>15.00 | FINAL GRADE = 52.00 <br>FAILED <br>MISSING 8.00 POINTS |

*/

