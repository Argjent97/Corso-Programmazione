/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package it.tss.oo_blackjack;

import java.util.Scanner;

/**
 *
 * @author eigji
 */
public class BlackJack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valoriG = 0;
        int valoriD = 0;
        Carte carte = new Carte();
        Giocatore g = new Giocatore(10, 15, 5);
        Giocatore d = new Giocatore();
        while(g.isContinua()){
            carte.chiama();
            valoriD += carte.getUltimovalore();
            for (int i = 0; i < 2; i++) {
                carte.chiama();
                valoriG += carte.getUltimovalore();
            }

            Scanner sc = new Scanner(System.in);
            stampaValoriD(valoriD);
            stampaValoriG(valoriG);
            System.out.println("---------------------------");
            boolean prosegui = true;
            while (valoriG < 21 && prosegui) {
                System.out.println("Vuoi un'altra carta? [0 = no, 1 = sì]:");
                int n = sc.nextInt();
                if (n == 0) {
                    prosegui = false;
                } else if (n == 1) {
                    carte.chiama();
                    valoriG += carte.getUltimovalore();
                    stampaValoriD(valoriD);
                    stampaValoriG(valoriG);
                    System.out.println("---------------------------");
                }
            }
            carte.chiama();
            valoriD += carte.getUltimovalore();
            stampaValoriD(valoriD);
            stampaValoriG(valoriG);
            System.out.println("---------------------------");
            if((valoriD>valoriG && valoriD<=21)||valoriG>21){
                System.out.println("\n Hai perso :(");
                g.decrementaSoldi();
            }else if((valoriD<valoriG && valoriG<=21)||valoriD>21){
                System.out.println("\n HAI VINTO!!!");
                g.incrementaSoldi();
            }else if(valoriD==valoriG){
                System.out.println("\n Pareggio.");
            }
            stampaSoldi(g.getsoldi());
            valoriD = 0;
            valoriG = 0;
            carte.reset();
        }
        stampaSoldi(g.getsoldi());
    }

    public static void stampaValoriG(int valori) {
        System.out.println("\n Totale giocatore: " + valori);
    }

    public static void stampaValoriD(int valori) {
        System.out.println("\n Totale dealer: " + valori);
    }
    
    public static void stampaSoldi(int soldi){
        System.out.println("\n ---------> Soldi rimanenti: " + soldi +" <---------");
        System.out.println("---------------------------");
    }
}
