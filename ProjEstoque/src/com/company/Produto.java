package com.company;

public class Produto {
    public int idProduto;
    public String descricao;
    public long quantidade;
    public long nivel;
    public double valor;

    public boolean entrada(long l){
        if(l > 0){
            quantidade += l;
            return true;
        }
        return false;
    }

    public boolean saida(long l){
        if(l <= quantidade && l > 0){
            quantidade -= l;
            return true;
        }
        return false;
    }

    public void imprimir(){
        System.out.println("----------------------");
        System.out.println("ID Produto: " + idProduto);
        System.out.println("Descricao: " + descricao);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Nivel: " + nivel);
        System.out.println("Valor: " + valor);
        System.out.println("----------------------");
    }

    public void checarNivel(){
        if(nivel > quantidade){
            System.out.println("Nivel abaixo do disponivel, " +
                    "avisar o setor de compras.");
        }else{
            System.out.println("Nivel OK.");
        }
    }
}
