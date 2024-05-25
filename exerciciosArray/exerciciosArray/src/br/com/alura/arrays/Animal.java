package br.com.alura.arrays;

public class Animal {

//    Crie uma classe Animal e uma classe Cachorro que herda de Animal.
//    Em seguida, crie um objeto da classe Cachorro e faça o casting para a classe Animal.

    private String nome;
    private int idade;


    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return this.getNome() + " e tem " + getIdade() + " anos de idade.";
    }
}
