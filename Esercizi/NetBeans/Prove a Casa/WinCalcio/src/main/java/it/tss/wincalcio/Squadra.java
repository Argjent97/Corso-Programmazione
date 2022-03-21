/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.wincalcio;

import java.util.Objects;

/**
 *
 * @author tss
 */
public class Squadra {

    private String nome;
    private String sede;

    public Squadra() {
    }

    
    public Squadra(String nome, String sede) {
        this.nome = nome;
        this.sede = sede;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public int punteggio(String nome) {
        int ris = 0;
        for (Partita p : WinDialogPartite.listapartite) {
            if (nome.equals(p.getSquadra1())) {
                if (p.getGol1() > p.getGol2()) {
                    ris += 3;
                } else if (p.getGol1() == p.getGol2()) {
                    ris += 1;

                }
            } else if (nome.equals(p.getSquadra2())) {
                if (p.getGol2() > p.getGol1()) {
                    ris += 3;
                } else if (p.getGol2() == p.getGol1()) {
                    ris += 1;
                }
            }
        }
        return ris;
    }

    public String getCSVSq() {
        String ris = "";
        ris += nome + ";" + sede + "\n";
        return ris;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.nome);
        hash = 41 * hash + Objects.hashCode(this.sede);
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
        final Squadra other = (Squadra) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.sede, other.sede);
    }

    @Override
    public String toString() {
        String ris = "";
        ris += "-------Scheda Squadra-------";
        ris += "Squadra: " + nome;
        ris += "Sede: " + sede;
        ris += "----------------------------\n";
        return ris;
    }

}
