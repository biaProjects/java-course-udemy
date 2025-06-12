package segunda_resolucao_delegando;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calcular calculos = new Calcular();
		
		System.out.print("Informe o raio: ");
		double raio = sc.nextDouble();
		
		double circunferencia = calculos.circunferencia(raio);
		double volume = calculos.volume(raio);
		
		System.out.printf("Circunferencia: %.2f%n", circunferencia);
		System.out.printf("Volume: %.2f%n", volume);
		System.out.printf("Valor de PI: %.2f", calculos.PI);
		
		sc.close();
	}
}