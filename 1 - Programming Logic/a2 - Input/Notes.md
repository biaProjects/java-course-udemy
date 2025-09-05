(Conteúdo disponível nas aulas 26 e 27)  

Mas... como faço entrada de dados??

Em Java, temos um tipo especial de variável para entrada de dados... ela é:  
Scanner

Para conseguir usá-la, precisaremos:
1. Importar ela no começo do código.  
`import java.util.Scanner;`
2. Criar uma variável Scanner.  
`Scanner sc = new Scanner(System.in);`

Para receber a entrada:
- nomeVariavel = sc.next();  
    '-> para String sem espaço.
- nomeVariavel = sc.nextInt();  
    '-> para inteiros.
- nomeVariavel = sc.nextDouble();  
    '-> para variáveis com ponto flutuante (decimais)
- nomeVariavel = sc.next().charAt(0);  
    '-> para caractere (mesmo que digite uma String completa, ele considerará apenas o primeiro caractere)

# 
Mas... e se eu quiser ler uma String inteira, até a quebra de linha?  
`nomeVariavel = sc.nextLine();`

Porém, essa é uma questão delicada e que requer atenção.  
Se houver outra entrada, antes do nextLine, que não seja de um tipo nextLine, o programa dará erro.  
Isso acontece porque ele irá considerar o valor ao lado da entrada anterior como o nextLine.

Para resolver esse problema, basta acrescentar um sc.nextLine(), vazio, antes.