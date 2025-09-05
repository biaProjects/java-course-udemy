(Conteúdo da aula 58)  
Geralmente são usados em operações de baixo nível (que lidam diretamente com os recursos fundamentais do computador), como microcontroladores, interfaces com rede, arduino, etc.  
Esses operadores realizam operações lógicas bit a bit.

São eles:   
- & -> E  
    Tabela verdade:
    | F1  | F2  | F=  |
    | --- | --- | --- |
    | f   | f   | f   |
    | f   | v   | f   |
    | v   | f   | f   |
    | v   | v   | v   |

- | -> Ou  
    Tabela verdade:
    | F1  | F2  | F=  |
    | --- | --- | --- |
    | f   | f   | f   |
    | f   | v   | v   |
    | v   | f   | v   |
    | v   | v   | v   |

- ^ -> Ou-exclusivo (shor)
    Tabela verdade:
    | F1  | F2  | F=  |
    | --- | --- | --- |
    | f   | f   | f   |
    | --- | --- | --- |
    | f   | v   | v   |
    | v   | f   | v   |
    | v   | v   | f   |


Exemplo:

```
int n1 = 89;
int n2 = 60;

System.out.println(n1 & n2);  
System.out.println(n1 | n2);
System.out.println(n1 ^ n2);
// vai comparar um por um, sendo 0 falso e 1 verdadeiro
```

> _Saída_:  
> 24  
> 125  
> 101  

Como funciona?
|     | binário   |     &     |    \|     |     ^     |
| --- | --------- | :-------: | :-------: | :-------: |
| 89  | 0001 1001 | 0001 1000 | 0111 1101 | 0110 0101 |
| 60  | 0011 1100 |   = 24    |   = 125   |   = 101   |


|     |     |     |     |  E  |     |     |     |     |    |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | ---------------------- |
| 0   | 1   | 0   | 1   |     | 1   | 0   | 0   | 1   | 89 em binário          |
| 0   | 0   | 1   | 1   |     | 1   | 1   | 0   | 0   | 60 em binário          |
| F   | F   | F   | V   |     | V   | F   | F   | F   | E bit a bit            |
| 0   | 0   | 0   | 1   |     | 1   | 0   | 0   | 0   | Resultado binário (24) |

|     |     |     |     |  OU  |     |     |     |     |    |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | ---------------------- |
| 0   | 1   | 0   | 1   |     | 1   | 0   | 0   | 1   | 89 em binário           |
| 0   | 0   | 1   | 1   |     | 1   | 1   | 0   | 0   | 60 em binário           |
| F   | V   | V   | V   |     | V   | V   | F   | V   | OU bit a bit            |
| 0   | 1   | 1   | 1   |     | 1   | 1   | 0   | 1   | Resultado binário (125) |

|     |     |     |  OU|- exclusivo  |     |    |     |     |    |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | ---------------------- |
| 0   | 1   | 0   | 1   |     | 1   | 0   | 0   | 1   | 89 em binário           |
| 0   | 0   | 1   | 1   |     | 1   | 1   | 0   | 0   | 60 em binário           |
| F   | V   | V   | F   |     | F   | V   | F   | V   | OU-exclusivo bit a bit  |
| 0   | 1   | 1   | 0   |     | 0   | 1   | 0   | 1   | Resultado binário (101) |
