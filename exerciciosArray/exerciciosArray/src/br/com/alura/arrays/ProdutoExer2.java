package br.com.alura.arrays;

public class ProdutoExer2 {

//    Crie uma classe Produto com propriedades como nome e preço.
//    Em seguida, crie uma lista de produtos e utilize um loop para calcular e imprimir o preço médio dos produtos.

     private String nome;
     private double preco;

    public ProdutoExer2(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }


    public double getPreco() {
        return preco;
    }


    @Override
    public String toString() {
        return this.getNome() + this.getPreco();
    }
}
