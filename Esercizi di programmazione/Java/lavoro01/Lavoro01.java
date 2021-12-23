package lavoro01;

import java.util.Scanner;

public class Lavoro01 
{
    public static void main(String[] args) 
    {
        // chiedo due numeri input e dico qual è il maggiore
        int n1;
        int n2;
        Scanner n = new Scanner(System.in);

        System.out.print("inserisci il primo numero -> ");
        n1 = n.nextInt();
        System.out.print("inserisci il secondo numero -> ");
        n2 = n.nextInt();

        if (n1 > n2) 
        {
            System.out.println("il numero più grande fra " + n1 + " e " + n2 + " è " + n1);
        } 
        else 
        {
            if (n2 > n1) 
            {
                System.out.println("il numero più grande fra " + n1 + " e " + n2 + " è " + n2);
            } 
            else 
            {
                System.out.println("i due numeri sono uguali");
            }
        }

        // chiedo un numero in input e dico se è pari o dispari
        int n3;
        System.out.print("inserisci il numero -> ");
        n3 = n.nextInt();

        if (n3 % 2 == 0) // % -> modulo -> da il risultato della divisione
        {
            System.out.println("il numero è pari");
        } 
        else 
        {
            System.out.println("il numero è dispari");
        }
    }
}
