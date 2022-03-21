/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package it.tss.jdbc;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author tss
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbscuola");
        EntityManager em = emf.createEntityManager();
        
        /* em.createQuery("select e from Corso e ", Corso.class)
                .getResultList()
                .forEach(System.out::println);
        Corso tosave = new Corso();
        tosave.setTitolo("jakarta EE");
        tosave.setInizio(LocalDate.now());
        tosave.setCosto(BigDecimal.valueOf(120,50));
        tosave.setDurata(120);
        tosave.setDescrizione("applicazioni web con jakarta EE");
        tosave.setCreatoIl(LocalDate.now());
        
        em.getTransaction().begin();
        
        em.persist(tosave);
        
        em.getTransaction().commit();*/
        
        em.createQuery("select e from Docente e order by e.costo DESC")
                .getResultList()
                .forEach(System.out::println);
    }
}
