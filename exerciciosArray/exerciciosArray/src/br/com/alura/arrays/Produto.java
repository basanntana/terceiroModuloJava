package br.com.alura.arrays;

public class Produto {

//    Crie uma classe Produto com atributos como nome, preco, e quantidade.
//    Em seguida, crie uma lista de objetos Produto utilizando a classe ArrayList.
//    Adicione alguns produtos, imprima o tamanho da lista e recupere um produto pelo índice.


//    Implemente o método toString() na classe Produto para retornar uma representação em texto do objeto.
//    Em seguida, imprima a lista de produtos utilizando o método System.out.println().


//    Modifique a classe Produto para incluir um construtor que aceite parâmetros para inicializar os atributos.
//    Em seguida, crie objetos Produto utilizando esse novo construtor.

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String arCondicionado, double v) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }

}
