/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.oo_library;


import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author tss
 */
public class Book {

    private final String titolo;
    private boolean prestato = false;
    private LocalDateTime data;

    public Book(String titolo) {
        this.titolo = titolo;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
    

    public void setPrestato(boolean prestato) {
        this.prestato = prestato;
    }

    public String getTitolo() {
        return titolo;
    }

    public boolean isPrestato() {
        return prestato;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.titolo);
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
        final Book other = (Book) obj;
        return Objects.equals(this.titolo, other.titolo);
    }

    @Override
    public String toString() {
        return "titolo: " + titolo;
    }
    
    

}
