/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package it.tss.agappuntamenti;

import java.time.LocalDate;
import java.time.LocalTime;

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
        Agenda agenda = new Agenda();

        Appuntamento ap1 = agenda.aggiungi(LocalDate.now(), LocalTime.of(14, 30), LocalTime.of(15, 30), "ivrea", "paola");

        Appuntamento ap2 = agenda.aggiungi(LocalDate.now(), LocalTime.of(16, 00), LocalTime.of(18, 30), "rivarolo", "marco");

        Appuntamento ap3 = agenda.aggiungi(LocalDate.now(), LocalTime.of(18, 30), LocalTime.of(19, 30), "rivarolo", "marco");

        Appuntamento ap4 = agenda.aggiungi(LocalDate.now().plusDays(1), LocalTime.of(16, 00), LocalTime.of(18, 30), "ivrea", "maria");

        Appuntamento ap5 = agenda.aggiungi(LocalDate.now().plusDays(10), LocalTime.of(16, 00), LocalTime.of(18, 30), "ivrea", "maria");

        agenda.cerca(null, "ivrea", "").forEach(System.out::println);

    }

}
