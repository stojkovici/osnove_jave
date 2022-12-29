package za_vezbanje;

import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite tezinu(kg)");
        int tezina = s.nextInt();
        System.out.println("Unesite visinu(m)");
        double visina = s.nextDouble();
        double bmi = tezina/(visina*visina);
        if (bmi<=18.5){
            System.out.println("Kategorija je Neuhranjenost");
        }
        else if (bmi>18.5&&bmi<=24.99){
            System.out.println("Kategorija je Normalna tezina");
        }
        else if(bmi>25&&bmi<=29.99){
            System.out.println("Kategorija je Prekomerena tezina");
        }
        else {
            System.out.println("Kategorija je Gojaznost");
        }
    }
}
