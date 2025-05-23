package terceira_resolucao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// como os metodos foram declarados como estaticos na classe, não é necessario instanciar
		// Calcular calculos = new Calcular();
		
		System.out.print("Informe o raio: ");
		double raio = sc.nextDouble();
		
		double circunferencia = Calcular.circunferencia(raio);
		double volume = Calcular.volume(raio);
		
		System.out.printf("Circunferencia: %.2f%n", circunferencia);
		System.out.printf("Volume: %.2f%n", volume);
		System.out.printf("Valor de PI: %.2f", Calcular.PI);
		
		sc.close();
	}
}