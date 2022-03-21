/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.jee_start.resources;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author tss
 */
@Path("ping")
public class Ping {

    @GET
    @Produces(MediaType.TEXT_PLAIN) //inidica il tipo di risorsa che produciamo
    public JsonObject ping(@DefaultValue("it")@QueryParam("language") String ln) {
        
        if(ln == null){
            //throw new BadRequestException("parametro inserito non valido");
            throw new BadRequestException(Response
                    .status(Response.Status.BAD_REQUEST)
                    .header("caused-by", "parametro language mancante")
                    .build());
        }
        DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        switch (ln) {
            case "it":
                df = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss", Locale.ITALY);
                return Json.createObjectBuilder().add("ts","ping ok!! " + LocalDateTime.now().format(df)).build();
            case "en":
                df = DateTimeFormatter.ofPattern("yyyy-MM-dd hh.mm.ss", Locale.ENGLISH);
                return Json.createObjectBuilder().add("ts","ping ok!! " + LocalDateTime.now().format(df)).build();
            default:
                return Json.createObjectBuilder().add("ts","ping ok!! " +  LocalDateTime.now().format(df)).build(); 
        }
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String ping1(@PathParam("id") String id) {
        return "ping1 ok !! " + " parametro: " + id + " " + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }

}
