package com.company;

import java.util.Scanner;

public class AcampamentoTeste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Acampamento membro = new Acampamento();


        System.out.println("Digite o nome do escoteiro: ");
        membro.nome = sc.nextLine();

        System.out.println("Digite a idade do escoteiro: ");
        membro.idade = Integer.parseInt(sc.nextLine());

        membro.separarGrupo();

        System.out.println(membro.imprimir());
    }
}
