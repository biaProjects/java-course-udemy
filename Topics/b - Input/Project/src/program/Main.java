package program;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int age;
		String name, motherName;
		
		System.out.println("Type your age.");
		age = sc.nextInt();
		
		System.out.println("Now, please, inform your name.");
		sc.nextLine();
		name = sc.nextLine();
		
		System.out.println("What is your mother's first name.");
		motherName = sc.next();
		
		System.out.printf("Ok, %s, you are %d years old and your mother is %s.%n", name, age, motherName);
		
		double height;
		System.out.printf("%s, what's your height in meters?%n", name);
		
		height = sc.nextDouble();
		
		char gender;
		System.out.printf("%s, to finish your registrer, type F if you are a woman or M if you are a man:\n", name);
		gender = sc.next().charAt(0);
		
		System.out.printf("Ok, %s, your height is %.2f and you informed your gender as %s.\n", name, height, gender);
		
		sc.close();
		
	}

}
