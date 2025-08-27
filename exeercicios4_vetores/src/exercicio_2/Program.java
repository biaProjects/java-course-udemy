package exercicio_2;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Quantas pessoas serão digitadas? ");
		int quantidade = sc.nextInt();
		
		Pessoa pessoas[] = new Pessoa[quantidade];
		
		for (int i = 0; i < quantidade; i++) {
			System.out.printf("Dados da %da pessoa: %n", i+1);
			
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			Pessoa pessoa = new Pessoa(nome, idade, altura);
			pessoas[i] = pessoa;
		}
		
		double somaAlturas = 0.0;
		double menor16 = 0;
		for (int i = 0; i < pessoas.length; i++) {
			somaAlturas += pessoas[i].getAltura();
			
			if ( pessoas[i].getIdade() < 16 ) {
				menor16 += 1;
			}
		}
		
		double mediaAltura = somaAlturas / pessoas.length;
		menor16 = menor16 / pessoas.length * 100;
		
		System.out.println();
		System.out.printf("Altura média %.2f %n", mediaAltura);
		
		System.out.print("Pessoas com menos de 16 anos = ");
		System.out.printf("%.1f", menor16);
		System.out.println("%");
		System.out.println("Elas são:");
		
		for (int i = 0; i < pessoas.length; i++) {
			if ( pessoas[i].getIdade() < 16 ) {
				System.out.println(pessoas[i].getNome());
			}
		}
		
		sc.close();
	}

}
