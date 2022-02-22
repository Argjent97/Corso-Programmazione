/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package it.tss.oo_library;

/**
 *
 * @author tss
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Book a = new Book("Argjent");
        Book b = new Book("Teresa");
        Book c = new Book("Manuela");
        Library library = new Library();
        
        library.addBook(a);
        library.addBook(a);
        library.addBook(b);
        library.addBook(c);
        library.addBook(b);
        library.addBook(c);
        library.printLoans();
        library.loanBook(a);
        library.printLoans();
        library.loanBook(a);
        library.returnBook(a);
        library.loanBook(a);
    }
    
}
