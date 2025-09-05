Este exercício foi resultado de um enunciado elaborado pelo ChatGPT com o intuito de praticar os tópicos estudados nessa parte do curso.

## Enunciado:
### 🧠 Desafio de Programação em Java — Cadastro e Análise de Nomes

Você foi contratado para desenvolver um sistema simples de cadastro e análise de nomes em Java. O programa deverá ter:

#### ✅ **Requisitos obrigatórios:**

1. **Entrada de dados com `Scanner`:**  
    O usuário deverá informar quantos nomes deseja cadastrar. Em seguida, ele digitará todos os nomes separados por vírgula em uma única linha (ex: `João,Maria,Carlos,Ana`).
    
2. **Uso da função `split`:**  
    Separe os nomes digitados usando a função `split`.
    
3. **Laços de repetição:**  
    Percorra os nomes para exibir:
    
    - Cada nome em uma linha.
        
    - O total de caracteres de cada nome.
        
4. **Condicional:**  
    Para cada nome, verifique:
    
    - Se o nome tem mais de 5 letras, exiba: `"Nome longo"`
        
    - Caso contrário, exiba: `"Nome curto"`
        
5. **Definição de função `public static`:**  
    Crie pelo menos duas funções auxiliares:
    
    - Uma para verificar se o nome é longo ou curto.
        
    - Outra para contar os caracteres de um nome.
        
---

### 🔄 **Exemplo de Execução Esperada:**

```
Quantos nomes você quer cadastrar?
4
Digite os nomes separados por vírgula:
João,Maria,Carlos,Ana

Nome: João | Caracteres: 4 | Nome curto
Nome: Maria | Caracteres: 5 | Nome curto
Nome: Carlos | Caracteres: 6 | Nome longo
Nome: Ana | Caracteres: 3 | Nome curto
```

#

### Possíveis dificuldades ao longo do caminho:  
- Não esqueça da questão abordada em [a2 - Input](https://github.com/biaProjects/curso-java-nelio-alves/blob/master/1%20-%20Programming%20Logic/a2%20-%20Input/Notes.md) sobre o `sc.nextLine();` 
