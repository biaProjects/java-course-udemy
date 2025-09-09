package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Let's calculate the area, petimeter and diagonal of a rectangle.");
		System.out.println("Enter the width and height of the triangle:");
		
		Rectangle rectangle = new Rectangle();
		rectangle.height = sc.nextDouble();
		rectangle.width = sc.nextDouble();
		
		System.out.printf("AREA = %.2f %n", rectangle.area());
		System.out.printf("PERIMETER = %.2f %n", rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f %n", rectangle.diagonal());
		
		sc.close();
	}
}

/*
|       Rectangle        |
| ---------------------- |
|    - Width : double    |
|   - Height : double    |     
| ---------------------- |
|   + Area() : double    |
| + Perimeter() : double |
| + Diagonal() : double  |
*/