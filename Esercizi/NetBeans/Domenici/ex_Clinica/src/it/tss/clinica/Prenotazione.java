/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.clinica;

import java.util.Objects;

/**
 *
 * @author tss
 */
public class Prenotazione {

    private Specialista specialista;
    private String paziente;

    public Prenotazione(Specialista specialista, String paziente) {
        this.specialista = specialista;
        this.paziente = paziente;
    }

    public Specialista getSpecialista() {
        return specialista;
    }

    public String getPaziente() {
        return paziente;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.specialista);
        hash = 23 * hash + Objects.hashCode(this.paziente);
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
        final Prenotazione other = (Prenotazione) obj;
        if (!Objects.equals(this.paziente, other.paziente)) {
            return false;
        }
        return this.specialista == other.specialista;
    }

    @Override
    public String toString() {
        String ris = "";
        ris += paziente;
        return ris;
    }



}
