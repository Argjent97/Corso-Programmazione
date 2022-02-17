/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.oo_concetti_base;

/**
 *
 * @author tss
 */
public interface A {

    public default void m1(){ // aggiungendo default posso definire il metodo all'interfaccia
        System.out.println("m1");
    }
    public void m2();
}
