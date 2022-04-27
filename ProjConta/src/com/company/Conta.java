package com.company;

public abstract class Conta {
    private int id;
    private Cliente cliente;
    private double saldo;

    public Conta(int id, Cliente cliente){
        this.id =  id;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String  toString() {
        return "\nID da Conta = " + id + cliente.toString() +
                "Saldo = " + saldo;
    }

    public boolean depositar(double valor){
        if(valor > 0){
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }
}