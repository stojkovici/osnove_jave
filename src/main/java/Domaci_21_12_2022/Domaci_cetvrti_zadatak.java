package Domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci_cetvrti_zadatak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        System.out.println("Unesite n");
        int n = s.nextInt();
        int broj = 0;
        int x = 0;
        int b = 0;
        for (int i = 0; i <n ; i++) {
            System.out.println("Unesite broj");
            broj = s.nextInt();
            brojevi.add(broj);
        }
        System.out.println("Unesite vrednost x");
        x = s.nextInt();
        for (int i = 0; i <brojevi.size() ; i++) {
            if(brojevi.get(i)==x){
                brojevi.indexOf(x);
            }

        }
        System.out.println("Elementi niza A koju su jednaku broju X imaju indexe: "+brojevi.indexOf(x));
    }
}
// Napisati program koji ucitava niz A duzine N i broj X. Nakon unosa treba ispisati indekse onih clanova niza koji su jednaki broju X.
