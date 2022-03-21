/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.agappuntamenti;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

/**
 *
 * @author tss
 */
public class Appuntamento {

    private LocalDate data;
    private LocalTime oraIni;
    private LocalTime oraFin;
    private String luogo;
    private String persona;

    public Appuntamento(LocalDate data, LocalTime oraIni, LocalTime oraFin, String luogo, String persona) {
        this.data = data;
        this.oraIni = oraIni;
        this.oraFin = oraFin;
        this.luogo = luogo;
        this.persona = persona;
    }

    public boolean intersect(Appuntamento a) {
        if (!this.data.equals(a.getData())) {
            return false;
        }
        if (this.isAllDay() || a.isAllDay()) {
            return true;
        }
        if (this.oraIni.isBefore(a.oraIni)
                || this.oraFin.isAfter(a.oraIni)) {
            return true;
        }
        return this.oraIni.isBefore(a.oraFin)
                || this.oraFin.isAfter(a.oraIni);

    }

    public boolean overlap(Appuntamento a) {
        return a.oraIni.isBefore(this.oraIni)&& a.oraFin.isAfter(this.oraFin);
    }

    public boolean invalid(Appuntamento a) {
        return intersect(a) || overlap(a);
    }

    public boolean isAllDay() {
        return oraIni == LocalTime.MIN && oraFin == LocalTime.MAX;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getOraIni() {
        return oraIni;
    }

    public LocalTime getOraFin() {
        return oraFin;
    }

    public String getLuogo() {
        return luogo;
    }

    public String getPersona() {
        return persona;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.data);
        hash = 23 * hash + Objects.hashCode(this.oraIni);
        hash = 23 * hash + Objects.hashCode(this.oraFin);
        hash = 23 * hash + Objects.hashCode(this.luogo);
        hash = 23 * hash + Objects.hashCode(this.persona);
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
        final Appuntamento other = (Appuntamento) obj;
        if (!Objects.equals(this.luogo, other.luogo)) {
            return false;
        }
        if (!Objects.equals(this.persona, other.persona)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.oraIni, other.oraIni)) {
            return false;
        }
        return Objects.equals(this.oraFin, other.oraFin);
    }

    @Override
    public String toString() {
        String ris = "";
        ris += "-- Appuntamento ----------\n";
        ris += "Data: " + data + "\n";
        ris += "Ora inizio: " + oraIni + "\n";
        ris += "Ora fine: " + oraFin + "\n";
        ris += "Luogo: " + luogo + "\n";
        ris += "Persona: " + persona + "\n";
        ris += "--------------------------\n\n";
        return ris;
    }

}
