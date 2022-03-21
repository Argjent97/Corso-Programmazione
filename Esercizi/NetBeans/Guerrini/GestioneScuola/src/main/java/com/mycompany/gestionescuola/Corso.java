/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionescuola;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Corso {

    // area attributi o proprietà
    private String nomecorso;
    private String descrizione;
    private int durataore;
    private LocalDate datainizio;
    private String link = "www.ciacformazione.it";
    // una struttura per caricare i possibili 30 alunni(registro)
    private ArrayList<Anagrafica> registro = new ArrayList<>();
    // elenco Alunni da inserire

    // costruttori
    public Corso() {
        nomecorso = "NN";
        durataore = 0;
        descrizione = "---";
        datainizio = LocalDate.now();
    }

    public Corso(String nomecorso, int durataore) {
        this.nomecorso = nomecorso;
        this.durataore = durataore;
        this.descrizione = "---";
        datainizio = LocalDate.now();
    }

    public Corso(String nomecorso, int durataore, int y, int m, int d) {
        this.nomecorso = nomecorso;
        this.durataore = durataore;
        this.descrizione = "---";
        setDatainizio(y, m, d);
    }

    public Corso(String nomecorso, int durataore, String descrizione) {
        this.nomecorso = nomecorso;
        this.durataore = durataore;
        this.descrizione = descrizione;
        datainizio = LocalDate.now();
    }

    public String getNomecorso() {
        return nomecorso;
    }

    public void setNomecorso(String nomecorso) {
        if (nomecorso.length() > 0 && nomecorso.length() < 120) {
            this.nomecorso = nomecorso;
        }
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getDurataore() {
        return durataore;
    }

    public void setDurataore(int durataore) {
        if (durataore > 0 && durataore <= 5000) {
            this.durataore = durataore;
        }
    }

    public LocalDate getDatainizio() {
        return datainizio;
    }

    public ArrayList<Anagrafica> getRegistro() {
        return registro;
    }

    public void setRegistro(ArrayList<Anagrafica> registro) {
        this.registro = registro;
    }

    public void setDatainizio(LocalDate datainizio) {
        this.datainizio = datainizio;
    }

    /**
     * imposta la data testo
     *
     * @param datainizio formato YYYY-MM-DD 2022-02-03
     */
    public boolean setDatainizio(String datainizio) {
        try {
            int y, m, d;
            String parts[] = datainizio.split("-"); //data uno String in input, divide le sue parti
            y = Integer.parseInt(parts[0]);         //a seconda di dove è inserito il "-" e le inserisce
            m = Integer.parseInt(parts[1]);         //in un array
            d = Integer.parseInt(parts[2]);
            LocalDate data = LocalDate.of(y, m, d);
            this.datainizio = data;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * imposta la data inizio dai 3 parametri numerici
     *
     * @param y int anno
     * @param m int mese
     * @param d int giorno
     * @return
     */
    public boolean setDatainizio(int y, int m, int d) {
        try {
            LocalDate data = LocalDate.of(y, m, d);
            this.datainizio = data;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    void updateAlunno(Anagrafica alunno, int pos) {
        registro.set(pos, alunno);
    }

    boolean insertAlunno(Anagrafica alunno) {
        int ida = alunno.getId_anagrafica();
        for (Anagrafica al : registro) {
            if (al.getId_anagrafica() == ida) {
                return false;
            }
        }
        registro.add(alunno);
        return true;
    }

    /*void stampaRegistro() {
        for (Anagrafica al : registro) {
            al.stampaInfo();
            {
            }
        }
    }
     */
    // area metodi o capacità, abilità
    void stampaInfo() {
        System.out.println("\n\n-------Scheda corso-------");
        System.out.println("Nome del corso: " + nomecorso);
        System.out.println("Durata del corso: " + durataore);
        System.out.println("Descrizione del corso: " + descrizione);
        System.out.println("Data inizio del corso: " + datainizio.toString());
        System.out.println("Link del corso: " + link);
        System.out.println("--------------------------\n\n");
    }

    String getInfo() {
        String ris = "";
        ris += "-------Scheda corso-------";
        ris += "\nNome del corso: " + nomecorso;
        ris += "\nDurata del corso: " + durataore;
        ris += "\nDescrizione del corso: " + descrizione;
        ris += "\nData inizio del corso: " + datainizio.toString();
        ris += "\nLink del corso: " + link + "\n";
        return ris;
    }

    /**
     * ritorna un csv con i corsi testo nomeccorso; durata; descrizione;
     * datainizio; link elenco dati separati da ; e fine linea
     *
     * @return
     */
    String getCSVInfo() { //
        String ris = "";
        //ris += "nomeccorso; durata; descrizione; datainizio; link\n";
        String lr = "";
        for (Anagrafica al : registro) {
            lr += al.getId_anagrafica() + ",";
        }
        if (lr.length() > 0) {
            lr = lr.substring(0, lr.length() - 1); //così prendiamo solo i numeri e non la virgola finale
        }
        ris += nomecorso + ";" + durataore + ";" + descrizione + ";" + datainizio.toString() + ";" + link + ";" + lr + "\n";
        return ris;
    }

    public boolean isAlunno(int id) {
        for (Anagrafica a : registro) {
            if (a.getId_anagrafica() == id) {
                return true;
            }
        }
        return false;
    }
}
