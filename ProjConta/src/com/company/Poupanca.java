package com.company;

public class Poupanca extends Conta{

    private int diaAniversario;

    public Poupanca(int id, Cliente cliente, int diaAniversario) {
        super(id, cliente);
        this.diaAniversario = diaAniversario;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + "\n" + "Dia do Aniversario: " + diaAniversario;
    }
}
