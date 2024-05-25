package br.com.alura.arrays;

public class ContaBancaria {

//    Crie uma classe ContaBancaria com propriedades como número da conta e saldo.
//    Em seguida, crie uma lista de contas bancárias com diferentes saldos.
//    Utilize um loop para encontrar e imprimir a conta com o maior saldo.

    private double numeroConta;
    private double saldo;

    public ContaBancaria(double numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public double getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
