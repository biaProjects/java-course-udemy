(Conteúdo disponível nas aulas 38, 39 e 40)

## Sintaxes opcionais: 

### Operadores de atribuição cumulativa
Ao invés de fazer, por exemplo:  
`soma = soma +1`

Com os operadores de atribuição cumulativa podemos fazer:  
`soma +=1`

---

### Estrutura switch-case
Esta estrutura pode ser utilizada quando temos várias opções de fluxo a serem tratadas com base no valor de uma variável.

Por exemplo:  
Temos um programa que deverá ler um número (de 1 a 7). Cada um será correspondente a um dia da semana, onde 1 será domingo, 2 segunda, e assim sucessivamente.  
O programa irá imprimir o dia corresponde ao número. Caso não seja nenhum dos 7 números, deverá informar que o valor não é correspondente.  

Podemos montar esse programa com if/else encadeado. Mas também podemos utilizar a estrutura switch-case.
O modelo dela consiste em:

```
switch ( variável ) {
    case 1:
        comando;
        break;
    case 2:
        comando;
        break;
    case (...):
    default:
        comando;
        break;
}
```

---

#### Expressão condicional ternária
Estrutura opcional ao if/else que pode ser usada quando deseja decidir um valor com base em uma condição.

Sintaxe:  
`( condição ) ? valorSeVerdadeiro : valorSeFalso`





```java
import java.util.Locale;

import java.util.Scanner;
  
public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		double conta = 50.0;
		
		if (minutos > 100) {
			conta += (minutos-100) * 2;  // += é um exemplo de operadores de atribuição cumulativa
		}
		
		System.out.printf("Valor da conta = R$ %.2f", conta);
		
Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		String dia;
		
		switch (numero) { // avaliar numero
		case 1: // caso numero seja 1
			dia = "domingo";
			break; // obrigatorio quando finaliza o case
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terca";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default: // valor padrao
			dia = "valor invalido";
			break;
		}
		System.out.println("Dia da semana: " + dia);
		
		sc.close();
	}
}
```


```java
public class Main {

	public static void main(String[] args) {
	
		double preco = 35.5;
		double desconto;
		
		if (preco < 20.0) {
			desconto = preco * 0.1;
		}
		else {
			desconto = preco * 0.05;
		}
	}
}
```

depois
```java
public class Main {

	public static void main(String[] args) {
	
		double preco = 35.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
	}
}
```
