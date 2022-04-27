package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cliente cl = new Cliente();
        cl.setId(1);
        cl.setNome("Lora");

        Corrente cc = new Corrente(111, cl, 5000.0);
        Poupanca p = new Poupanca(222, cl, 26);
        cc.depositar(5000.0);
        p.depositar(1000);

        System.out.println(cc.toString());
        System.out.println(p.toString());
    }
}
