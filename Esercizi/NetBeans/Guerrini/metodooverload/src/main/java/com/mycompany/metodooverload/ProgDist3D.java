/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodooverload;


/**
 *
 * @author tss
 */
public class ProgDist3D {

    // si possono fare queste operazioni perchè sono metodi statici
    //METODI STATICI
    public static void main(String[] args) {
        
        /*

        //metodo per inserire tre numeri e ritorna un float
        float x, y, z;

        //chiamo il metodo per inserire tre numeri
        x = Tool.insNumero();
        System.out.println(x);

        y = Tool.insNumero("dimmi y:");
        System.out.println(y);

        z = Tool.insNumero("dimmi z:", 3);
        System.out.println(z);

        z = Tool.insValuta("quanto soldi hai perso oggi?");
        System.out.println(z);

        //richiamo il metodo giornoSettimana e stampo i soli casi del giorno indicati in parentesi
        
        System.out.println(Tool.giornoSettimana(7));
        System.out.println(Tool.giornoSettimana(4));
        System.out.println(Tool.giornoSettimana(1));

    }
*/
       
   float x,y,z;
   
   x= Tool.insNumero("dimmi x:");
   y= Tool.insNumero("dimmi y:");
   z= Tool.insNumero("dimmi z:");
   
   float distanza = Tool.dist3D (x,y,z);
   System.out.println ("x:  :" + x);
   System.out.println ("x:  :" + y);
   System.out.println ("x:  :" + z);
   
   System.out.println("distanza: " + distanza);
   //chiedo le dimensioni degli array
   int dim1= (int) Tool.insNumero("dimmi dim1: ");
   int dim2= (int) Tool.insNumero("dimmi dim2: ");
   //creo array con cui lavorare
   int ar1[] = new int[2000];
   int ar2[] = new int[dim2];
   int arOK[] = new int[dim1+dim2];
   ar1=Tool.loadDataInt(ar1, 500);
   ar2=Tool.loadDataInt(ar2, 5);
   arOK=Tool.concatenaArrays(ar1,ar2);
   System.out.println("primo elemento " + ar1[0]);
   
   int[] file1 = {123,234,354,456,354,234,123,234};
   int[] file= Tool.concatenaArrays(ar1, file1);
   int[] virus = {354,234,123};
   int posvirus = Tool.cercaVirus(file, virus);
  }
    
    

}