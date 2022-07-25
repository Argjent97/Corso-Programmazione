/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segna.entity;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.TreeSet;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 *
 * @author tss
 */

@NamedNativeQueries({
    @NamedNativeQuery(name = Segnalibro.SEGNA_ALL,
            query = "SELECT * FROM segnalibro where (usr_id = :id) or (usr_id <> :id and condiviso = 1)")
})


@Entity
@Table(name = "segnalibro")
public class Segnalibro extends BaseEntity {
    
    public static final String SEGNA_ALL = "Segna.All";
        
    @NotBlank
    @Column(nullable = false)
    private String descrizione;
    
    @NotBlank
    @Column(nullable = false)
    private String link;
    
    @JsonbTransient
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "segna_etichetta", 
               joinColumns = @JoinColumn(name = "segna_id"), 
               inverseJoinColumns = @JoinColumn(name = "etichetta_id"))
    private Set<Etichetta> etichette = new TreeSet<>();
    
    
    //@JsonbTypeAdapter(UserTypeAdapter.class)
    @JsonbTransient
    @ManyToOne(optional = false)
    private User usr;
    
    @NotNull
    @Column(nullable = false)
    private boolean condiviso;

    
    //@NotBlank
    @Column(nullable = false)
    private LocalDateTime creazione;

    //@NotBlank
    @Column(nullable = false)
    private LocalDateTime aggiornamento;

    @JsonbTransient
    @ManyToOne(optional = false)
    private User usragg;
    

    public LocalDateTime getAggiornamento() {
        return aggiornamento;
    }

    @JsonbTransient
    public void setAggiornamento(LocalDateTime aggiornamento) {
        this.aggiornamento = aggiornamento;
    }

    public User getUsragg() {
        return usragg;
    }

    public void setUsragg(User usragg) {
        this.usragg = usragg;
    }   
    
    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Set<Etichetta> getTags() {
        return etichette;
    }

    public void setTags(Set<Etichetta> etichette) {
        this.etichette = etichette;
    }

    public User getUsr() {
        return usr;
    }

    
    public void setUsr(User usr) {
        this.usr = usr;
    }

    public boolean getCondiviso() {
        return condiviso;
    }

    public void setCondiviso(boolean condiviso) {
        this.condiviso = condiviso;
    }

    public LocalDateTime getCreazione() {
        return creazione;
    }

    @JsonbTransient
    public void setCreazione(LocalDateTime creazione) {
        this.creazione = creazione;
    }

    @Override
    public String toString() {
        return "Segnalibro: " + "descrizione: " + descrizione + ", link: " + link + ", etichette: " + etichette + ", usr: " + usr + ", condiviso: " + condiviso + ", creazione: " + creazione;
    }
    
    
    
    public JsonObject toJsonSliceSegna() {

        return Json.createObjectBuilder()
                .add("descrizione", this.toString())
                .build();
    }   
    
    
    public String tagstostring(){
        
        String res = "";
        
        for (Etichetta etich : etichette) {
            res += "#" + etich.getName();
        }
        
        return res;
        
    }
            
    
    
    
    
    
    
}
