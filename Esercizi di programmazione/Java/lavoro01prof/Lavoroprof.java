package lavoro01prof;

import java.util.Scanner;

public class Lavoroprof {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci il primo numero");
        int n1 = sc.nextInt();
        System.out.println("inserisci il secondo numero");
        int n2 = sc.nextInt();

        if(n1>n2){
            System.out.println(n1 + " è il max");
        }
        else{
            System.out.println(n2 + " è il max");
        }
    }
}
