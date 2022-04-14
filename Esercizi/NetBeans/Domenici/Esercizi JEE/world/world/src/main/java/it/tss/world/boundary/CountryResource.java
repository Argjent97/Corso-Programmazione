/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.world.boundary;

import it.tss.world.control.CountryStore;
import it.tss.world.entity.Country;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author tss
 */
@Path("/countries")
@org.eclipse.microprofile.openapi.annotations.tags.Tag(
        name = "Gestione Countries", description = "Permetti ad ogni utente di gestire i paesi")
public class CountryResource {

    @Inject
    CountryStore store;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Country> all() {
        return store.all();
    }
}
