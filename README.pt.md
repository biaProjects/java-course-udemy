<p align="center">
    <img src="https://upload.wikimedia.org/wikipedia/en/3/30/Java_programming_language_logo.svg" alt="Java logo" width="100"/>
</p>

<br>

<p align="center">
    <img src="https://img.shields.io/badge/Status-Em%20Andamento-green" alt="Status" />
</p>

<br>

Este README também está disponível em [🇺🇸 English](README.md)

# Aprendendo Java
Este repositório contém exercícios, explicações, anotações desenvolvidas com base no  [Curso Completo de Java – Programação Orientada a Objetos + Projetos](https://www.udemy.com/course/java-curso-completo/?srsltid=AfmBOor14nRT5sp1sHdTBJcIekjZcpPGDS4cR6vX7PaktXu8lt0-m--) ministrado por Nelio Alves na Udemy.

Cada pasta representa uma etapa de aprendizado e continuará sendo atualizada conforme o curso progredir e à medida que eu continuar aprendendo.

O objetivo deste repositório é adquirir conhecimento, documentar meu progresso durante o curso, praticar Git e GitHub, e servir como material de revisão e referência para o futuro.

### Estrutura do Repositório

- `1 - Programming Logic` -> (_Lógica de programação_)  
  Este arquivo contém a primeira parte do curso. Aqui há algumas anotações, exercícios e exemplos de lógica básica de programação e algoritmo em Java.  
  Está dividido em: a (seções 4 e 5 do curso), b (seção 6), c (seção 7) e d (exercício extra).

    - a1 - Outputs -> (_Saídas_)  
      Os diferentes tipos de impressão.
    - a2 - Input -> (_Entrada_)  
      O Scanner.  
    - a3 - Math Functions -> (_Funções matemáticas_)      
      Funções para raiz quadrada, potência e módulo.
    - a4 - Logic operators & Conditional structure-> (_Operadores Lógicos & Estrutura Condicional_)    
      Operadores lógicos incluindo e, ou, não e estrutura condicional (if/else)
    - a5 - Exercises -> (_Exercícios_)  
      Praticando os tópicos aprendidos.
    - a6 - Optional-structures -> (_Estruturas Opcionais_)  
      Outras opções para estrutura condicional incluindo switch case e operador ternário.

    - b - Looping-Constructs Iteration-Statements ->(_Estruturas de Repetição - Instruções de Iteração_)  
      Estruturas de repetição incluindo While, For e do-while
    
    - c1 - Variable names -> (_Nomes de Variáveis_)  
      Nomes convencionais.
    - c2 - Bitwise operators -> (_Operadores Bitwise_)  
      Operadores lógicos para trabalhar bit a bit
    - c3 - String methods -> (_Métodos de String_)  
      Alguns métodos interessantes para usar com String.
    - c4 - Functions -> (_Funções_)  
      Sintaxe de funções.

    - d - Exercise -> (_Exercício_)  
      Um exercício extra para praticar.

- `2 - Object-Oriented Programming - Part1` -> (_Programação Orientada a Objetos_)  
  _Em andamento_  
  Esse arquivo contém a introdução à Programação Orientada a Objetos (POO).  

  - `a - Introduction to OOP` -> (_Introdução a POO_)    
    É dividido em 2 projetos usados como exemplos (a, b), exercícios (c) e explicação/exercícios sobre membros estáticos (d).
    
    - `a - Project 1 - Triangle` -> (_Projeto 1 - Triângulo_)  
      Um projeto que calcula a área de 2 triângulos e informa qual área é maior.  
      Está dividido em 3 partes:
        1. Sem o uso de POO
        2. Incluindo POO
        3. Incluindo coesão
      
      Este projeto representa o primeiro contato com conceitos de POO em Java!

    - `b - Project 2 - Stock` -> (_Projeto 2 - Estoque_)  
      Projeto simples de uma simulação de estoque onde um produto terá os dados nome, preço e quantidade em estoque e possuirá as operações de entrada e saída do estoque.  
      Este projeto também inclui o ensino do método toString

    - `c - Exercises` -> (_Exercícios_)  
      Três exercícios para praticar POO.  
      1. `Rectangle` -> calcula a área, perímetro e diagonal de um retângulo, baseado em seus lados.
      2. `Salary` -> calcula o salário de um funcionário baseado numa porcentagem de aumento. 
      3. `Student aproved` -> calcula se um aluno foi aprovado ou não baseado em suas notas.

    - `d - Static members` -> (_Membros estáticos_)  
      Contém a explicação de membros estáticos e um exercício.

- `2° OOP - stock`  _(estoque)_  
  Projeto com cinco versões, cada uma acrescentando novos conceitos:
  - Versão 1: Estrutura inicial com classe `Product` e operações básicas.
  - Versão 2: Inclusão do método `toString()` para informações do produto.
  - Versão 3: Adição de um construtor personalizado.
  - Versão 4: Sobrecarga, permitindo tanto o construtor padrão quanto o personalizado.  
  - Versão 5: Inclusão de encapsulamento, com uso de métodos `get` e `set`.  

- `exercicio1_aluno_aprovado`  
  Programa simples para cálculo da média de um aluno com base em três notas e verificação de aprovação.

- `exercicio2_membros_estaticos`  
  Possui 2 subprojetos:
  - Projeto 1:  
    Conversor de moedas: Projeto extra com uma classe que converte valores em dólar para real.
    
  - Projeto 2:  
    Cálculo de circunferência e volume.
    - Versão 1 – todos os métodos estão na mesma classe principal.
    - Versão 2 – com delegação: Criação de uma classe separada com os métodos, aplicando o princípio da delegação.
    - Versão 3 – com `static`: Mesmos métodos, agora utilizando membros estáticos.

- `exercicio3_bankAccount` _(conta bancária)_  
  Simulação básica de uma conta bancária, demonstrando encapsulamento, uso de `this` e boas práticas com construtores.

- `exercicio4_vetores`  
  Possui 2 exercícios:
  - exercicio_1:  
    Lê o nome e preço de X produtos e calcula a média de preços.
  - exercicio_2:  
    Lê o nome, a idade e a altura de X pessoas e informa a altura média, porcentagem de menores de 16 anos e quais são seus nomes.
  - exercicio_3:  
    Lê X números e retorna o maior deles e sua respectiva posição.
  - exercicio_4:  
    Recebe os valores de 2 vetores (A e B) e, a partir deles, cálcula o vetor resultante.
  - exercicio_5_usandoForEach:  
    Simulação onde um hotel tem 10 quartos (de 0 a 9) e serão alugados para X pessoas.  
    O programa lerá o nome, email e quarto que a pessoa irá alugar e no final, informará os quartos que estão ocupados.
