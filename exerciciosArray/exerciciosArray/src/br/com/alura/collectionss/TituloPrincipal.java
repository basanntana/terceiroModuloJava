package br.com.alura.collectionss;

import java.util.ArrayList;
import java.util.Collections;

public class TituloPrincipal {

    public static void main(String[] args) {

//No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma lista.
//Utilize o método Collections.sort para ordenar a lista e, em seguida, imprima os títulos ordenados.

        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(new Titulo("D"));
        listaTitulos.add(new Titulo("A"));
        listaTitulos.add(new Titulo("B"));

        Collections.sort(listaTitulos);

        for (Titulo titulo : listaTitulos) {
            System.out.println(titulo.getNome());
        }

    }
}
