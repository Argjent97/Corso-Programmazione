/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.bkmapp.adapter;

import it.tss.bkmapp.control.TagStore;
import it.tss.bkmapp.entity.Tag;
import javax.inject.Inject;
import javax.json.JsonObject;
import javax.json.bind.adapter.JsonbAdapter;
import javax.ws.rs.NotFoundException;

/**
 *
 * @author tss
 */
public class TagTypeAdapter implements JsonbAdapter<Tag, JsonObject> {

    @Inject
    TagStore store;

    @Override
    public JsonObject adaptToJson(Tag entity) throws Exception {
        return entity.toJsonSlice();
    }

    @Override
    public Tag adaptFromJson(JsonObject json) throws Exception {
        if (!json.containsKey("id")) {
            return null;
        }
        return store.find(json.getJsonNumber("id").longValue()).orElseThrow(() -> new NotFoundException("TagTypeAdapter.adaptFromJson not found"));
    }

}
