/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.array;

/**
 *
 * @author tss
 */
public class Main3 {
    public static void main(String[] args) {
        int[] x = {10,20,20,40,50};
        
        int[] y = {10,20,20,40,50};
        
        System.out.println("sono uguali " + (x == y));
        // uscirà falso perchè nonostante gli array contengano gli stessi dati, sono
        // due array diversi e separati fra di loro
    }
}
