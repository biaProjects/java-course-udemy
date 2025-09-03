(Conteúdo das aulas 45 a 55 - Seção 6)

## ESTRUTURAS REPETITIVAS

### While
Usamos o while para estruturas como...  
Enquanto tal coisa for verdadeira, faça tal coisa.  
Essa estrutura é muito útil quando precisamos repetir algo, mas não sabemos previamente o número de vezes que será repetido.


Sintaxe:
```
while ( condição ) {
	comando 1
	comando 2
}
```
Enquanto a condição for verdadeira, ele executará e voltará.  
Quando a ação for falsa, ele sairá do loop.

#

### For
Essa estrutura irá repetir o bloco de comandos dentro de um intervalo de valores, então ela será útil para quando soubermos o número de vezes que a repetição irá acontecer.  

Sintaxe:
```
for ( inicio ; condição ; incremento ) {
	comando 1
	comando 2
}
```

Onde:  
Início = executa apenas na primeira vez.  
Condicao = V - executa e volta F - pula fora.  
Incremento = executa toda vez depois de voltar

Exemplo:  
Para contar de 0 a 5:  
```
for ( int i=0; i<=5; i+=1) {
    System.out.println(i);
}
```
`i = 0` -> só executa na primeira vez.  
`i <= 5` -> será a condição, ou seja, enquanto i for menor ou igual a 5, ele continuará executando o comando.  
`i += 1` -> executará toda vez que ele retornar, ou seja, após realizar o comando, ele fará a soma de i + 1.

Observação interessante:  
Se fizer i-- (ou i -= 1), será contagem regressiva.

#

### Do while
O bloco de comandos será executado, no mínimo, uma vez. Isso acontece porque a condição é verificada apenas no final da primeira execução.  

Sintaxe:  
```
do {
	comando 1
	comando 2
} while ( condicao );
```


Exemplo dowhile:
Faremos um programa que lê uma temperatura em Celsius e converte para Fahrenheit.

```java
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char vontade;
		
		do {
			System.out.println("Digite a temperatura em Celsius:");
			double temp = sc.nextDouble();
			double f = (9*temp)/5 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f %n", f);
			
			System.out.println("Deseja repetir, sim ou não?");
			vontade = sc.next().charAt(0);
		} while (vontade == 'S' || vontade == 's');
		
		System.out.println("Obrigada por usar o conversor de temperatura!");
		
		sc.close();
	}
}
```








exemplo for
```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int soma = 0;
		
		for (int i=0; i<n; i++){
			// i+=1 == i++
			// nesse caso, i=0 só roda uma vez, depois roda o i<n e antes de voltar pro próximo i<n ele faz i++
			int x = sc.nextInt();
			soma += x;
			System.out.println(soma);
			// imprime soma parcial
		}
		
		System.out.println(soma);
		// imprime soma total
		
		sc.close();
	}
}
```



Exemplo - while
```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int soma = numero;
		
		while (numero != 0) {
			numero = sc.nextInt();
			soma += numero;
		}
		
		System.out.println("A soma é " + soma);
		
		sc.close();
	}
}
```


### exercicios - while

1. contando que a senha correta é 2002, faça um programa que leia as tentativas, informe quando erradas e, quando correta, permita o acesso
```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		int valida = 2002;
		
		while (senha != 2002) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso permitido");
		
		sc.close();
	}
}
```


2. o programa lerá x, y e deverá informar o quadrante correspondente enquanto um dos dados não forem nulos (0)
```java
import java.util.Scanner;
  
public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0) {
				if (y > 0) {
					System.out.println("primeiro");
				}
				else {
					System.out.println("quarto");
				}
			}
			else {
				if (y > 0) {
					System.out.println("segundo");
				}
				else {
					System.out.println("terceiro");
				}
			}
			
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}
}
```

3. Seu programa lerá o tipo de combustivel e depois a quantidade total de cada um
```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		// 1 = alcool, 2 = gasolina, 3 = diesel, 4 = fim
		
		int alcool = 0, gasolina = 0, diesel = 0;
		int tipo = sc.nextInt();
		
		while (tipo != 4) {
			switch (tipo) {
				case 1:
					alcool += 1;
					break;
				case 2:
					gasolina += 1;
					break;
				case 3:
					diesel += 1;
					break;
				}
			
			tipo = sc.nextInt();
		}
		
		System.out.printf("MUITO OBRIGADO %nAlcool: %d %nGasolina: %d %nDiesel: %d", alcool, gasolina, diesel);
		
		sc.close();
	}
}
```

### exercicios - for

1. seu programa lerá um valor inteiro e mostrará os impares de 1 até X inclusive X se for o caso.
```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int limite = sc.nextInt();
		
		for (int i=1; i<=limite; i+=2) {
			System.out.println(i);
		}
		
		if (limite % 2 != 0) {
			System.out.println(limite);
		}
		
		sc.close();
	}
}
```

2. leia um valor inteiro que será a quantidade de numeros lidos em seguida. Depois mostre quantos desses valores estão dentro do inervalo (10, 20) e quantos estão fora
```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int quant = sc.nextInt();
		int in = 0, out = 0;
		
		for (int i=0; i<quant; i+=1) {
			int numero = sc.nextInt();
			
			if (10 <= numero && numero <= 20)
				in += 1;
			else
				out += 1;
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}
}
```

3. seu programa lerá a quantidade de médias que serão calculadas sendo que cada uma delas terá 3 notas onde a primeira é peso 2, a segunda é peso 3 e a terceira é peso 5.
```java
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int quant = sc.nextInt();
		
		for (int i=0; i<quant; i++) {
			double valor1 = sc.nextDouble();
			double valor2 = sc.nextDouble();
			double valor3 = sc.nextDouble();
			
			double media = (valor1*2 + valor2*3 + valor3*5) / 10;
			
			System.out.printf("%.1f", media);
		}
		
		sc.close();
	}
}
```

4. faça um programa que leia um numero e depois leia essa quantidade de pares de numeros mostrando a divisão do primeiro pelo segundo. Se o denominador (segundo) for 0 diga "divisao impossivel"
```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int quant = sc.nextInt();
		
		for (int i=0; i<quant; i++) {
			int numero = sc.nextInt();
			int denominador = sc.nextInt();
			
			if (denominador == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double divisao = (double) numero/denominador;
				System.out.printf("%.1f", divisao);
			}
		}
		
		sc.close();
	}
}
```

5. leia um numero e calcule o seu fatorial
```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int mult = 1;
		
		for (int i=1; i<=numero; i+=1){
			mult *= i;
		}
		
		System.out.println(mult);
		
		sc.close();
	}
}
```

6. leia um numero e calcule todos os seus divisores
```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		for (int i=1; i<=numero; i+=1) {
			double div = numero % i;
			if (div == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
```

7. leia a quantidade de linhas onde nela serão impressos 3 valores, o numero da linha, seu quadrado e seu cubo.
```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int linha = sc.nextInt();
		
		for (int i=1; i<=linha; i++) {
			double quadrado = Math.pow(i, 2);
			double cubo = Math.pow(i, 3);
			
			System.out.printf("%d %.0f %.0f", i, quadrado, cubo);
			System.out.println();
		}
		
		sc.close();
	}
}
```

