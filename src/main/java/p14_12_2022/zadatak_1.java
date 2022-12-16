package p14_12_2022;
import java.util.Scanner;
public class zadatak_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite ime");
        String ime = s.next();
        System.out.print("Unesite prezime ");
        String prezime = s.next();
        System.out.println("Unesite broj");
        String brojTelefona = s.next();
        System.out.println("Unesite email");
        String email = s.next();
        System.out.println("Unesite jmbg");
        String jmbg = s.next();
        System.out.println(ime + " " + prezime + "-" + jmbg);
        System.out.println(brojTelefona);
        System.out.println(email);




    }
}
