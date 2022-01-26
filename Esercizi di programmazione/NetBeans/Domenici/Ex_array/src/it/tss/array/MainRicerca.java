/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.array;

import java.util.Random;

/**
 *
 * @author tss
 */
public class MainRicerca {
    public static void main(String[] args) {
        int[] input = generaArrayCasuale(10,10);
        ArraysTools.stampa(input);
        ArraysTools.avg(input);
        ArraysTools.ricerca(input, 7);
        ArraysTools.max(input);
        ArraysTools.min(input);
    }
    /**
     * 
     * @param ncelle numero di celle dell'array
     * @param max massimo intero contenuto nell'array
     * @return 
     */
    private static int[] generaArrayCasuale(int ncelle, int max) {
        int[] ris = new int[ncelle];
        for (int i = 0; i < ris.length; i++) {
            ris[i] = generaNumeroCasuale(max);
            
        }
        return ris;
    }

    private static int generaNumeroCasuale(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }
    
}
