package Domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci_treci_zadatak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        System.out.println("Unesite n");
        int n = s.nextInt();
        int broj1 = 1;
        int a = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            broj1 = s.nextInt();
            brojevi.add(broj1);
        }
        for (int i = 0; i < brojevi.size(); i++) {
            if (brojevi.get(i)>0){
                System.out.print(brojevi.get(i));
            }

        }



    }
}

//Napisati program koji ucitava niz A duzine N, i koji nakon unosa niz A stampa sve elemente niza koji su veci od nule.