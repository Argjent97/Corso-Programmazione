/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.oo_dado;

/**
 *
 * @author tss
 */
public class Giocatore {

    private int soldi;
    private final int maxSoldi;
    private final int minSoldi;

    public Giocatore(int soldi, int maxSoldi, int minSoldi) {
        this.soldi = soldi;
        this.maxSoldi = maxSoldi;
        this.minSoldi = minSoldi;
    }

    public void incrementaSoldi() {
        soldi++;
    }

    public void decrementaSoldi() {
        soldi--;
    }

    public int getsoldi() {
        return soldi;
    }

    public boolean isContinua() {
        return soldi > minSoldi && soldi < maxSoldi;
    }
}
