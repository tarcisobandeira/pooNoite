package com.company;

public class Acampamento {

    public String nome;
    public char equipe;
    public int idade;

    public String imprimir(){
        return "-------------------------\nNome: " + nome + "\nIdade: " + idade
                + "\nEquipe: " + equipe + "\n-------------------------";
    }

    public void separarGrupo(){
        if(idade < 6){
            equipe = '-';
        }else if(idade<=10){
            equipe = 'A';
        }else if(idade<=20){
            equipe = 'B';
        }else{
            equipe = 'C';
        }
    }

}
