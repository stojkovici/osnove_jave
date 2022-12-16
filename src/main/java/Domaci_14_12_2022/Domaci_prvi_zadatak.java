package Domaci_14_12_2022;
import java.util.Scanner;
public class Domaci_prvi_zadatak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite ime");
        String ime = s.next();
        System.out.println("Unesite prezime");
        String prezime = s.next();
        System.out.println("Unesite godinu rodjenja");
        int godinaRodjenja = s.nextInt();
        System.out.println(ime + " " + prezime + " - " + (2022 - godinaRodjenja));
    }
}
