/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.winnegozio;

import java.time.LocalDate;

/**
 *
 * @author tss
 */
public class Vendita {

    private int qntV;
    private final float IVA = 22;
    private float prezzoivato;
    private LocalDate data;
    private float ricavo;

    public Vendita() {
    }
    
    public Vendita(int venduti, float prezzoivato, LocalDate data, float ricavo) {
        this.qntV = venduti;
        this.prezzoivato = prezzoivato;
        this.data = data;
        this.ricavo = ricavo;
    }

    public int getQntV() {
        return qntV;
    }

    public void setQntV(int qntV) {
        this.qntV = qntV;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public float getRicavo() {
        return ricavo;
    }

    public void setRicavo(float ricavo) {
        this.ricavo = ricavo;
    }

    public float getPrezzoivato() {
        return prezzoivato;
    }

    public void setPrezzoivato(float prezzo) {
        float valoreiva = (prezzo/100)*IVA;
        this.prezzoivato = prezzo + valoreiva;
    }

    
}
