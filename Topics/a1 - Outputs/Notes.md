(Conteúdo da aula 24, seção 4)

_System.out.prin..._  
E agora, o que usar??

Possibilidades para print:
- `print`
- `println`
- `printf`

### print
Não incluirá quebra de liha.

### println
Incluirá quebra de linha.

### printf
Saída formatada.  

Nas 2 primeiras opções citadas, para imprimir, por exemplo, um texto e uma variável, será necessário realizar uma concatenação.  
Ex: `System.out.println("Meu nome é " + nome);`  

Já no _printf_ podemos utilizar marcadores para fazer isso.  
São eles:
- %n ou \n -> Para quebra de linha
- %d -> Para valores inteiros
- %s -> Para textos 
- %f -> Para valores com ponto flutuante (decimais)  
    (Vale ressaltar que esse último é muito útil para definir quantas casas decimais queremos que sejam apresentadas)  

Exemplo de padrão:  
`System.out.printf()"TEXTO1 %f TEXTO2 %f TEXTO3 %n", variavel1, variavel2)`

Um outro ponto importante de ressaltar no printf é que ele seguirá o padrão da máquina. Ou seja, se o padrão de seu computador for português, em valores decimais será usado a ",", se for em inglês, será usado o ".".  
Mas, podemos mudar isso!

### _Locale.setDefault(Locale.US);_
Ao incluirmos isso no código, será definido o padrão americano.  
(Não esqueça de incluir essa linha de código acima do print)  
(Também é importante lembrar de importar java.util.Locale)