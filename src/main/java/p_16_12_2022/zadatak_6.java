package p_16_12_2022;

import java.util.Scanner;

public class zadatak_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite ime");
        String ime = s.next();
        System.out.println("Unesite prezime");
        String prezime = s.next();
        System.out.println("Unesite jmbg");
        String jmbg = s.next();
        System.out.println("Unesite broj primeraka");
        int primerak = s.nextInt();
        for (int i = 1;  i <= primerak; i++) {
            System.out.println("Primerak"+i);
            System.out.println("************************");
            System.out.println("Ime i prezime: " +ime+" " + prezime);
            System.out.println("JMBG: "+jmbg);
            System.out.println("************************");
        }

    }
}
