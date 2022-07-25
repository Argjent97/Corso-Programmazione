/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segna.control;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObject;
import segna.entity.Etichetta;
import segna.entity.Segnalibro;

/**
 *
 * @author tss
 */
@RequestScoped
@Transactional(Transactional.TxType.REQUIRED)
public class SegnalibroStore {

    @PersistenceContext
    EntityManager em;

    @Inject
    EtichettaStore etichettastore;

    public List<Segnalibro> findAllByUserCreated(Long id) {

        System.out.println("bookstore");
        System.out.println(id);

        return em.createQuery("select e from Segnalibro e where e.usr.id = :id and e.cancellato = false", Segnalibro.class)
                .setParameter("id", id)
                .getResultList();

    }

    public List<Segnalibro> findAllByUser(Long id) {

        System.out.println("segnastore");
        System.out.println(id);

        return em.createQuery("select e from Segnalibro e where (e.usr.id = :id) OR (e.usr.id <> :id and e.condiviso = 1) "
                + "and e.cancellato = false and e.usr.cancellato = false", Segnalibro.class)
                .setParameter("id", id)
                .getResultList();

    }

    public List<JsonObject> findAllForValidating(int page, int size) {

        List<Segnalibro> segnalibri = em.createQuery("select e from Segnalibro e where e.condiviso = 1 "
                + "and e.cancellato = false "
                + "and e.usr.cancellato = false ", Segnalibro.class)
                .setFirstResult((page - 1) * size)
                .setMaxResults(size)
                .getResultList();

        List<JsonObject> jbook = new ArrayList<>();

        for (Segnalibro segna : segnalibri) {

            JsonObject jb = Json.createObjectBuilder()
                    .add("IdSegna", segna.getId().toString())
                    .add("descrizione", segna.getDescrizione())
                    .add("link", segna.getLink())
                    .add("Utente", segna.getUsr().getFirstName())
                    .add("condiviso", segna.getCondiviso())
                    .add("DtCreazione", segna.getCreazione().toString())
                    .add("Tags", segna.tagstostring())
                    .build();

            jbook.add(jb);
        }

        return jbook;

    }

    public List<JsonObject> findAllByUserJson(Long id, int page, int size) {

        List<Segnalibro> segnalibri = em.createQuery("select e from Segnalibro e where ((e.usr.id = :id) OR (e.usr.id <> :id and e.condiviso = 1)) "
                + "and e.cancellato = false and e.usr.cancellato = false "
                + "order by e.creazione desc", Segnalibro.class)
                .setParameter("id", id)
                .setFirstResult((page - 1) * size)
                .setMaxResults(size)
                .getResultList();

        List<JsonObject> jbook = new ArrayList<>();

        for (Segnalibro segna : segnalibri) {

            JsonObject jb = Json.createObjectBuilder()
                    .add("idSegna", segna.getId().toString())
                    .add("descrizione", segna.getDescrizione())
                    .add("link", segna.getLink())
                    .add("utente", segna.getUsr().getFirstName())
                    .add("condiviso", segna.getCondiviso())
                    .add("dtcreazione", segna.getCreazione().toString())
                    .add("dtaggiornamento", segna.getAggiornamento().toString())
                    .add("utenteagg", segna.getUsragg().getFirstName())
                    .add("Tags", segna.tagstostring())
                    .add("mail", segna.getUsr().getEmail())
                    .build();

            jbook.add(jb);
        }

        return jbook;

    }

    public List<JsonObject> findSegnaJson(Long id) {

        List<Segnalibro> segnalibri = em.createQuery("select e from Segnalibro e where e.id = :id", Segnalibro.class)
                .setParameter("id", id)
                .getResultList();

        List<JsonObject> jbook = new ArrayList<>();

        for (Segnalibro segna : segnalibri) {

            JsonObject jb = Json.createObjectBuilder()
                    .add("idSegna", segna.getId().toString())
                    .add("descrizione", segna.getDescrizione())
                    .add("link", segna.getLink())
                    .add("utente", segna.getUsr().getFirstName())
                    .add("condiviso", segna.getCondiviso())
                    .add("dtcreazione", segna.getCreazione().toString())
                    .add("dtaggiornamento", segna.getAggiornamento().toString())
                    .add("utenteagg", segna.getUsragg().getFirstName())
                    .add("Etichette", segna.tagstostring())
                    .add("mail", segna.getUsr().getEmail())
                    .build();

            jbook.add(jb);
        }

        return jbook;
    }

    public Optional<Segnalibro> find(Long id) {
        Segnalibro found = em.find(Segnalibro.class, id);
        return found == null ? Optional.empty() : Optional.of(found);
    }

    public Segnalibro save(Segnalibro entity) {

        return em.merge(entity);

    }

    public void deleteByUser(Long id) {
        findAllByUser(id).stream().map(Segnalibro::getId).forEach(this::delete);
    }

    public void delete(Long id) {

        Segnalibro found = em.find(Segnalibro.class, id);
        found.setCancellato(true);
        save(found);

    }

    public void addEtich(Segnalibro found, String etichetta) {

        Segnalibro toupdate = em.find(Segnalibro.class, found.getId());

        Etichetta saved = etichettastore.saveIfNotExists(etichetta);
        toupdate.getTags().add(saved);
        save(toupdate);
    }

    public void removeEtich(Long id, String etichetta) {

        final Segnalibro toupdate = find(id).get();
        Optional<Etichetta> found = etichettastore.byName(etichetta);
        if (found.isPresent()) {
            toupdate.getTags().remove(found.get());
            save(toupdate);
        }
    }

}
