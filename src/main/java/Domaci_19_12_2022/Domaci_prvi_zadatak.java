package Domaci_19_12_2022;

import java.util.Scanner;

public class Domaci_prvi_zadatak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj");
        int broj = s.nextInt();
        int suma = 0;
        for (int i = 0; i < broj; i++) {
            System.out.println("Unesite broj");
            int brooj = s.nextInt();
            if(brooj%2==0){
                suma = suma + brooj;
            }

        }
        System.out.println("Suma parnih brojeva je "+suma);
    }
}
// Napisati program koji od korisnika ucitava N brojeva i sabira samo parne brojeve. Na kraju programa prikazati sumu.