/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.world.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

/**
 *
 * @author tss
 */
@Embeddable
public class CountrylanguagePK implements Serializable {

    @Size(max = 3)
    @ManyToOne
    @JoinColumn(name = "CountryCode", nullable = false)
    private Country country;
    
    @Size(min = 5, max = 30)
    @Column(name = "Language", nullable = false)
    private String language;

    public CountrylanguagePK() {
    }

    public CountrylanguagePK(Country country, String language) {
        this.country = country;
        this.language = language;
    }

    public Country getCountryCode() {
        return country;
    }

    public void setCountryCode(Country country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.country);
        hash = 31 * hash + Objects.hashCode(this.language);
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
        final CountrylanguagePK other = (CountrylanguagePK) obj;
        if (!Objects.equals(this.country, other.country)) {
            return false;
        }
        return Objects.equals(this.language, other.language);
    }

    @Override
    public String toString() {
        return "CountrylanguagePK{" + "countryCode=" + country + ", language=" + language + '}';
    }

    
}
