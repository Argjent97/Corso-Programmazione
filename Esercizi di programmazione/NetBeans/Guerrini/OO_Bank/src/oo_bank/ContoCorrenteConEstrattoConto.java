/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo_bank;

import java.util.ArrayList;

/**
 *
 * @author tss
 */

public class ContoCorrenteConEstrattoConto extends ContoCorrente { //questa classe è un'estensione di ContoCorrente
    private ArrayList<Integer> movimenti = new ArrayList<>();
    public ContoCorrenteConEstrattoConto(String intestatario){
        super(intestatario); //chiama il costruttore della classe padre
    }
    
    public ArrayList<Integer> getMovimenti(){
        return new ArrayList<>(this.movimenti);
    }

    @Override                           //richiamo il metodo del padre e lo modifico, nel main verrà richiamato questo metodo modificato.
    public void deposito(int somma) {
        super.deposito(somma);
        movimenti.add(somma);
    }

    @Override
    public void prelievo(int somma) {
        super.prelievo(somma); 
        movimenti.add(-somma);
    }
    
    
    
    
}
