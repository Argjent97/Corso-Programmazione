/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.mongodb;

import com.mongodb.client.MongoCollection;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author tss
 */
public class mainMongoDB {

    public static void main(String[] args) {

        // creo il client mongo
        MongoClient mongo = new MongoClient("localhost", 27017);
        // schema db
        MongoDatabase database = mongo.getDatabase("dbregistro");
        // tabella collection
        MongoCollection<Document> registri = database.getCollection("registri");
        // ora siamo sulla tabella collection

        // creo record document
        Document document = new Document("titolo", "TSS java")
                .append("codice", "C1-112-2022-0")
                .append("anno gestione", "2021-2022");

        Document document1 = new Document("titolo", "TSS reti")
                .append("codice", "C1-113-2022-0")
                .append("anno gestione", "2021-2022");

        Document document2 = new Document("titolo", "TSS web")
                .append("codice", "C1-114-2022-0")
                .append("anno gestione", "2021-2022");
        // inserisco array list di document
        List<Document> list = new ArrayList<>();
        list.add(document);
        list.add(document1);
        list.add(document2);
        registri.insertMany(list);
        // Getting the iterable object
        FindIterable<Document> results = registri.find();
        int i = 1;
        // Getting the iterator
        Iterator doc = results.iterator();
        while (doc.hasNext()) {
            System.out.println(doc.next());
            i++;
        }
    }
}
