/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodooverload;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Tool {

    //contiente una serie di metodi e posso usare gli attrezzi senza crarli perchè la scatola Tool è già a casa
    //tutti imetodi tranne il main di prima
    static float insNumero() {

        float ris = 0; //il metodo ritorna un float ris
        String txnumero = JOptionPane.showInputDialog("inserisci numero");//pop up a video che ritorna un valore String
        txnumero = txnumero.replaceAll(",", ".");// alla , sosstituisce il .

        //metto nel secchiello la variabile che ho inserito a video,uso txnumero come contenitorte
        try {

            ris = Float.parseFloat(txnumero);//trasforma la stringa in numero 

        } catch (Exception errore) {

            //se avviene un'eccezione vado in errore  per evitare una trappola del programma e che si rompa, stampa la scritta di errore
            JOptionPane.showMessageDialog(null, "Valore inserito errato ti è stato assegnato zero a ris \n" + errore.getMessage());

        }
        return ris;

    }

    static float insNumero(String messaggio) {

        float ris = 0;
        boolean ok = false;

        // finchè non è ok chiedo il numero
        while (!ok) {

            String txnumero = JOptionPane.showInputDialog(messaggio);
            txnumero = txnumero.replaceAll(",", ".");
            try {

                ris = Float.parseFloat(txnumero);
                ok = true;

            } catch (Exception errore) {

                //se avviene un'eccezione vado in errore  per evitare una trappola del programma e che si rompa, stampa la scritta di errore
                JOptionPane.showMessageDialog(null, "Errore ritenta!!\n" + errore.getMessage());

            }

        }
        return ris;
    }

    static float insNumero(String messaggio, int numero_decimali) {

        float ris = 0;

        String txnumero = JOptionPane.showInputDialog(messaggio);
        txnumero = txnumero.replaceAll(",", ".");
        try {

            ris = Float.parseFloat(txnumero);

        } catch (Exception errore) {

            //se avviene un'eccezione vado in errore  per evitare una trappola del programma e che si rompa, stampa la scritta di errore
            JOptionPane.showMessageDialog(null, "Valore inserito errato ti è stato assegnato zero a ris 0\n" + errore.getMessage());

        }

        //arrotondo alla cifrav decimale 1,333 avrò 1.33 oppure 1,465 diventa 1,46, 1,6 diventa 2
        // 0-->1 1-->10 2-->100 3-->1000
        float potenza = (float) Math.pow(10, numero_decimali); //Math lo restituisce come double ed io gli imposto float come da programma
        ris = Math.round(ris * potenza) / potenza;

        return ris;

    }

    /**
     * metodo per chiedere tramite messaggio un numero che verrà arrotondato
     * alla secodnda cifra decimale
     *
     * @param messaggio domanda da porre all'utente
     * @return numero float arrontondato alla seconda cifra decimale
     */
    static float insValuta(String messaggio) {
        return insNumero(messaggio, 2);

    }

    static String giornoSettimana(int day) {

        String giorno = "";//dichiaro variabile giorno come stringa da usare dopo

        switch (day) {

            case 1:
                giorno = "Monday";
                break;
            case 2:
                giorno = "Tuesday";
                break;
            case 3:
                giorno = "Wednesday";
                break;
            case 4:
                giorno = "Thursday";
                break;
            case 5:
                giorno = "Friday";
                break;
            case 6:
                giorno = "Saturday";
                break;
            case 7:
                giorno = "Sunday";
                break;

            default:
                giorno = "sconosciuto";

        }
        return giorno;//ritorna la variabile stringa giorno

    }

    static float dist3D(float x, float y, float z) {

        float ris = 0;

        double calcolo = x * x + y * y + z * z;

        calcolo = Math.sqrt(calcolo);
        ris = (float) calcolo;
        return ris;
    }

    /**
     * carica dati random in array
     *
     * @param ar array da caricare
     * @return array caricato di numeri random 1...10
     */
    static int[] loadData(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() * 10) + 1;
        }
        return ar;
    }

    /**
     * carica dati random in array
     *
     * @param ar array da caricare
     * @param range valore massimo del dato 1...range
     * @return array caricato di numeri random 1...range
     */
    static int[] loadDataInt(int[] ar, int range) {
        for (int i = 0; i < ar.length; i++) {
            double caso = Math.random();
            caso = caso * range;
            int valore = (int) caso;
            valore++;
            ar[i] = valore;
        }
        return ar;
    }

    static int[] concatenaArrays(int[] ar1, int[] ar2) {
        int dim1 = ar1.length;
        int dim2 = ar2.length;
        int dimok = dim1 + dim2;
        int[] arok = new int[dimok];
        for (int i = 0; i < dim1; i++) {
            arok[i] = ar1[i];
        }
        for (int i = 0; i < dim2; i++) {
            arok[i + dim2] = ar2[i];
        }
        return arok;
    }

    static int cercaVirus(int[] ar, int[] virus) {
        int pos = -1;

        // controllo virus su prima posizione
        // eseguo n controlli quanto è lungo il virus
        int vlength = virus.length;
        // 4 5 8 9 0
        // 3 5 7
        int numcontrolli = ar.length - vlength;
        for (int k = 0; k < numcontrolli; k++) {
            
            // ciclo controllo sequenza
            boolean ok = true;
            for (int i = 0; i < vlength; i++) {
                if (virus[i] != ar[i+k]) {
                    ok = false;
                    break;
                }
            } 
            //fine controllo virus in posizione
            
            if (ok){ // trovavirus
                pos=k;
                break;
            }
            //passo al prossimo controllo e mi sposto di k
        }
        return pos;
    }

}
