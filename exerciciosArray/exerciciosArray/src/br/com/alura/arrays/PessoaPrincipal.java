package br.com.alura.arrays;

import java.util.ArrayList;

public class PessoaPrincipal {

//    Crie uma classe Pessoa com atributos como nome, idade, e um método toString que represente esses atributos.
//    No método main da classe Principal, crie um ArrayList de Pessoa chamado listaDePessoas.
//    Adicione pelo menos três pessoas à lista utilizando o método add.
//    Imprima o tamanho da lista utilizando o método size.
//    Imprima a primeira pessoa da lista utilizando o método get.
//    Imprima a lista completa

    public static void main(String[] args) {



        var pessoa1 = new Pessoa("Barbara",24);
        var pessoa2 = new Pessoa("Heitor",18 );
        var pessoa3 = new Pessoa("Beatriz",27);



        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        System.out.println("Quantidade de pessoas inscritas " + pessoas.size());
        System.out.println("Primeiro nome da lista: " + pessoas.get(0));

        System.out.println("Lista de Pessoas: ");
        for (Pessoa pessoa: pessoas) {
            System.out.println(pessoa);
        }







    }
}
