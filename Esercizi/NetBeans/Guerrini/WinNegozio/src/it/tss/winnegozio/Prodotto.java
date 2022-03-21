/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.winnegozio;

/**
 *
 * @author tss
 */
public class Prodotto {

    private final int idprod;
    private String nomeprod;
    private float prezzo;

    public Prodotto(int idprod, String nomeprod, float prezzo) {
        this.idprod = idprod;
        this.nomeprod = nomeprod;
        this.prezzo = prezzo;
    }

    public int getIdprod() {
        return idprod;
    }

    public String getNomeprod() {
        return nomeprod;
    }

    public void setNomeprod(String nomeprod) {
        this.nomeprod = nomeprod;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public String getCSVProd() {
        String ris = "";
        ris += idprod + ";" + nomeprod + ";" + prezzo + "\n";
        return ris;
    }

    @Override
    public String toString() {
        String ris = "";
        ris += "-------Scheda Prodotto-------";
        ris += "id prodotto: " + idprod;
        ris += "nomeprodotto: " + nomeprod;
        ris += "prezzo: " + prezzo + "\n";
        return ris;
    }

    
}
