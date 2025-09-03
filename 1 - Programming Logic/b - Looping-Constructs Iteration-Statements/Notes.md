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
