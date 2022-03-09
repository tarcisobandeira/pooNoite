package com.company;

public class Computador {

    public String marca;
    public String cor;
    public String modelo;
    public long numeroSerie;
    public double preco;

    public String imprimir(){
        return "----------------------\nMarca: " + marca
                + "\nCor: " + cor + "\nModelo: " + modelo
                + "\nNúmero de Série: " + numeroSerie
                + "\nPreço: " + preco + "\n----------------------";
    }

    public void calcularValor(){
        if(marca.equals("HP")){
            preco = preco * 1.3;
        }else if(marca.equals("IBM")){
            preco = preco * 1.5;
        }
    }

    public boolean alterarValor(double d){
        if(d>0){
            preco = d;
            return true;
        }
        return false;
    }

}
