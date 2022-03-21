/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionescuola.services;

import com.mycompany.gestionescuola.entity.Anagrafica;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author tss
 */
public class IscrizioniService {
   
        private EntityManager em;
    
    public IscrizioniService(){
        this.em = DbManager.getInstance().getEM();
    }
    
    public List<Anagrafica> findByCorso(Long id){
        return em.createQuery("select e.anagrafica from Iscrizione e where e.corso.id = :corso_id", Anagrafica.class)
                .setParameter("coros_id", id)
                .getResultList();
    }
}
