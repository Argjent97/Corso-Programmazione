/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.winnegozio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author tss
 */
public class Vendita {

    private final int idvendita;
    private int qntV;
    private float prezzoivato;
    private LocalDate data;
    private float ricavo;

    public Vendita(int idscontrino, int venduti, float prezzoivato, LocalDate data, float ricavo) {
        this.idvendita = idscontrino;
        this.qntV = venduti;
        this.prezzoivato = prezzoivato;
        this.data = data;
        this.ricavo = ricavo;
    }

    public int getIdvendita() {
        return idvendita;
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

    public void setPrezzoivato(float prezzoivato) {
        this.prezzoivato = prezzoivato;
    }

    
}
