/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.clinica;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author tss
 */
public class Clinica {

    private static List<Prenotazione> prenotazioni = new ArrayList<>();

    public void prenota(Specialista specialista, String paziente) {
        Prenotazione p = new Prenotazione(specialista, paziente);
        for (Prenotazione pr : prenotazioni) {
            if (pr.getPaziente().equals(p.getPaziente())) {
                return;
            }

        }
        prenotazioni.add(p);

    }

    public void cancellaPrenotazione(Specialista specialista, String paziente) {

        prenotazioni.removeIf(v -> v.getSpecialista().equals(specialista) && v.getPaziente().equals(paziente));
    }

    /* public void cancellaPrenotazione(Specialista specialista, String paziente) {
        
        Prenotazione p = new Prenotazione(specialista, paziente);

        prenotazioni.removeIf(v -> v.equals(p));
    }*/
    public Collection<String> getPrenotati(Specialista specialista) {
        List<Prenotazione> tmp = prenotazioni.stream().filter(v -> v.getSpecialista() == specialista).collect(Collectors.toList());
        Collection<String> ris = tmp.stream().map(v -> v.getPaziente()).collect(Collectors.toList());
        return ris;
    }
}
