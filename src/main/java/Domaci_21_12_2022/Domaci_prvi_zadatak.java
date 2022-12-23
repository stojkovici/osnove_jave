package Domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci_prvi_zadatak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        System.out.println("Unesite vrednost k");
        int k = s.nextInt();
        System.out.println("Unesite novu vrednost");
        int novaVrednost = s.nextInt();
        brojevi.add(0);
        brojevi.add(1);
        brojevi.add(2);
        brojevi.add(3);
        brojevi.add(4);
        brojevi.add(5);
        brojevi.add(6);
        brojevi.add(7);
        brojevi.add(8);
        brojevi.add(9);

        brojevi.set(k, novaVrednost);
        System.out.println(brojevi.get(k));
    }
}
// Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni) i koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.