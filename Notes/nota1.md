# Introdução a Programação Orientada a Objetos

## Problema motivador

- Situação inicial: apenas um aluno.

```java
String username = "hgrafa";
String password = "123";
double nota = 8.5;
int idade = 21;
```

- Situação com 100 alunos

```java
String[] username = new String[100];
String[] password = new String[100];
double[] nota = new double[100];
int[] idade = new int[100];
```

- subproblema: trocando duas variáveis

```java
int a = 2, b = 3;
int aux = a;
a = b;
b = aux;
```

- Problema: Tentando trocar duas pessoas, não é possível ter uma solução 100% genérica.

## Com POO

Classe: molde
Objeto: fruto desse molde

## Elementos de uma classe

- tem
- faz
- é (...)
