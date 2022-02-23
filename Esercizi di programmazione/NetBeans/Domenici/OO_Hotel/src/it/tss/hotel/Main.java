/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package it.tss.hotel;

import java.time.LocalDate;
import java.time.Month;

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
        Room r = new Room();
        r.reserve("argjent", LocalDate.of(2022, Month.MARCH, 15), LocalDate.of(2022, Month.MARCH, 30));
        r.reserve("argjent", LocalDate.of(2022, Month.MAY, 15), LocalDate.of(2022, Month.MAY, 30));
        r.reserve("argjent", LocalDate.of(2022, Month.FEBRUARY, 25), LocalDate.of(2022, Month.MARCH, 14));
        r.reserve("argjent", LocalDate.of(2022, Month.JUNE, 25), LocalDate.of(2022, Month.JULY, 14));
        r.reservations().forEach(v -> System.out.println(v));
        
        //1 prenoto con l'inizio = fine di un'altra prenotazione
        //r.reserve("giovanna", LocalDate.of(2022, Month.MAY, 28), LocalDate.of(2022, Month.JUNE, 14));
        
        //2 fine = inizio, non va
        r.reserve("giovanna", LocalDate.of(2022, Month.JANUARY, 30), LocalDate.of(2022, Month.FEBRUARY, 25));
        
        //3 
        r.reserve("giovanna", LocalDate.of(2022, Month.MAY, 10), LocalDate.of(2022, Month.MAY, 31));
    }
    
}
