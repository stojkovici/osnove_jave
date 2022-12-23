package Domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci_drugi_zadatak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        System.out.println("Unesite n");
        int n = s.nextInt();
        int broj1 = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj");
            int broj = s.nextInt();
            if (broj%2==0){
                broj1 = broj1+1 ;
            }
        }
        System.out.println("U nizu ima "+broj1+" parna broja.");
    }
}
// Napisati program koji ucitava N brojeva i smesta ih u niz. Zatim, iz niza, broji koliko je parnih brojeva uneto. brojeve unosi korisnik.