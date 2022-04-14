/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.world.control;

import it.tss.world.entity.City;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 *
 * @author tss
 */
@Transactional(Transactional.TxType.REQUIRES_NEW)
@RequestScoped
public class CityStore {

    @PersistenceContext
    EntityManager em;

    public List<City> all() {
        return em.createQuery("select e from City e order by e.name DESC", City.class)
                .setMaxResults(100)
                .getResultList();
    }
}
