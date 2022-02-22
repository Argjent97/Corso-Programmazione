/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.oo_cellphone;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tss
 */
public class Cellphone {

    private String telefono;
    private String gestore;
    private List<Tariffa> tariffe;

    public Cellphone(String telefono, String gestore) {
        this.telefono = telefono;
        this.gestore = gestore;
        this.tariffe = new ArrayList<>();
    }
    
    public void setCost(Tariffa tariffe, float prezzo){
            tariffe.setPrezzo(prezzo);
            this.tariffe.add(tariffe);
    }
    
    
            




}
