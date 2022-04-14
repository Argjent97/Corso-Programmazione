/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.world.entity;

import it.tss.world.adapter.CountryTypeAdapter;
import java.io.Serializable;
import java.util.Objects;
import javax.json.bind.annotation.JsonbTypeAdapter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/**
 *
 * @author tss
 */
@Entity
@Table(name = "city")
public class City implements Serializable {
   
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "ID")
private Long id;

@NotBlank
@Column(name = "Name", nullable = false)
private String name;

@JsonbTypeAdapter(CountryTypeAdapter.class)
@JoinColumn(name = "CountryCode", nullable = false)
@ManyToOne
private Country country;

@NotBlank
@Column(name = "District", nullable = false)
private String distr;


@Column(name = "Population", nullable = false)
private int popul;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getDistr() {
        return distr;
    }

    public void setDistr(String distr) {
        this.distr = distr;
    }

    public int getPopul() {
        return popul;
    }

    public void setPopul(int popul) {
        this.popul = popul;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final City other = (City) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "City{" + "id=" + id + ", name=" + name + ", cc=" + country + ", distr=" + distr + ", popul=" + popul + '}';
    }


}
