package com.company;

import java.util.Scanner;

public class GerenciarProduto {

    static Produto p = new Produto();
    static Scanner sn = new Scanner(System.in);

    public static void main(String[] args) {
        int opt = 0;
        do {
            System.out.println("Menu Principal");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Registrar Entrada");
            System.out.println("3. Registrar Saida");
            System.out.println("4. Consultar");
            System.out.println("5. Apresentar Nivel");
            System.out.println("6. Sair");
            System.out.println("\nSua opcao: ");

            opt = Integer.parseInt(sn.nextLine());

            switch (opt){
                case 1:
                    execCadastrar();
                    break;
                case 2:
                    execDarEntrada();
                    break;
                case 3:
                    execDarSaida();
                    break;
                case 4:
                    exercConsultar();
                    break;
                case 5:
                    execMostrarNivel();
                    break;
                case 6:
                       break;
                default:
                    System.out.println("Essa opcao nao existe.");
                    break;
            }
        } while (opt != 6);
    }

    public static void execCadastrar(){
        System.out.println("Digite o ID do Produto: ");
        p.idProduto = Integer.parseInt(sn.nextLine());
        System.out.println("Digite a Descricao do produto: ");
        p.descricao = sn.nextLine();
        System.out.println("Digite a quantidade no estoque: ");
        p.quantidade = Long.parseLong(sn.nextLine());
        System.out.println("Digite o nivel para o estoque: ");
        p.nivel = Long.parseLong(sn.nextLine());
        System.out.println("Digite o valor do produto: ");
        p.valor = Double.parseDouble(sn.nextLine());
        System.out.println("Produto cadastrado.");
    }

    public static void execDarEntrada(){
        if(p.descricao != null){
            System.out.println("Digite o valor para a entrada do estoque: ");
            long l = (Long.parseLong(sn.nextLine()));
            if(p.entrada(l)){
                System.out.println("Quantidade: " + l + " foi adicionada ao produto "
                        + p.descricao + ". Estoque atual: " + p.quantidade);
            }else{
                System.out.println("Quantidade nao pode ser menor ou igual a zero.");
            }
        }else {
            System.out.println("Voce nao cadastrou o produto.");
        }
    }

    public static void execDarSaida(){
        if(p.descricao != null){
            System.out.println("Digite o valor para a saida do estoque: ");
            long l = (Long.parseLong(sn.nextLine()));
            if(p.saida(l)){
                System.out.println("Quantidade: " + l + " foi retirada do produto "
                        + p.descricao + ". Estoque atual: " + p.quantidade);
            }else{
                System.out.println("Quantidade nao pode ser menor que zero, igual " +
                        "a zero ou maior que a quantidade do produto.");
            }
        }else {
            System.out.println("Voce nao cadastrou o produto.");
        }
    }

    public static void execMostrarNivel(){
        if(p.descricao != null){
            p.checarNivel();
        }else{
            System.out.println("Voce nao cadastrou o produto.");
        }
    }

    public static void exercConsultar(){
        if(p.descricao != null){
            p.imprimir();
        }else{
            System.out.println("Voce nao cadastrou o produto.");
        }
    }
}
