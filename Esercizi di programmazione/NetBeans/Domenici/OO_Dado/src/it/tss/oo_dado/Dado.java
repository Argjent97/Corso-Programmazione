/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.oo_dado;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author tss
 */
public class Dado {
    private final int numeroFacce; // final significa che quando andrò a dare il valore di numeroFacce quello rimarrà invariato.
    private int ultimoLancio;
    private ArrayList<Integer> storia = new ArrayList<>();

    public Dado(int nFacce) {
        this.numeroFacce = nFacce;
    }
    
    public void lancia(){
        Random rnd = new Random();
        ultimoLancio = rnd.nextInt(numeroFacce - 1)+1;
        storia.add(ultimoLancio);
    }

    public int getNumeroFacce() {
        return numeroFacce;
    }

    public int getUltimoLancio() {
        return ultimoLancio;
    }
    
    public ArrayList<Integer> getStoria(){
        return new ArrayList<>(storia); //creo una copia dell'array storia poichè ritornando solo this.storia
    }                                   //il valore di storia, anche se privato, potrebbe essere modificato esternamente
    
    
    
    
}
