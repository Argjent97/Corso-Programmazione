/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.array;

/**
 *
 * @author tss
 */
public class Main4 {

    public static void main(String[] args) {
        int[] array = {40, 50, 60, 70, 80};
        int[] virus = {80};
        int i = 0;
        int j = 0;
        boolean trovato = false;
        while (i <= (array.length - virus.length) && !trovato) {
            boolean ok = true;
            while (j < virus.length && ok) {
                if (array[i] != virus[j]) {
                    i++;
                    ok = false;
                } else {
                    i++;
                    j++;
                }
            }
            if (ok) {
                trovato = true;
            } else {
                j = 0;
            }
        }
        System.out.println(trovato);
    }

}
