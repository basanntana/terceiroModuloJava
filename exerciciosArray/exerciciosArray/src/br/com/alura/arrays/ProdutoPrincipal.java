package br.com.alura.arrays;

import java.util.ArrayList;

public class ProdutoPrincipal {

    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<>();

        Produto produto1 = new Produto("Sabão", 15.99, 5);
        Produto produto2 = new Produto("Detergente", 10.49, 8);

        produtos.add(produto1);
        produtos.add(produto2);

        System.out.println("Tamanho da lista: " + produtos.size());
        System.out.println("Produto na posição 0: " + produtos.get(0).getNome());

        Produto produtoNovo = new Produto("Shampoo", 15.99, 3);
        System.out.println(produtoNovo);

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Produto C", 12.75, 2, "2023-12-31");
        System.out.println(produtoPerecivel);


    }
}




