package com.fatec;

public class Caixa {

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor){
        saldo -= valor;
    }

    public void depositar(double valor){
        saldo += valor;
    }
}
