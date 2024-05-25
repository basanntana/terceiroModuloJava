package br.com.alura.arrays;

public class AnimaisPrincipal {
//    Modifique o Exercício 2 para incluir uma verificação usando instanceof para
//    garantir que o objeto seja do tipo correto antes de fazer o casting.

    public static void main(String[] args) {

//        Cachorro primeiroC = new Cachorro("Bolt", 5);
//
//        Animal animal = (Animal) primeiroC;
//
//        System.out.println("o nome do primeiro animal é: " + animal);


        Animal animal = new Cachorro("Bolt",5);

        if (animal instanceof Cachorro && animal.getIdade() > 2) {
            System.out.println("o nome do primeiro animal é: " + animal);
            // Agora você pode usar o objeto 'cachorro' como um Cachorro.
        } else {
            System.out.println("O objeto não é um Cachorro.");
        }
    }
}
