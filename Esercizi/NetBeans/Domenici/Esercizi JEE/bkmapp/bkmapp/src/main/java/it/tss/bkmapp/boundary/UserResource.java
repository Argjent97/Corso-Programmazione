/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.bkmapp.boundary;

import it.tss.bkmapp.control.BookmarkStore;
import it.tss.bkmapp.control.UserStore;
import it.tss.bkmapp.entity.Bookmark;
import it.tss.bkmapp.entity.User;
import java.util.List;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;

/**
 *
 * @author tss
 */
public class UserResource {

    @Inject
    private UserStore store;
    
    @Inject
    BookmarkStore bookmarkStore;

    private Long id;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(description = "Restituisce la risorsa utente identificata dall'ID")
    @APIResponses({
        @APIResponse(responseCode = "200", description = "Utente ritornato con successo"),
        @APIResponse(responseCode = "404", description = "Utente non trovato")
    })
    public User find() {
        return store.find(id).orElseThrow(() -> new NotFoundException("user non trovato. id=" + id));
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(description = "Aggiorna i dati dell'utente")
    @APIResponses({
        @APIResponse(responseCode = "200", description = "Nuovo utente creato con successo")
    })
    public User update(@Valid User entity) {
        store.find(id).orElseThrow(() -> new NotFoundException("user non trovato. id=" + id));
        entity.setId(id);
        return store.save(entity);
    }

    
    @DELETE
    @Operation(description = "Elimina una risorsa Utente tramite l'ID")
    @APIResponses({
        @APIResponse(responseCode = "200", description = "Utente eliminato con successo"),
        @APIResponse(responseCode = "404", description = "Utente non trovato")

    })
    public void delete() {
        User found = store.find(id).orElseThrow(() -> new NotFoundException("user non trovato. id=" + id));
        store.delete(found.getId());
    }

    
    @GET
    @Path("bookmarks")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(description = "Restituisce l'elenco di tutti i bookmarks dell'Utente")
    @APIResponses({
        @APIResponse(responseCode = "200", description = "Elenco ritornato con successo")
    })
    public List<Bookmark> bookmarks() {
        return bookmarkStore.byUser(id);
    }
    
    @POST
    @Path("bookmarks")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(description = "Crea un nuovo Bookmark per l'Utente")
    @APIResponses({
        @APIResponse(responseCode = "200", description = "Elenco ritornato con successo")
    })
    public Response createBookmark(@Valid Bookmark entity) {
        Bookmark saved = bookmarkStore.save(entity);
        return Response.status(Response.Status.CREATED)
                .entity(saved)
                .build();
    }

    /*
    getter setter
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
