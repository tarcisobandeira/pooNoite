package com.company;

public class Conta {
    public String conta;
    public String agencia;
    public double saldo;
    public String nomeCliente;

    public boolean sacar(double i){
        if(saldo > 0 && i < saldo){
            saldo -= i;
            return true;
        }
        return false;
    }

    public void depositar(double i){
        saldo += i;
    }

    public String imprimir(){
        return  "--------------------------\nNome do Cliente: " + nomeCliente
                + "\nConta: " + conta
                + "\nAgencia: " + agencia
                + "\nSaldo: " + saldo + "\n--------------------------\n";
    }
}
