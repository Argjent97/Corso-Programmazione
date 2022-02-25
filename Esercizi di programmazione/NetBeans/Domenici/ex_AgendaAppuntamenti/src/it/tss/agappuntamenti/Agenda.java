/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.agappuntamenti;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author tss
 */
public class Agenda {

    private final List<Appuntamento> appuntamenti = new ArrayList<>();

    public Appuntamento aggiungi(LocalDate data, LocalTime oraIni, LocalTime oraFin, String luogo, String persona) {
        Objects.requireNonNull(data);
        oraIni = Objects.requireNonNullElse(oraIni, LocalTime.MIN);
        oraFin = Objects.requireNonNullElse(oraFin, LocalTime.MAX);
        if(data.isBefore(LocalDate.now())){
            throw new RuntimeException("La data inserita non può precedere la data corrente");
        }
        Appuntamento result = new Appuntamento(data, oraIni, oraFin, luogo, persona);
        boolean isInvalid = appuntamenti.stream().anyMatch(v -> v.invalid(result));
        if(isInvalid){
            throw new RuntimeException("L'appuntamento non è valido");
        }
        appuntamenti.add(result);
        return result;
    }

    public void cancella(Appuntamento a) {
        appuntamenti.remove(a);
    }

    public void cancella(LocalDate data) {
        appuntamenti.removeIf(v -> v.getData().equals(data));
    }

    public void cancella(LocalDate data, String luogo, String persona) {
        appuntamenti.removeAll(cerca(data, luogo, persona));
    }

    public List<Appuntamento> cerca(LocalDate data, String luogo, String persona) {
        Predicate<Appuntamento> byDate = v -> data == null || v.getData().equals(data);
        Predicate<Appuntamento> byLuogo = v -> luogo == null || luogo.isBlank() || v.getLuogo().equals(luogo);
        Predicate<Appuntamento> byPersona = v -> persona == null || persona.isBlank() || v.getPersona().equals(persona);
        return appuntamenti.stream()
                .filter(byDate.and(byLuogo).and(byPersona))
                .collect(Collectors.toList());
    }

    public void stampa() {
        System.out.println("-----> INIZIO AGENDA <------\n");
        //appuntamenti.forEach(v -> System.out.println(v));
        appuntamenti.forEach(System.out::println);
        System.out.println("-----> FINE AGENDA <------\n\n");
        //appuntamenti.forEach(this::stampaAppuntamento); in questo modo posso richiamarlo dalla mia stessa classe
    }

    private void stampaAppuntamento(Appuntamento a) {

    }
}
