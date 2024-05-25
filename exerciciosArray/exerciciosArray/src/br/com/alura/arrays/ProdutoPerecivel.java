package br.com.alura.arrays;

public class ProdutoPerecivel extends Produto{

//    Crie uma classe ProdutoPerecivel que herde de Produto.
//    Adicione um atributo dataValidade e um construtor que utilize o construtor da classe mãe (super)
//    para inicializar os atributos herdados. Crie um objeto ProdutoPerecivel e imprima seus valores.

    String dataValidade;
    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }
}
