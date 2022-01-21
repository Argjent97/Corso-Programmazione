/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.esercizio1_8;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci il numero da analizzare");
        int x = sc.nextInt();
        int n = 1;
        int sommaDivisori = 0;
        while (n < x) {
            if(x%n == 0){
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
            System.out.println(x + " è perfetto");
        }
        else if (x < sommaDivisori) {
            System.out.println(x + " è abbondante");
        }
        else if (x > sommaDivisori) {
            System.out.println(x + " è difettivo");
        }
    }
}
