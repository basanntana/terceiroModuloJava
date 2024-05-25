package br.com.alura.collectionss;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaModificada {

    //Modifique o Exercício 4 para declarar a variável de lista como a interface List,
    //demonstrando o uso de polimorfismo.

    public static void main(String[] args) {

        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);
    }
}
