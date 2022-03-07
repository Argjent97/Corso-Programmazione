/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.catalogo;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author tss
 */
public class ProvaMobile {

    public List<Mobile> scegliMobile(Catalogo<Mobile> c, double prezzo, int largh, int alt, int prof) {
        Predicate<Mobile> byPrezzo = (v -> v.getPrezzo() < prezzo);
        Predicate<Mobile> byLarghezza = (v -> v.getLarghezza() < largh);
        Predicate<Mobile> byAltezza = (v -> v.getAltezza() < alt);
        Predicate<Mobile> byProfondità = (v -> v.getProfondità() < prof);
        return c.getLista().stream().filter(byPrezzo.and(byLarghezza).and(byAltezza).and(byProfondità)).collect(Collectors.toList());
    }

}
