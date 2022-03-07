/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.catalogo;

import java.util.Iterator;

/**
 *
 * @author tss
 */
public class Main {

    public static void main(String[] args) {
        Catalogo<Mobile> catalogo = new Catalogo<>();
        Mobile armadio = new Mobile("Armadio", 250, 800, 200, 50);
        Mobile comodino = new Mobile("Comodino", 150, 50, 80, 40);
        //provo metodi Catalogo<>
        catalogo.aggiungiArticolo(armadio);
        catalogo.aggiungiArticolo(comodino);
        System.out.println(catalogo);
        System.out.println(catalogo.getArticoliSottoPrezzo(260));
        
        //provo metoto di ProvaMobile
        ProvaMobile prova = new ProvaMobile();
        System.out.println(prova.scegliMobile(catalogo, 260, 900, 300, 60));
        
        
        //provo iterator
        
        /*Iterator<Mobile> iterator = catalogo.iterator();
         while(iterator.hasNext()){
            Mobile m = iterator.next();
            System.out.println(m);
        }
         */
    }

}
