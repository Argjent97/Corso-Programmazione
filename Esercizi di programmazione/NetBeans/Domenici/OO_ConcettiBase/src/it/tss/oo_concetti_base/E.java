/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.oo_concetti_base;

/**
 *
 * @author tss
 */
public class E implements IE {

    public final void m1() { //posso evitare che i figli facciano l'ovveride di un metodo
        System.out.println("m1");   //aggiungendo final ad uno dei metodi
    }

    public void m2() {
        System.out.println("m2");
    }

    public void m4() {
        System.out.println("m4");
    }
}
