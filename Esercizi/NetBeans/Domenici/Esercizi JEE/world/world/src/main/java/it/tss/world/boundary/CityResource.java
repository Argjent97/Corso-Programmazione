/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.world.boundary;

import it.tss.world.control.CityStore;
import it.tss.world.entity.City;
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
@Path("/cities")
@org.eclipse.microprofile.openapi.annotations.tags.Tag(
        name = "Gestione Cities", description = "Permetti ad ogni utente di gestire le città")

public class CityResource {
    
    @Inject
    CityStore store;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<City> all() {
        return store.all();
    }
}
