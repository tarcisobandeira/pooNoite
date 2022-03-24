package br.com.ia;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Historico {
    private String date;
    private String tipo;
    private String nomeConta;
    private double valor;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void addHistorico(String t, String nome, double v){
        date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        tipo = t;
        nomeConta = nome;
        valor = v;
    }

    @Override
    public String toString() {
        return "Historico:\n" +
                date + ", Tipo: " + tipo + ", Nome do Cliente: " + nomeConta + ", Valor: " + valor;
    }
}
