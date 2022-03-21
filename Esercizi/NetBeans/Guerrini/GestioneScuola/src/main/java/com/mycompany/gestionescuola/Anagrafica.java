/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionescuola;

/**
 *
 * @author tss
 */
public class Anagrafica {

    private final int id_anagrafica;
    private String cognome;
    private String nome;
    private String mail;

    public Anagrafica(int id_anagrafica, String cognome, String nome, String mail) {
        this.id_anagrafica = id_anagrafica;
        this.cognome = cognome;
        this.nome = nome;
        this.mail = mail;
    }

    public Anagrafica(int id_anagrafica, String cognome, String nome) {
        this.id_anagrafica = id_anagrafica;
        this.cognome = cognome;
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getId_anagrafica() {
        return id_anagrafica;
    }

    String getCSV() { //
        String ris = "";
        ris += id_anagrafica + ";" + cognome + ";" + nome + ";" + mail + "\n";
        return ris;
    }

}
