package primeira_resolucao;

import java.util.Locale;
import java.util.Scanner;

public class Todos_metodos_juntos {

	/*Declarando membro estático PI: 
	public static double PI = 3.14159; 
	Se eu quiser que esse membro seja uma constante, não uma variável, adicionaremos... final
	OBS: padrão para constante é tudo com letra maiscula, separando as palavras com underline (_)
	*/
	public static final double PI = 3.14159;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o raio: ");
		double raio = sc.nextDouble();

		double circunferencia = circunferencia(raio);
		double volume = volume(raio);

		System.out.printf("Circunferencia: %.2f%n", circunferencia);
		System.out.printf("Volume: %.2f%n", volume);
		System.out.printf("Valor de PI: %.2f", PI);

		sc.close();
	}

	public static double circunferencia(double raio) {
		return 2.0 * PI * raio;
	}

	public static double volume(double raio) {
		return 4.0 * PI * raio * raio * raio / 3.0;
	}
}
