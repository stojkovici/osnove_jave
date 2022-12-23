package Domaci_20_12_2022;

import java.util.Scanner;

public class Domaci_drugi_zadatak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String kraj = " ";
        while (!(kraj.contains("kraj"))){
            System.out.println("Unesite broj");
            String rimski = s.next();
            if (rimski.contains("I")){
                System.out.println("1");
            }
            else if (rimski.contains("V")){
                System.out.println("5");
            }
            else if (rimski.contains("X")){
                System.out.println("10");
            }
            else if (rimski.contains("L")){
                System.out.println("50");
            }
            else if (rimski.contains("C")){
                System.out.println("100");
            }
            else if (rimski.contains("D")){
                System.out.println("500");
            }
            else if (rimski.contains("M")){
                System.out.println("1000");
            }
            else if (rimski.contains("kraj")){
                kraj= "kraj";
            }
            System.out.println("Kraj programa");
        }
    }
}
//Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ..