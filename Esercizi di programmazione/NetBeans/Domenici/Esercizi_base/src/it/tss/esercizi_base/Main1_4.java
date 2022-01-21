/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.esercizi_base;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class Main1_4 {
    public static void main(String[] args){
        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci la base: ");
        x = sc.nextInt();
        System.out.println("Inserisci l'esponente: ");
        y = sc.nextInt();
        if (y < 0) {
            System.out.println("Impossibile eseguire la potenza con esponente negativo");
        }
        int calcola = y;
        int risultato = 1;
        while(calcola > 0){
            risultato = x * risultato;
            calcola = calcola - 1;
        }
        System.out.println("Il risultato è: " + risultato);      
    }
}
