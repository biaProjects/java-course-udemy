(Conteúdo disponível nas aulas 98 e 99)

# Listas

### Anotações:
Lista é uma estrutura de dados:  
- Homogênea (possue dados do mesmo tipo)  
- Ordenada   
- Inicia vazia e os elementos são alocados sob demanda  
- Cada elemento ocupa um "nó" (ou nodo) da lista  

Tipo (interface): List
- Classes que implementam: ArrayList, LinkedList, etc.
- Não pode instanciar esse tipo, precisa de uma classe que implementem essa interface


## Operações
|               Operação               |       Como fazer       |
| :----------------------------------: | :--------------------: |
|               Tamanho                |        .size()         |
|          Elemento posição x          |        .get(x)         |
|           Inserir elemento           |     .add(elemento)     |
|     Inserir elemento na posição x    |    .add(x, elemento)   |
|           Remover elemento           |    .remove(elemento)   |
|     Remover elemento da posição x    |       .remove(x)       |
|         Remover se tal coisa         |  .removeIf(predicate)  |
|    Encontrar posição de elemento     |   .indexOf(elemento)   |
| Encontrar última posição de elemento | .lastIndexOf(elemento) |

### Filtros:  
1. Filtrar com base em um predicado  
    List<> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());  
2. Primeira ocorrência com base em predicado:  
    Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);  


## Exemplo:
Digamos que eu queira uma lista de números inteiros.

```
import java.util.List;

(...)

List<Interger> list;
```

Ou seja...  
1. Lista
2. <tipo que a lista terá>  -> isso são generics (veremos mais adiante) que parametriza a definição de um tipo informando outro tipo
3. Nome da váriavel que receberá a lista

Diferentemente do vetor, a lista não aceita tipos primitivos. Precisa de wrapper class.  

<br>

## Instanciando a lista
Só declarar não permite que possamos utilizar a lista. É necessário declará-la.  
Por ela ser uma interface, não basta colocar ```new List<>();```.  
Então... precisaremos de uma classe que implementa essa interface.  

Uma classe comum para esse caso é `ArrayList` (import java.util.ArrayList;).  

Escolhemos essa classe para ser algo otimizados, ela usa características de vetor e de lista.  

```
import java.util.ArrayList;
import java.util.List;

(...)

List<Interger> list = new ArrayList<>();
// colocar o tipo em <> do ArrayList é opcional
```

Agora sim! A lista está pronta para ser utilizada.  

--- 

<br>

Quer ver um exemplo?   
[Clique aqui!](https://github.com/biaProjects/java-course-udemy/blob/master/2%20-%20Object-Oriented%20Programming%20-%20Part1/c%20-%20MemoryBehavior-arrays-lists/d%20-%20Lists/Explanations/Example/src/program/Main.java)

<br>

--- 

<br> 

# Exercício
Vamos fazer um programa para ler um número inteiro N e depois os dados (id, nome e salário) de N funcionários. Não deve haver repetição de id.   
Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário. Para isso, o programa deve ler um id e o valor de X.  
Se o id informado não existir, mostre uma mensagem e aborte a operação.
Ao final, mostrar a listagem atualizada dos funcionários, conforme exemplos a seguir.  
Lembre de aplicar a técnnica de encapsulamento para não permitir que o salário possa ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de aumento por poncentagem informada.  

Exemplos:  
How many employees will be registered?  *2*  

Employee #1:  
Id: *333*  
Name: *Maria Brown*  
Salary: *4000.00*  

Employee #2:  
Id: *536*  
Name: *Maria Brown*

Enter the employee id that will have salary increase : *536* 
Enter the percentage: *10.0*

List of employees: 
333, Maria Brown, 4000.00 
536, Alex Grey, 3300.00 

---

EXEMPLO 2

How many employees will be registered? *2*

Emplyoee #1: 
Id: ==333==
Name: ==Maria Brown==
Salary: ==4000.00==

Emplyoee #2: 
Id: ==536== 
Name: ==Alex Grey==
Salary: ==3000.00==

Enter the employee id that will have salary increase: ==776==
This id does not exist! 

List of employees: 
333, Maria Brown, 4000.00 
536, Alex Grey, 3000.00

[Veja o código aqui!](https://github.com/biaProjects/java-course-udemy/tree/master/2%20-%20Object-Oriented%20Programming%20-%20Part1/c%20-%20MemoryBehavior-arrays-lists/d%20-%20Lists/Exercise)