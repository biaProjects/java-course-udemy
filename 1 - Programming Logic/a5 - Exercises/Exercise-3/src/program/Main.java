package program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Let's check in which quadrant the ordered par is.");
		float Xaxis, Yaxis;
		Xaxis = sc.nextFloat();
		Yaxis = sc.nextFloat();

		if (Xaxis == 0) {
			if (Yaxis == 0) {
				System.out.println("Origin");
			} else {
				System.out.println("Y-axis");
			}
		} else if (Xaxis == 0) {
			System.out.println("X-axis");
		} else {
			if (Xaxis > 0) {
				if (Yaxis > 0) {
					System.out.println("Q1");
				} else {
					System.out.println("Q4");
				}
			} else {
				if (Yaxis > 0) {
					System.out.println("Q2");
				} else {
					System.out.println("Q3");
				}
			}
		}

		sc.close();
		
	}
}
