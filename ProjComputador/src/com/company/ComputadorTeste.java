package com.company;

import java.util.Scanner;

public class ComputadorTeste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Computador c = new Computador();

        System.out.println("Digite a marca do computador: ");
        c.marca = sc.nextLine();

        System.out.println("Digite a cor do computador: ");
        c.cor = sc.nextLine();

        System.out.println("Digite o modelo do computador: ");
        c.modelo = sc.nextLine();

        System.out.println("Digite o número de série do computador: ");
        c.numeroSerie = Integer.parseInt(sc.nextLine());

        System.out.println("Digite o preço do computador: ");
        c.preco = sc.nextDouble();

        c.calcularValor();

        System.out.println(c.imprimir());

        System.out.println("Digite um valor maior que zero caso queria alterar o preço: ");
        if(c.alterarValor(sc.nextDouble())){
            System.out.println("O valor foi alterado.");
        }else{
            System.out.println("O valor não foi alterado.");
        }

        System.out.println(c.imprimir());

    }
}
