/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.oo_dado;

/**
 *
 * @author tss
 */
public class Main {

    public static void main(String[] args) {
        Giocatore g = new Giocatore(10, 15, 5, 6);
        Dado dadoG = new Dado(6);
        Dado dadoB = new Dado(6);
        int conta = 1;
        do {
            dadoG.lancia();
            dadoB.lancia();
            stampaMano(conta, dadoG.getUltimoLancio(), dadoB.getUltimoLancio());
            if (g.getUltimoLancio() > dadoB.getUltimoLancio()) {
                g.incrementaSoldi();
                stampaGiocatore(g.getsoldi());
            } else {
                g.decrementaSoldi();
                stampaGiocatore(g.getsoldi());
            } conta++;
        } while (g.isContinua());
        System.out.println("Storia lanci giocatore: " + dadoG.getStoria());
        System.out.println("Storia lanci banco: " + dadoB.getStoria());
    }

    private static void stampaMano(int conta, int lancioG, int lancioB) {
        String msg = String.format("mano numero: %s banco: %s giocatore; %s", conta, lancioB, lancioG); //al posto di %s verranno inseriti conta, ecc, in ordine.
        System.out.println(msg);
    }

    private static void stampaGiocatore(int soldi) {
        System.out.println("soldi giocatore: " + soldi);
    }
}
