/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.blogapp.boundary;

import it.tss.blogapp.control.TagStore;
import it.tss.blogapp.entity.Tag;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



/**
 *
 * @author tss
 */

@Path("/tags")
public class TagResource {
    
    @Inject
    private TagStore store;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Tag> all(){
        return store.all();
    }
   
    
    @GET
    @Path("[id]")
    @Produces(MediaType.APPLICATION_JSON)
    public Tag find (@PathParam("id") Long id){
        return store.find(id).orElseThrow(() -> new NotFoundException("tag non trovato, id=" + id));
    }
    
}
