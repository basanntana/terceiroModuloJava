package br.com.alura.arrays;

import java.util.ArrayList;

public class ProdutoExerPrincipal {

//    Crie uma classe Produto com propriedades como nome e preço.
//    Em seguida, crie uma lista de produtos e utilize um loop para calcular e imprimir o preço médio dos produtos.

    public static void main(String[] args) {

        var descricaoProduto = new ProdutoExer2("Gloss Fenty", 199.9);
        var descricaoProduto2 = new ProdutoExer2("Blush MAC", 150.7);
        var descricaoProduto3 = new ProdutoExer2("Base Maybelline", 250.9);


        ArrayList<ProdutoExer2> produtos = new ArrayList<>();
        produtos.add(descricaoProduto);
        produtos.add(descricaoProduto2);
        produtos.add(descricaoProduto3);

        double somaPrecos = 0;
        for (ProdutoExer2 produto : produtos) {
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos / produtos.size();
        System.out.println("Preço médio dos produtos: " + precoMedio);

    }
}
