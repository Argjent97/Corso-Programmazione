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
public class Main1_5 {
    public static void main(String[] args) {
        int x; 
        int y; 
        int risultato = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci la base: ");
        x = sc.nextInt();
        System.out.println("Inserisci l'esponente: ");
        y = sc.nextInt();
        if(y < 0){
            System.out.println("L'esponente inserito è negativo, impossibile proseguire");
        }
        int conta = 1;
        while(conta <= y){
            int conta1 = 1;
            int ris = 0;
            while(conta1 <= x){
                ris = ris + risultato;
                conta1 = conta1 + 1;
            }
            risultato = ris;
            conta = conta + 1;
        }
        System.out.println("Il risultato è: " + risultato);
    }
}
