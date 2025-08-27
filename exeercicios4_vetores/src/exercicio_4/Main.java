package exercicio_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor? ");
		int tamanho = sc.nextInt();

		int vetorA[] = new int[tamanho];
		int vetorB[] = new int[tamanho];

		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < tamanho; i++) {
			int valor = sc.nextInt();
			vetorA[i] = valor;
		}
		
		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < tamanho; i++) {
			int valor = sc.nextInt();
			vetorB[i] = valor;
		}
		
		int resultante[] = new int [tamanho];
		for (int i = 0; i < tamanho; i++) {
			resultante[i] = vetorA[i] + vetorB[i];
		}
		
		System.out.println("VETOR RESULTANTE: ");
		for (int i = 0; i < resultante.length; i++) {
			System.out.println(resultante[i]);;
		}
		
		sc.close();
	}

}
