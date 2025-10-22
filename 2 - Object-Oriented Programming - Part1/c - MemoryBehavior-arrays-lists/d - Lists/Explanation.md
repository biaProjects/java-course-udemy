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
- Filtrar com base em um predicado   
    List<> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());  
- Primeira ocorrência com base em predicado:   
    Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);  
