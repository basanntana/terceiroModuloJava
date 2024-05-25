package br.com.alura.arrays;

import java.util.ArrayList;

public class ContaBancariaPrincipal {

//    Crie uma classe ContaBancaria com propriedades como número da conta e saldo.
//    Em seguida, crie uma lista de contas bancárias com diferentes saldos.
//    Utilize um loop para encontrar e imprimir a conta com o maior saldo.
    public static void main(String[] args) {


        var dadosConta = new ContaBancaria(1972.3, 6500.5);
        var dadosConta2 = new ContaBancaria(1973.5, 10000.9);
        var dadosConta3 = new ContaBancaria(2005.2,5000.5);

        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(dadosConta);
        contas.add(dadosConta2);
        contas.add(dadosConta3);


        ContaBancaria contaMaiorSaldo = contas.get(0);
        for (ContaBancaria dadosContas: contas) {
            if(dadosContas.getSaldo() > contaMaiorSaldo.getSaldo()){
                contaMaiorSaldo = dadosContas;
            }

        }
        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroConta() +
                ", Saldo: " + contaMaiorSaldo.getSaldo());
    }
}
