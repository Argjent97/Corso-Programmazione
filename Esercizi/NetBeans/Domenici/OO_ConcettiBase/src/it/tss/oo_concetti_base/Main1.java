/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.oo_concetti_base;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tss
 */
public class Main1 {

    public static void main(String[] args) {
        List<A> list = new ArrayList<>();
        list.add(new B());
        list.add(new A());
        list.add(new B());
        list.add(new C());
    }
    
    public static void m2(List<A> list){
        for (A a : list) {
            
        }
    }
}
