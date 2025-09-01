(Conteúdo disponível na aula 34 )
# E???

### Quais são as expressões lógicas em Java?
- AND (E) => &&  
`name = "Beatriz" %% age = 19;`

- OR (OU) => ||  
`name = "Beatriz" || age = 6;`

- NOT (NÃO) => !  
`age != 6`

``` java
public class Main {

	public static void main(String[] args) {
	
		int x = 5;
		
		// Operador E
		System.out.println(x >= 5 && x != 0);
		// Operador OU
		System.out.println(x < 6 || x == 8);
		// Operador NAO
		System.out.println(!(x == 10));
	}
}
```

### E as estruturas condicionais?
Temos...

- Estrutura condicional simples
```
if ( condição ) {
    comando
    comando
}
```
- Estrutura condicional composta
```
if ( condição ){
	comando
	comando
}
else{
	comando
	comando
}
```
