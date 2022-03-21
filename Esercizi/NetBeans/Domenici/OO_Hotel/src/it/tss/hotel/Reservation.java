/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.hotel;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author tss
 */
public class Reservation {
    
    private final String nome;
    private final LocalDate from;
    private final LocalDate to;

    public Reservation(String nome, LocalDate from, LocalDate to) {
        this.nome = nome;
        this.from = from;
        this.to = to;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getFrom() {
        return from;
    }

    public LocalDate getTo() {
        return to;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.nome);
        hash = 47 * hash + Objects.hashCode(this.from);
        hash = 47 * hash + Objects.hashCode(this.to);
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
        final Reservation other = (Reservation) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.from, other.from)) {
            return false;
        }
        return Objects.equals(this.to, other.to);
    }

    @Override
    public String toString() {
        return "Prenotazione: " + "nome: " + nome + ", from: " + from + ", to: " + to;
    }

    
    
    
}
