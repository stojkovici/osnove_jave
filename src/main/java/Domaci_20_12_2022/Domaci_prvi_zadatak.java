package Domaci_20_12_2022;

import java.util.Scanner;
import java.lang.Math;
public class Domaci_prvi_zadatak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj");
        int broj = s.nextInt();
        int a = 1;
        int brr = 1;
        while (!(brr==0)){
            System.out.println("Unesite broj");
            brr = s.nextInt();
            if(brr<0){
                brr= Math.abs(brr);
                System.out.println(brr);
            }
             else{System.out.println(brr);
             }


        }
        System.out.println("Kraj programa jer je uneta nula");
    }
}
// Napisati program koji ucitava brojeva od korisnika i za svaki broj prikazuje apsolutnu vrednost sve dok se ne unese nula