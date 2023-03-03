```
 - inicialização
 - validação
 - atualização
```

```java
int contador = 1; // inicialização

while (contador <= 10) { // validação
  System.out.println(contador);
  contador++; // atualização
}
```

```java
int contador = 1; // inicialização

while (contador <= 10) { // validação
    contador++; // atualização
    System.out.println(contador);
}
```

```java
        int estoque = 11;
        int quantidadeDeVenda = 2;
        int quantidadeDeCompra = 5;
        // (paridade) tentar provar que sempre dá pra zerar o estoque
        // se tenho => vendo
        // se falta => compro

        while(estoque != 0) { // enquanto
            if(estoque > 0) {
                estoque -= quantidadeDeVenda;

                System.out.println("[Vendendo]Estoque atual: " + estoque);
            } else {
                estoque += quantidadeDeCompra;
                System.out.println("[Comprando]Estoque atual: " + estoque);
            }
        }

        System.out.println("fechou a loja!");
```

```java

```
