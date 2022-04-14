/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.world.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

/**
 *
 * @author tss
 */
@Entity
@Table(name = "countrylanguage")
public class Countrylanguage implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CountrylanguagePK countrylanguagepk;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "IsOfficial", nullable = false)
    private IsOfficial isofficial;
    
    @Column(name = "Percentage", nullable = false, precision = 4, scale = 1)
    private BigDecimal percentage;

    public CountrylanguagePK getCountrylanguagepk() {
        return countrylanguagepk;
    }

    public void setCountrylanguagepk(CountrylanguagePK countrylanguagepk) {
        this.countrylanguagepk = countrylanguagepk;
    }

    public IsOfficial getIsofficial() {
        return isofficial;
    }

    public void setIsofficial(IsOfficial isofficial) {
        this.isofficial = isofficial;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.countrylanguagepk);
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
        final Countrylanguage other = (Countrylanguage) obj;
        return Objects.equals(this.countrylanguagepk, other.countrylanguagepk);
    }

    @Override
    public String toString() {
        return "Countrylanguage{" + "countrylanguagepk=" + countrylanguagepk + ", isofficial=" + isofficial + ", percentage=" + percentage + '}';
    }
    
    
    
}
