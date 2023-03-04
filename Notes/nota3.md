# Funções e métodos

```
  - me traz um retorno
  - f(x) = x + 3
  - regras
  - passo a passo
```

```
  - soma(2, 3) = 5
  - abrirPorta()
```

> Função é um conjunto de passos, ela também pode ter entradas(parâmetro) e também pode ter saídas(retorno)

## Sintaxe

```java
static void dizerOi() {
  System.out.println("oi");
}

static String retornarMensagemDeBoasVindas() {
  return "oi";
}

// double, float: com virgula
// int, long, short: inteiros
// char, String: texto
// void: vazio

// entrypoint: ponto de entrada
public static void main(String[] args) {
  //...

  System.out.println("oi");

}
```

## Motivações

- Reuso
- Melhoria na legibilidade

## Exemplos

```java
static somar(double a, double b) {
  return a + b;
}

public static void main(String[] args) {
  double a = 2, b =3;
  double resultado = somar(a, b)
  System.out.println("soma = " + resultado);
}
```
