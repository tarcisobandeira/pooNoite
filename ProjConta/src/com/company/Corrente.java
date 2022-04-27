package com.company;

public class Corrente extends Conta{

    private double chequeEspecial;

    public Corrente(int id, Cliente cliente, double chequeEspecial) {
        super(id, cliente);
        this.chequeEspecial = chequeEspecial;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        if(valor <= (getSaldo() + chequeEspecial)){
            setSaldo(getSaldo()-valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + "\n" + "Limite do Cheque: " + chequeEspecial;
    }
}
