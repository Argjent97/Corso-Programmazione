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
    //volendo potrei inserire l'oggetto Dado all'interno di Giocatore:
    private Dado dado; //private Dado = new Dado(6); o lo inizializzo così oppure nel costruttore

    public Giocatore() {
        this(10,15, 5, 6);  //così si chiama un altro costruttore all'interno di un costruttore
    }

    
    public Giocatore(int soldi, int maxSoldi, int minSoldi, int facceDado) {
        this.dado = new Dado(facceDado); //così lo inizializzo nel costruttore
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
    
    public int getUltimoLancio(){
        return this.dado.getUltimoLancio(); //richiamo il metodo getUltimoLancio dall'oggetto Dado
    }
}
