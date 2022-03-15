package com.company;

import java.io.IOException;
import java.util.Scanner;

public class ContaTeste {

    static Conta cc = new Conta();
    static Scanner sn = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int opt = 0;
        do {
            System.out.println("1: Cadastrar\n2: Consultar\n3: Sacar\n4: Depositar\n5: Sair\n");

            opt = Integer.parseInt(sn.nextLine());

            switch (opt) {
                case 1:
                    execCadastrar();
                    break;
                case 2:
                    execConsultar();
                    System.in.read();
                    break;
                case 3:
                    execSacar();
                    break;
                case 4:
                    execDepositar();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Essa opção não existe.");
                    break;
            }
        }while (opt != 5);

    }

    public static void execCadastrar(){
        System.out.println("Digite o seu nome: ");
        cc.nomeCliente = sn.nextLine();
        System.out.println("Digite o número da conta: ");
        cc.conta = sn.nextLine();
        System.out.println("Digite o número da agencia: ");
        cc.agencia = sn.nextLine();
        System.out.println("Digite o saldo inicial: ");
        cc.saldo = Double.parseDouble(sn.nextLine());
    }

    public static void execConsultar(){
        System.out.println(cc.imprimir());
    }

    public static void execSacar(){
        System.out.println("Digite o valor do saque: ");
        double i = Double.parseDouble(sn.nextLine());
        if(cc.sacar(i)){
            System.out.println("Saque de: " + i + " realizado. Saldo atual: " + cc.saldo);
        }else{
            System.out.println("Não é possivel sacar. Saldo atual: " + cc.saldo);
        }
    }

    public static void execDepositar(){
        System.out.println("Digite o valor para o deposito: ");
        double i = Double.parseDouble(sn.nextLine());
        cc.depositar(i);
        System.out.println("Deposito de: " + i + " feito com sucesso. Saldo atual: " + cc.saldo);
    }
}
