/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.gestionescuola;

/**
 *
 * @author tss
 */
public class GestioneScuola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tool tool = new Tool();
        
        String nome = "tss java";
        int durata = 1000;
        Corso c1 = new Corso(nome, durata);
        c1.stampaInfo();
        Alunno a1 = new Alunno("Rossi", "Paolo");
        String oktel = tool.checkTel(" 0125-454545 ", "+44");
        Alunno a2 = new Alunno("Krasniqi", "Argjent", oktel, "krasniqi@gmail.com");
        a1.stampaInfo();
        a2.stampaInfo();
        c1.insertAlunno(a1);
        c1.insertAlunno(a2);
        c1.stampaRegistro();
        
    }

}
