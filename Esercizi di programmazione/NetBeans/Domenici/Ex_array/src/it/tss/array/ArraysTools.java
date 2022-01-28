/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.array;

/**
 *
 * @author tss
 */
public class ArraysTools {

    public static void stampa(int[] numeri) {
        if (numeri == null || numeri.length == 0) {
            throw new IllegalArgumentException("impossibile calcolare il minimo, array nullo o vuoto");
        }
        for (int i = 0; i < numeri.length; i++) {
            System.out.print(numeri[i] + ",");
        }
        System.out.println("");
    }

    public static boolean ricerca(int[] numeri, int n) {
        if (numeri == null || numeri.length == 0) {
            throw new IllegalArgumentException("impossibile procedere, array nullo o vuoto");
        }
        boolean trovato = false;
        int i = 0;
        while (i < numeri.length && !trovato) {
            if (numeri[i] == n) {
                trovato = true;
            }
            i++;
        }
        System.out.println(trovato);
        return trovato;
    }
    
    
    /**
     * ritorna l'indice dell'elemento trovato altrimenti -1
     * 
     * @param numeri
     * @param n
     * @return 
     */
    public static int indexOf(int[] numeri, int n){
        return indexOf(0, numeri, n);
    }
    
    /**
     * ritorna l'indice dell'elemento trovato altrimenti -1
     * 
     * @param numeri
     * @param n
     * @return 
     */
    public static int indexOf(int start, int[] numeri, int n){
        for (int idx = start; idx < numeri.length; idx++){
            if (numeri[idx] == n){
                return idx;
            }
        }
        return -1;
    }

    public static int max(int[] numeri) {
        if (numeri == null || numeri.length == 0) {
            throw new IllegalArgumentException("impossibile calcolare il massimo, array nullo o vuoto");
        }
        int massimo = 0;
        for (int i = 0; i < numeri.length; i++) {
            if (numeri[i] > massimo) {
                massimo = numeri[i];
            }
        }
        System.out.println("Il massimo è: " + massimo);
        return massimo;
    }

    public static int min(int[] numeri) {
        if (numeri == null || numeri.length == 0) {
            throw new IllegalArgumentException("impossibile calcolare il minimo, array nullo o vuoto");
        }
        int minimo;
        int i = 0;
        minimo = numeri[i];
        for (i = 0; i < numeri.length; i++) {
            if (numeri[i] < minimo) {
                minimo = numeri[i];
            }
        }
        System.out.println("Il minimo è: " + minimo);
        return minimo;

    }

    public static double avg(int[] numeri) {
        if (numeri == null || numeri.length == 0) {
            throw new IllegalArgumentException("impossibile calcolare la media, array nullo o vuoto");
        }
        double ris = 0;
        for (int i = 0; i < numeri.length; i++) {
            ris += numeri[i];
        }
        ris = ris / numeri.length;
        System.out.println("La media dei numeri è: " + ris);
        return ris;
    }

    public static void sort(int[] numeri) {
        if (numeri == null || numeri.length == 0) {
        throw new IllegalArgumentException("impossibile procedere, array nullo o vuoto");
        }
        boolean ordinato;
        do {
            ordinato = true;
            int i = 0;
            while (i < numeri.length - 1) {
                if (numeri[i] > numeri[i + 1]) {
                    int tmp = numeri[i];
                    numeri[i] = numeri[i + 1];
                    numeri[i + 1] = tmp;
                    ordinato = false;
                }
                i = i + 1;
            }
        } while (!ordinato);
    }

    /**
     * ritorna un array contenente la copia di numeri 1
     *
     * @param numeri
     * @return
     */
    public static int[] copia(int[] numeri) {
        if (numeri == null || numeri.length == 0) {
        throw new IllegalArgumentException("impossibile creare la copia, array nullo o vuoto");
        }
        int i;
        int j=0;
        int[]numeri2 = new int[numeri.length];
        for(i=0; i<numeri.length; i++){
            numeri2[j] = numeri[i];
            j++;
            
        }
        return numeri2;
    }

    /**
     * ritorna un array contenente l'unione di numeri1 e numeri2
     *
     * @param numeri
     * @param numeri2
     * @return
     */
    public static int[] unisci(int[] numeri, int[] numeri2) {
        if (numeri == null || numeri2 == null|| numeri.length == 0 || numeri2.length == 0) {
        throw new IllegalArgumentException("impossibile unire, array nullo o vuoto");
        }
        int[] numeri3 = new int[numeri.length+numeri2.length];
        int i;
        int j;
        int k=0;
        for(i=0;i<numeri.length;i++){
            numeri3[k]=numeri[i];
            k++;
        }
        k=0;
        for(j=0;j<numeri2.length;j++){
            numeri3[k+numeri.length]=numeri2[j];
            k++;
        }
        for(k=0;k<numeri3.length;k++){
            System.out.print(numeri3[k] + ",");
        }
        System.out.println("");
        return numeri3;
    }

    /**
     * ritorna true se numeri1 contiene tutti i valori di numeri 2 nella
     * sequenza corretta
     *
     * @param numeri
     * @param numeri2
     * @return
     */
    public static boolean contieneSequenza(int[] numeri, int[] numeri2) {
        if (numeri == null || numeri.length == 0) {
        throw new IllegalArgumentException("impossibile procedere, array nullo o vuoto");
        }
        if(numeri2.length == 0){
            return false;
        }
        if(numeri2.length>numeri.length){
            return false;
        }
        boolean ris = false;
        int n = numeri2[0];
        int start = indexOf(numeri,n);
        while(start!= -1 && numeri.length >= start + numeri2.length && !ris){
            ris = true;
            for(int i= 0;i<numeri2.length;i++){
                if(numeri[start+i]!= numeri[i]){
                    ris = false;
                    break;
                }
            }
            start = indexOf(start + 1, numeri, n);
        }
        return ris;
    }
    

    /**
     * ritorna true se numeri1 contiene tutti i valori di numeri 2 in qualunque
     * sequenza
     *
     * @param numeri
     * @param numeri2
     * @return
     */
    public static boolean contieneValori(int[] numeri, int[] numeri2) {
        boolean ris = true;
        
        for (int n : numeri2){
            if(ricerca(numeri,n) == false){
                ris = false;
                break;
            }
        }
        return ris;
    }

    /**
     * ritorna un array con solo i valori contenuti in entrambi gli array
     *
     * @param numeri
     * @param numeri2
     * @return
     */
    public static int[] intersezione(int[] numeri, int[] numeri2) {
        throw new UnsupportedOperationException("Non ancorai implementato");
    }

}
