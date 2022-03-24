package br.com.ia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarConta {

    private static List<Conta> c = new ArrayList<>();
    private static List<Historico> h = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opt = 0;
        do {
            System.out.println("Menu Principal");
            System.out.println("1. Nova Conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Emitir Saldo");
            System.out.println("5. Listar Conta");
            System.out.println("6. Historico");
            System.out.println("9. Sair");
            opt = Integer.parseInt(sc.nextLine());

            switch (opt){
                case 1:
                    cadastrarNovaConta();
                    break;
                case 2:
                    depositar();
                    break;
                case 3:
                    sacar();
                    break;
                case 4:
                    emitirSaldo();
                    break;
                case 5:
                    listarContas();
                    break;
                case 6:
                    historico();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Essa opcao nao existe.");
                    break;
            }
        }while (opt != 9);
    }

    public static void cadastrarNovaConta(){
        Conta conta = new Conta();
        System.out.println("Cadastrar nova conta");
        System.out.println("Digite o id: ");
        conta.setId(Integer.parseInt(sc.nextLine()));

        System.out.println("Digite o nome do cliente: ");
        conta.setNomeCliente(sc.nextLine());

        System.out.println("Digite o nome da agencia: ");
        conta.setAgencia(sc.nextLine());

        System.out.println("Conta cadastrada com sucesso.");
        c.add(conta);
    }

    public static void depositar(){
        int contaDeposito;
        Historico historico = new Historico();
        System.out.println("Digite o id da conta para o deposito: ");
        contaDeposito = Integer.parseInt(sc.nextLine());

        for (Conta conta : c){
            if(conta.getId() == contaDeposito){
                System.out.println("Digite o valor do deposito: ");
                double valor = Double.parseDouble(sc.nextLine());
                if(conta.depositar(valor)){
                    System.out.println("Deposito feito com sucesso.");
                    historico.addHistorico("D", conta.getNomeCliente(), valor);
                    h.add(historico);
                }else {
                    System.out.println("Valor invalido.");
                }
            }else {
                System.out.println("Esse id nao existe.");
            }
        }
    }

    public static void sacar(){
        int contaSaque;
        Historico historico = new Historico();
        System.out.println("Digite o id da conta para o saque: ");
        contaSaque = Integer.parseInt(sc.nextLine());

        for (Conta conta : c){
            if(conta.getId() == contaSaque){
                System.out.println("Digite o valor do saque: ");
                double valor = Double.parseDouble(sc.nextLine());
                if(conta.sacar(valor)){
                    System.out.println("Saque feito com sucesso.");
                    historico.addHistorico("S", conta.getNomeCliente(), valor);
                    h.add(historico);
                }else {
                    System.out.println("Valor invalido.");
                }
            }else {
                System.out.println("Esse id nao existe.");
            }
        }
    }

    public static void emitirSaldo(){
        int contaSaque;
        System.out.println("Digite o id da conta para emitir o saldo: ");
        contaSaque = Integer.parseInt(sc.nextLine());

        for (Conta conta : c){
            if(conta.getId() == contaSaque){
                System.out.println(conta);
            }
        }
    }

    public static void listarContas(){
        for (Conta conta : c){
            System.out.println("----------------------------");
            System.out.println(conta);
            System.out.println("----------------------------");
        }
    }

    public static void historico(){
        for(Historico historico : h){
            System.out.println("----------------------------");
            System.out.println(historico);
            System.out.println("----------------------------");
        }
    }
}
