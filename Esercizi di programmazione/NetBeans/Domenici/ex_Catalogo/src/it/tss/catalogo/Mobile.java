/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.catalogo;

/**
 *
 * @author tss
 */
public class Mobile implements Articolo {

    private String nome;
    private double prezzo;
    private int larghezza;
    private int altezza;
    private int profondità;

    public Mobile(String nome, double prezzo, int larghezza, int altezza, int profondità) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.profondità = profondità;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public int getAltezza() {
        return altezza;
    }

    public int getProfondità() {
        return profondità;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        String ris = "\n";
        ris += "Articolo: " + nome +"\n";
        ris += "Prezzo: " + prezzo + "\n\n";
        return ris;
    }

}
