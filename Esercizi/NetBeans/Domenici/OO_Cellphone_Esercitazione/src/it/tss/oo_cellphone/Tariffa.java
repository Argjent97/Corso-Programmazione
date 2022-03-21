/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.oo_cellphone;

import java.util.Objects;


/**
 *
 * @author tss
 */
public class Tariffa {

    private float prezzo;
    private String from;
    private String to;

    public Tariffa(String from, String to, float prezzo) {
        this.from = from;
        this.to = to;
        this.prezzo = prezzo;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.from);
        hash = 19 * hash + Objects.hashCode(this.to);
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
        final Tariffa other = (Tariffa) obj;
        if (!Objects.equals(this.from, other.from)) {
            return false;
        }
        return Objects.equals(this.to, other.to);
    }
    
    
    
}
