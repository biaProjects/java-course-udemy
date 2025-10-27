package program;

import java.util.ArrayList;
import java.util.List;

// Para filtrar, criando nova lista com base em um predicado
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		// Instanciando a lista
		List<String> names = new ArrayList<>();
		
		
		// Adicionando elementos
		names.add("Beatriz");
		names.add("Bobby");
		names.add("Noah");
		names.add("Anna");
		names.add("Alex");
		
		System.out.println("Todos os nomes: ");
		// for each para iterar a lista
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println();
		
		
		// Adicionando outro nome entre Bobby e Noah (posição 2)
		names.add(2, "Joy");
		
		System.out.println("Com novo nome: ");
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println();
		
		
		// verificando o tamanho da lista
		System.out.println("O tamanho da lista: ");
		System.out.println(names.size());
		System.out.println();
		
		
		// Removendo elemento da lista 
		names.remove("Anna");  // -> através de comparação de elementos
		names.remove(2);  // -> atavés da posição
		
		System.out.println("Removendo Anna e posição 2");
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println();
		
		names.removeIf(name -> name.charAt(0) == 'N');  // -> através de predicado, nesse caso, todo nome que começa com a letra "N"
		// '=> expressão lambda (veremos mais à frente)
		/* O predicado retornará T ou F
		 * lemos "remova se nome, tal que nome com char na posição 0 é igual a "N"
		 */
		System.out.println("Removendo os que iniciam com N: ");
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println();
		
		/* E se quisermos fazer o contrário?
		 * Por exemplo, manter apenas os nomes que começam com "B"
		 * Será necessário declarar outra lista
		 */
		List<String> resultJustB = names.stream().filter(name -> name.charAt(0) == 'B').collect(Collectors.toList());	
		/* Chama a função filter, que recebe um predicado
		 * O filtro vai devolver o stream filtrado pelo predicado
		 * Maass... o stream não é compativel com lista, então tem que converter (através de collect)
		 */
		System.out.println("Filtrando para deixar apenas nomes que iniciem com a letra B: ");
		for (String name : resultJustB) {
			System.out.println(name);
		}
		System.out.println();
		
		
		// Encontrando um elemento que tenha algum predicado
		String name = names.stream().filter(nameA -> nameA.charAt(0) == 'A').findFirst().orElse(null);  
		// => primeiro elemento que começa com A, caso não exista, retornará null
		System.out.println("Iniciando em A: " + name);
		
		
		// Encontrando a posição de um elemento
		System.out.println("Index of Bobby: " + names.indexOf("Bobby"));
		// Caso não exista na lista, retornará -1
	}

}  
