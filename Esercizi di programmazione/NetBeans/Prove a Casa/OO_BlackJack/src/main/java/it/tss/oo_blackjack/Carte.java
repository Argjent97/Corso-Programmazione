/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.oo_blackjack;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author eigji
 */
public class Carte {

    private int ultimovalore;
    private String ultimoseme;
    private final int[][] nCarte = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13},
    {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13},
    {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13},
    {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13}};

    /*creo una copia vuota delle stesse dimensioni di nCarte perchè
    mi servirà per tener considerazioni delle carte già giocate*/
    private int[][] tmp = new int[4][13];
    private int i;
    private int j;
    private ArrayList<String> storia = new ArrayList<>();

    public Carte() {
    }

    public void chiama() {
        boolean trovato = false;
        while (!trovato) {
            Random rnd = new Random();
            j = rnd.nextInt(nCarte.length);
            Random rnd2 = new Random();
            i = rnd2.nextInt(nCarte[0].length);
            tmp = new int[4][13];
            if (tmp[j][i] != nCarte[j][i]) {
                tmp[j][i] = nCarte[j][i];
                trovato = true;
            }
        }
        String msg = String.format("Carta: %s", nCarte[j][i]);
        System.out.println(msg);
        //assegno ad ogni riga un seme
        if (j == 0) {
            System.out.println("Seme: cuori");
            ultimoseme = "cuori";
            System.out.println("--------------------");
        } else if (j == 1) {
            System.out.println("Seme: quadri");
            ultimoseme = "quadri";
            System.out.println("--------------------");
        } else if (j == 2) {
            System.out.println("Seme: picche");
            ultimoseme = "picche";
            System.out.println("--------------------");
        } else if (j == 3) {
            System.out.println("Seme: fiori");
            ultimoseme = "fiori";
            System.out.println("--------------------");
        }
        ultimovalore = nCarte[j][i];
        storia.add(String.valueOf(ultimovalore) + " " + ultimoseme);
    }

    public int[][] reset() {
        while (j < tmp.length && i < tmp[0].length) {
            tmp[j][i] = 0;
            i++;
            j++;
        }
        return tmp;
    }

    public int getUltimovalore() {
        return ultimovalore;
    }

    public ArrayList<String> getStoria() {
        return new ArrayList<>(storia);
    }

}
