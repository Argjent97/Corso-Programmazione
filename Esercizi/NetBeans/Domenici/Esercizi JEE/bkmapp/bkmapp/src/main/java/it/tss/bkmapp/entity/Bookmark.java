/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.bkmapp.entity;

import it.tss.bkmapp.adapter.UserTypeAdapter;
import java.util.Set;
import java.util.TreeSet;
import javax.json.bind.annotation.JsonbTransient;
import javax.json.bind.annotation.JsonbTypeAdapter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/**
 *
 * @author tss
 */
@Entity
@Table(name = "bookmark")
public class Bookmark extends BaseEntity {

    
    @Column(name = "descrizione")
    private String desc;

    @NotBlank
    @Column(nullable = false, unique = true)
    private String link;

    @JsonbTransient
    @ManyToMany
    @JoinTable(name = "bkms_tag",
            joinColumns = @JoinColumn(name = "bkm_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private Set<Tag> tags = new TreeSet<>();

    @Column(name = "condiviso", nullable = false)
    private boolean share;

    @JsonbTypeAdapter(UserTypeAdapter.class)
    @ManyToOne(optional = false)
    @JoinColumn(name = "proprietario")
    private User user;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    public boolean isShare() {
        return share;
    }

    public void setShare(boolean share) {
        this.share = share;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Bookmark{" + "id=" + id + ", desc=" + desc + ", link=" + link + ", tags=" + tags + ", share=" + share + ", user=" + user + '}';
    }

}
