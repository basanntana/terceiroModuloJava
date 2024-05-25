package br.com.alura.arrays;

public class Pessoa {

    private String nome;
    private int idade;

    //aplicando construtores no código
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override //sobrescrita do método existente do Java
    public String toString() {
        return "Pessoa: " + nome + " (Idade: " + idade + ")";
    }
}
