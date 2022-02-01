/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionescuola;

/**
 *
 * @author tss
 */
public class Alunno {

    String nome;
    String cognome;
    String telefono = "---";
    String mail = "---";

    public Alunno() {
    }

    public Alunno(String cognome, String nome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public Alunno(String nome, String cognome, String telefono, String mail) {
        this.nome = nome;
        this.cognome = cognome;
        this.telefono = telefono;
        this.mail = mail;
    }

    void stampaInfo() {
        System.out.println("\n\n-------Scheda alunno-------");
        System.out.println("Il nome dell'alunno è: " + nome);
        System.out.println("Il cognome dell'alunno è: " + cognome);
        System.out.println("Il numeri di telefono è: " + telefono);
        System.out.println("La mail dell'alunno è: " + mail);
        System.out.println("---------------------------\n\n");
    }

}
