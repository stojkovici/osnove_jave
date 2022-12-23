package p_20_12_2022;

import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int broj = 0;
        while (broj<10 || broj >50){
            System.out.println("Unesite broj");
            broj = s.nextInt();
            if (broj<10 || broj>50) {
                System.out.println("Greska, broj nije u opsegu od 10 do 50.");
            }
        }
        System.out.println("Broj je u opsegu od 10 do 50.");
    }
}
