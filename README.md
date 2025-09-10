<p align="center">
    <img src="https://upload.wikimedia.org/wikipedia/en/3/30/Java_programming_language_logo.svg" alt="Java logo" width="100"/>
</p>

<br>

<p align="center">
  <img src="https://img.shields.io/badge/status-in%20progress-green" alt="status" />
</p>

<br>

This README is also available in [🇧🇷 Portuguese](README.pt.md)

# Learning Java
This repository contains exercises, explanations, notes developed based on the [Complete Java Course - Object-Oriented Programming + Projects](https://www.udemy.com/course/java-curso-completo/?srsltid=AfmBOor14nRT5sp1sHdTBJcIekjZcpPGDS4cR6vX7PaktXu8lt0-m--) taught by Nelio Alves on Udemy.

Each folder represents a learning stage and will continue to be updated as the course progresses and as I keep learning.  

The purpose of this repository is to acquire knowledge and document my progress during the course, practice Git and GitHub and serve as review and reference material for the future.


### Repository Structure

- `1 - Programming Logic`  
  This file contains the first part of the course. Here there are some notes, exercises and examples of basic Programming logic and algorithm in Java.  
  It's divided by: a (sections 4 and 5 of the course), b (section 6), c (section 7) and d (extra exercise).
    - a1 - Outputs  
      The different types of print.
    - a2 - Input  
      The Scanner.
    - a3 - Math Functions  
      Functions to square root, power and module.
    - a4 - Logic operators & Conditional structure  
      Logic Operators including and, or, not and conditional structure (if/else)
    - a5 - Exercises  
      Practicing the topics learned.
    - a6 - Optional-structures  
      Other options to conditional structure including switch case and ternary operator.

    - b - Looping-Constructs Iteration-Statements  
      Looping structures including While, For and do-while
    
    - c1 - Variable names  
      Conventional names.
    - c2 - Bitwise operators  
      Logic operators to work bit to bit
    - c3 - String methods  
      Some interesting methods to use with String.
    - c4 - Functions  
      Function syntax.

    - d - Exercise  
      An extra exercise to practice.

- `2 - Object-Oriented Programming - Part1`  
  _In progress._  
  This file contains the introduction to Object-Oriented Programming (OOP).  

  - `a - Introduction to OOP`  
    It is divided in 2 projects used as examples (a, b), exercises (c) and explanation/exercises about static members (d).

    - `a - Project 1 - Triangle`  
      A project that calculates the area of 2 triangles, and tell which area is bigger.  
      It is divided in 3 parts...
        1. Without the use of OOP
        2. Including OOP
        3. Including Cohesion

      This project represents the first contact with the POO concepts in Java!  

    - `b - Project 2 - Stock`  
      Simple project simulating stock management where a product will have the data: name, price, and quantity in stock, and will include the operations of adding to and removing from stock.  
      This project also includes teaching the toString method.

    - `c - Exercises`  
      Three exercises to practice OOP.  
      1. `Rectangle` -> calculates the area, perimeter and diagonal of a rectangle, based on its sides.
      2. `Salary` -> calculates the salary of the employee based on a percentage of increase
      3. `Student aproved` -> calculates if a student was approved or not based on their grades.

    - `d - Static members`  
      Contains the explanation of static members and a exercise.  
    
  - `b - Constructor-this-overloading-encapsulation`  
    - `a - Constructors`  
      Use the stock project to explain the use of constructors and the word _`this`_.  
    
    - `b - Overloading`   
      Explanation and example about overloading.  

    - `c - Extra_notes.md`  

- `2° OOP - stock`  
  Project with five versions, each one adding new concepts:
  - Version 1: Initial structure with a `Product` class and basic operations.
  - Version 2: Inclusion of the `toString()` method for product information.
  - Version 3: Addition of a custom constructor.
  - Version 4: Overloading, allowing both default and custom constructors.
  - Version 5: Inclusion of encapsulation using `get` and `set` methods.

- `exercicio1_aluno_aprovado` _(student_approved)_  
  Simple program to calculate a student's average grade based on three scores and verify if the student is approved.

- `exercicio3_bankAccount`  
  Basic simulation of a bank account, demonstrating encapsulation, use of `this`, and good constructor practices.

- `exercicio4_vetores` _(vectors)_  
  Contains the exercises:
  - exercicio_1 _(exercise_1)_:  
    Reads the name and price of X products and calculates the average price.
  - exercicio_2 _(exercise_2)_:  
    Reads the name, age and height of X people and displays the average height, the percentage of people under 16 years old and their names.
  - exercicio_3 _(exercise_3)_:  
    Reads X numbers and returns the largest one and its corresponding position.
  - exercicio_4 _(exercise_4)_:  
    Receives the values of 2 vectors (A and B) and, based on them, calculates the resulting vector.
  - exercicio_5_usandoForEach _(exercise_5_usingForEach)_:  
    Simulation where a hotel has 10 rooms (from 0 to 9) and they will be rented out to X people.  
    The program will read the name, email and the room the person will rent and in the end, it will display the rooms that are occupied.
