package com.company;

import com.Entities.Pessoa;
import com.Entities.Professor;

import java.util.Scanner;

public class Main {
    static Pessoa p = new Pessoa();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int opt = 0;

        opt = sc.nextInt();

        switch (opt){
            case 1:
                inserir();
                break;
        }
    }

    public static void inserir(){
        System.out.println("Digite o codigo do aluno: ");
        int i = sc.nextInt();

        System.out.println("Digite o nome do aluno: ");
        String a = sc.next();

        System.out.println("Digite o email do aluno: ");
        String email = sc.next();


        p.setCodigo(i);
        p.setNome(a);
        p.setEmail(email);

        System.out.println("Codigo: " +p.getCodigo()+ "\nNome: " +p.getNome() + "\nEmail: " + p.getEmail());
    };

    public void deletar(){

    };

    public void transferir(){

    };
}
