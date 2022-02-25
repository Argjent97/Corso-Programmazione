/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.wincalcio;

import java.util.Objects;

/**
 *
 * @author tss
 */
public class Classifica {
    
    private String nome;
    private int punteggio;

    public Classifica(String nome, int punteggio) {
        this.nome = nome;
        this.punteggio = punteggio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }
    
    public String getCSVClass(){
         String ris = "";
        ris += nome + ";" + punteggio + "\n";
        return ris;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.nome);
        hash = 67 * hash + this.punteggio;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Classifica other = (Classifica) obj;
        if (this.punteggio != other.punteggio) {
            return false;
        }
        return Objects.equals(this.nome, other.nome);
    }
    
    
    
}
