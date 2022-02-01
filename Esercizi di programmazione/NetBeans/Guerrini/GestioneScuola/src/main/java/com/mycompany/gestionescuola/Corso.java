/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionescuola;

import java.util.Date;

/**
 *
 * @author tss
 */
public class Corso {

    // area attributi o proprietà
    String nomecorso;
    String descrizione;
    int durataore;
    Date datainizio;
    String link = "www.ciacformazione.it";
    // una struttura per caricare i possibili 30 alunni(registro)
    Alunno[] registro = new Alunno[30];
    // elenco Alunni da inserire

    // costruttori
    public Corso() {
        nomecorso = "NN";
        durataore = 0;
        descrizione = "---";
        datainizio = new Date();
    }

    public Corso(String nomecorso, int durataore) {
        this.nomecorso = nomecorso;
        this.durataore = durataore;
        this.descrizione = "---";
        datainizio = new Date();
    }

    public Corso(String nomecorso, int durataore, String descrizione) {
        this.nomecorso = nomecorso;
        this.durataore = durataore;
        this.descrizione = descrizione;
        datainizio = new Date();
    }

    void insertAlunno(Alunno alunno, int pos) {
        registro[pos] = alunno;

    }

    void insertAlunno(Alunno alunno) {

        int pos = 0;
        for (int i = 0; i < registro.length; i++) {
            if (registro[i] == null) {
                pos = i;
                break;
            }

        }

        registro[pos] = alunno;

    }

    // area metodi o capacità, abilità
    void stampaInfo() {
        System.out.println("\n\n-------Scheda corso-------");
        System.out.println("Nome del corso: " + nomecorso);
        System.out.println("Durata del corso: " + durataore);
        System.out.println("Descrizione del corso: " + descrizione);
        System.out.println("Data inizio del corso: " + datainizio.toString());
        System.out.println("Link del corso: " + link);
        System.out.println("--------------------------\n\n");
    }

}
