/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.catalogo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author tss
 * @param <E>
 */
public class Catalogo<E extends Articolo> implements Iterable{

    private final List<E> lista = new ArrayList<>();

    public void aggiungiArticolo(E art) {
        lista.add(art);
    }

    public List<E> getArticoliSottoPrezzo(double prezzo) {
        return lista.stream().filter(v -> v.getPrezzo() < prezzo).collect(Collectors.toList());
    }

    public List<E> getLista() {
        return new ArrayList<>(lista);
    }
    
    

    /*@Override
    public String toString() {
        String ris = "";
        ris += "--------CATALOGO---------\n";
        for (E art : lista) {
            ris += art;
        }
        ris += "--------FINE CATALOGO ----------\n";
        return ris;

    }
    */
    
        @Override
    public String toString() {
        StringBuilder risultato = new StringBuilder();
        for (E art : lista) {
            risultato.append("\n").append(art);
        }
        return risultato.toString();

    }

    @Override
    public Iterator<E> iterator() {
        return lista.iterator();
    }
    
    


}
