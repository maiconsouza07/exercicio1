package br.edu.univas;

public class Exercicio02 {
    private double saldo;
    private String titular;

     // Conta Bancaria abaixo.
    public Exercicio02(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getTitular() {
        return this.titular;
    }
}

