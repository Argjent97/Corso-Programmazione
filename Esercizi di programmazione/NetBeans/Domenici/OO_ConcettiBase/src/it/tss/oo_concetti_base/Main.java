/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package it.tss.oo_concetti_base;

/**
 *
 * @author tss
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A a = new A(); //A a è una dichiarazione di tipo statico, 
        a.m1();        //sa fare tutto ciò che sta nella classe A + la classe Object
        a.m2();        //new A è una dichiarazione di tipo dinamico.
        B b = new B();
        A aa = new B(); //Sì, l'importante è che l'oggetto che viene assegnato alla classe A
                        //sappia fare le cose all'interno della classe A.
        if(a instanceof B){ //per controllare se aa è un'istanza di B
            System.out.println("contiene un oggetto di tipo B");
        }else{
            System.out.println("non contiene un oggetti di tipo B");
        }
        //B bb = new A(); //NO...
        aa.m2();
        aa = new C();
        aa.m2();
    }
    
}
