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
