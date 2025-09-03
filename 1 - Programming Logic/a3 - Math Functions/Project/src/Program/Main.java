package Program;

public class Main {

	public static void main(String[] args) {

		double delta;
		int a = 2;
		int b = 4;
		int c = -6;
		double x1;
		double x2;

		delta = Math.pow(b, 2.0) - 4 * a * c;

		x1 = (-b + Math.sqrt(delta)) / (2 * a);
		x2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.println("x1 = " + x1 + " and x2 = " + x2);
		System.out.println("Module: " + Math.abs(x1) + " e " + Math.abs(x2));

	}

}
