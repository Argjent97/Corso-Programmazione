/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segna.boundary;

import segna.control.SegnalibroStore;
import segna.entity.User;
import segna.control.UserStore;
import segna.security.JWTManager;
import java.time.LocalDateTime;
import java.util.List;
import javax.annotation.security.DenyAll;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.json.JsonObject;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.container.ResourceContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import org.eclipse.microprofile.jwt.Claim;
import org.eclipse.microprofile.jwt.JsonWebToken;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import segna.entity.Segnalibro;

/**
 *
 * @author tss
 */
@Path("/segnalibri")
@Tag(name = "Gestione di Segnalibri", description = "Permette di gestire Segnalibri")
@DenyAll
public class SegnalibroResources {

    @Inject
    private SegnalibroStore storesegna;

    @Inject
    private UserStore storeuser;

    @Context
    ResourceContext rc;

    @Context
    UriInfo uriInfo;

    @Inject
    private JWTManager jwtManager;

    @Inject
    private JsonWebToken token;

    @Claim(value = "sub")
    private String sub;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(description = "Restituisce tutti Segnalibri di un utente")
    @APIResponses({
        @APIResponse(responseCode = "200", description = "Elenco restituito con successo"),
        @APIResponse(responseCode = "404", description = "Elenco non trovato")
    })
    @RolesAllowed({"User"})
    public List<JsonObject> all(@DefaultValue("1") @QueryParam("page") int page, @DefaultValue("10") @QueryParam("size") int size) {
        System.out.println(token);
        User usr = storeuser.findUserbyLogin(token.getName()).orElseThrow(() -> new NotFoundException("user non trovato. id=" + token.getName()));
        System.out.println("Cerca segnalibri per " + usr.toString());
        return storesegna.findAllByUserJson(usr.getId(), page, size);
    }

    @GET
    @Path("/new")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(description = "Restituisce tutti i Segnalibri di uno utente")
    @APIResponses({
        @APIResponse(responseCode = "200", description = "Elenco ritornato con successo"),
        @APIResponse(responseCode = "404", description = "Elenco non trovato")
    })
    @PermitAll
    public Response allnew(@DefaultValue("1") @QueryParam("page") int page, @DefaultValue("10") @QueryParam("size") int size) {
        //System.out.println(token);
        //User usr = storeuser.findUserbyLogin(token.getName()).orElseThrow(() -> new NotFoundException("user non trovato. id=" + token.getName()));
        System.out.println("Cerca segnalibri per " + 1);

        //     return storebook.findAllByUserJson(Long.getLong("1"), 1,1000);
        return Response.status(Response.Status.OK)
                .header("intPage", 10)
                .header("intReg", 1000)
                //  .(storebook.findAllByUserJson(Long.getLong("1"), 1,1000))
                .build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(description = "Restituisce uno specifico Segnalibro di un utente")
    @APIResponses({
        @APIResponse(responseCode = "200", description = "Segnalibro singolo di un utente"),
        @APIResponse(responseCode = "404", description = "Segnalibro non trovato")
    })
    @RolesAllowed({"User"})
    public List<JsonObject> findsegna(@PathParam("id") Long id) {

        User usr = storeuser.findUserbyLogin(token.getName()).orElseThrow(() -> new NotFoundException("user non trovato. id=" + token.getName()));
        Segnalibro bkm = storesegna.find(id).orElseThrow(() -> new NotFoundException("Segna non trovato. id=" + id.toString()));
        if (bkm.getUsr() != usr) {
            throw new NotFoundException("Segnalibro non trovato. id=" + id.toString());
        }
        return storesegna.findSegnaJson(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(description = "Permette l'aggiunta di un nuovo Segnalibro")
    @APIResponses({
        @APIResponse(responseCode = "201", description = "Nuovo Segnalibro creato con successo"),
        @APIResponse(responseCode = "404", description = "Non è stato possibile creare il nuovo Segnalibro")
    })
    @RolesAllowed({"User"})
    public Response create(@Valid Segnalibro entity) {
        System.out.println("id: " + token.getName());
        System.out.println(entity.toString());
        User usr = storeuser.findUserbyLogin(token.getName()).orElseThrow(() -> new NotFoundException("user non trovato. id=" + token.getName()));
        entity.setUsr(usr);
        entity.setCreazione(LocalDateTime.now());
        entity.setUsragg(usr);
        entity.setAggiornamento(LocalDateTime.now());
        Segnalibro saved = storesegna.save(entity);
        System.out.println("Segnalibro creato " + saved.toString());
        return Response.status(Response.Status.CREATED)
                .entity(saved)
                .build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(description = "Permette aggiornare un Segnalibro")
    @APIResponses({
        @APIResponse(responseCode = "201", description = "Nuovo Segnalibro creato con successo"),
        @APIResponse(responseCode = "404", description = "Non è stato possibile aggiornare il Segnalibro")
    })
    @RolesAllowed({"User"})
    public Response update(@Valid Segnalibro entity) {

        User usr = storeuser.findUserbyLogin(token.getName()).orElseThrow(() -> new NotFoundException("User non trovato. id=" + token.getName()));
        Segnalibro segna = storesegna.find(entity.getId()).orElseThrow(() -> new NotFoundException("Segnalibro non trovato. id=" + entity.getDescrizione()));

        if (!usr.equals(segna.getUsr())) {
            throw new NotFoundException("Segnalibro non trovato. id=" + entity.getDescrizione());
        }

        entity.setId(segna.getId());
        entity.setVersion(segna.getVersion());
        entity.setUsr(segna.getUsr());
        entity.setUsragg(usr);
        entity.setCreazione(segna.getCreazione());
        entity.setAggiornamento(LocalDateTime.now());

        segna = storesegna.save(entity);
        System.out.println("Segnalibro creato " + segna.toString());

        return Response.status(Response.Status.CREATED)
                .entity(segna)
                .build();
    }

    @DELETE
    @Operation(description = "Permette cancellare un Segnalibro")
    @APIResponses({
        @APIResponse(responseCode = "201", description = "Segnalibro cancellato con successo"),
        @APIResponse(responseCode = "404", description = "Non è stato possibile cancellare il Segnalibro")
    })
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @RolesAllowed({"User"})
    public Response cancellaSegna(JsonObject jbook) {

        System.out.println(jbook);
        User usr = storeuser.findUserbyLogin(token.getName()).orElseThrow(() -> new NotFoundException("User non trovato. id=" + token.getName()));
        Segnalibro found = storesegna.find(Long.parseLong(jbook.getString("idSegna"))).orElseThrow(() -> new NotFoundException());

        if (!usr.equals(found.getUsr())) {
            throw new NotFoundException("Segnalibro non trovato. id=" + found.getId());
        }

        storesegna.delete(found.getId());

        return Response.status(Response.Status.OK)
                .build();

    }

    /*-------Tags a un BookMark----------*/
//    @PATCH
//    @Path("{id}")
//    @Operation(description = "Permette aggiungere una lista di Etichette a un Segnalibro")
//    @APIResponses({
//        @APIResponse(responseCode = "201", description = "Segnalibro aggiornato con successo"),
//        @APIResponse(responseCode = "404", description = "Non è stato possibile aggiornare il Segnalibro")
//    })
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    @RolesAllowed({"User"})
//    public Response addEtichetta(JsonObject jbook) {
//
//        System.out.println(jbook);
//
//        String etich = jbook.getString("Etichette");
//        String[] etichette = etich.split("#");
//
//        Segnalibro found = storesegna.find(Long.parseLong(jbook.getString("idSegna"))).orElseThrow(() -> new NotFoundException());
//
//        storesegna.addEtich(found, etichette);
//
//        return Response.status(Response.Status.CREATED)
//                .build();
//
//    }

    
    @PATCH
    @Path("{id}")
    @RolesAllowed({"User"})
    @Consumes(MediaType.TEXT_PLAIN)
    public void addTag(@PathParam("id") Long id, @NotBlank String etich) {
        Segnalibro found = storesegna.find(id).orElseThrow(() -> new NotFoundException());
        storesegna.addEtich(found,etich);
    }

    @DELETE
    @Path("{id}")
    @RolesAllowed({"User"})
    @Consumes(MediaType.TEXT_PLAIN)
    public void removeTag(@PathParam("id") Long id, String etich) {
        storesegna.removeEtich(id,etich);
    }
}
