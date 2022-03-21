/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.esercizio1_8_altra_versione;


/**
 *
 * @author tss
 */
public class Main {
    public static void main(String[] args) {
        if(args.length != 1){ //se non mi hai passato un parametro o più di un parametro
            System.err.println("devi passare un numero come parametro!!");
            System.exit(0); //termina programma
        }
        int x = Integer.parseInt(args[0]);
        String ris = analizza(x);
        System.out.println(x + " è " + ris);
    }
    public static String analizza(int x){
        String risultato;
        int n = 1;
        int sommaDivisori = 0;
        while (n < x) {
            if(x % n == 0){
                sommaDivisori += n; //vuol dire sommaDivisori = sommaDivisori + n;
            }
            n++;
         /* oppure
            n = n + 1;
            n += 1;
         */
        }
        System.out.println("La somma dei divisori è: " + sommaDivisori);
        if (x == sommaDivisori) {
            risultato =  "perfetto";
        }
        else if (x < sommaDivisori) {
            risultato =  "abbondante";
        }
        else {
            risultato =  "è difettivo";
        }
        return risultato;
    }
        
}
