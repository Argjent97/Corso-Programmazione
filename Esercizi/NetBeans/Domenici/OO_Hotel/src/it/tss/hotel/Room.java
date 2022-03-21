/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author tss
 */
public class Room {

    private final List<Reservation> prenotazioni = new ArrayList<>();

    public Reservation reserve(String nome, LocalDate from, LocalDate to) {
        Reservation p = new Reservation(nome, from, to);
        if (isOccupata(p)) {
            throw new IllegalArgumentException("Periodo occupato");
        }
        prenotazioni.add(p);
        return p;
    }

    public List<Reservation> reservations() {
        Comparator<Reservation> comp = (r1, r2) -> r1.getFrom().compareTo(r2.getFrom());
        return prenotazioni.stream().sorted(comp).collect(Collectors.toList());
    }

    private boolean isOccupata(Reservation nuova) {
        Predicate<Reservation> inizioNonValido = (r)
                -> !nuova.getFrom().isBefore(r.getFrom()) && !nuova.getFrom().isAfter(r.getTo());
        Predicate<Reservation> fineNonValida = (r)
                -> !nuova.getTo().isBefore(r.getFrom()) && !nuova.getTo().isAfter(r.getTo());
        Predicate<Reservation> tuttoNonValido = (r)
                -> nuova.getFrom().isBefore(r.getFrom()) && nuova.getTo().isAfter(r.getTo());
        return prenotazioni.stream().anyMatch(inizioNonValido.or(fineNonValida).or(tuttoNonValido));
    }

}
