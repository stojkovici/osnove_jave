package Domaci_26_12_2022;

import java.util.Scanner;

public class Domaci_drugi_zadatak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite ime");
        String ime = s.next();
        System.out.println("Unesite prezime");
        String prezime = s.next();
        System.out.println(spojeno(ime, prezime));
    }
    public static String spojeno(String ime,String prezime){
        String zajedno = ime +" "+ prezime;
        return zajedno;
    }
}
