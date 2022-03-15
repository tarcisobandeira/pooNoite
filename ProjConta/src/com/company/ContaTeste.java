package com.company;

import java.util.Scanner;

public class ContaTeste {

    Conta cc = new Conta();

    public void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        do {
            int opt = 0;
            System.out.println("1: Cadastrar\n2: Consultar\n3: Sacar\n4: Depositar\n\n");
            opt = sn.nextInt();

            switch (opt) {
                case 1:
                    execCadastrar();
                    break;
                case 2:
                    execConsultar();
                    break;
                case 3:
                    execSacar();
                    break;
                case 4:
                    execDepositar();
                    break;
                default:
                    System.out.println("Essa opção não existe.");
                    break;
            }
        }while ();

    }

    public void execCadastrar(){

    }

    public void execConsultar(){
        cc.imprimir();
    }

    public void execSacar(){

    }

    public void execDepositar(){

    }
}
