/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.oo_library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tss
 */
public class Library {

    private List<Book> libri;

    public Library() {
        this.libri = new ArrayList<>();
    }
    
    

    public List<Book> getLibri() {
        return libri;
    }

    
    public boolean addBook(Book libro) {
        boolean presente = libri.contains(libro);
        if (presente) {
            System.out.println("Libro già presente.");
            return false;
        }
        libri.add(libro);
        System.out.println("Libro aggiunto alla libreria");
        return true;
    }

    public boolean loanBook(Book libro) {
        boolean presente = libri.contains(libro);
        if (presente && libro.isPrestato() == false) {
            libro.setPrestato(true);
            System.out.println(libro + " sta venendo prestato.");
            return true;
        } else if (presente && libro.isPrestato() == true) {
            System.out.println(libro + " presente ma già prestato.");
            return false;
        } else if (!presente) {
            throw new IllegalArgumentException("Libro non presente nella libreria!");
        }
        return false;
    }

    public boolean returnBook(Book libro) {
        boolean presente = libri.contains(libro);
        if (presente && libro.isPrestato() == false) {
            throw new IllegalArgumentException("Il libro non è stato prestato.");
        } else if (presente && libro.isPrestato() == true) {
            libro.setPrestato(false);
            return true;
        }
        return false;
    }

    public void printLoans() {
        for (Book book : libri) {
            if (book.isPrestato() == true) {
                System.out.println(book);
            }

        }
    }


}
