package Domaci_26_12_2022;

import java.util.Scanner;

public class Domaci_cetvrti_zadatak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int jmbg = 1452400451;
        String ime = "Ivan";
        String prezime = "Stojkovic";
        int godinaRodjenja = 1998;
        boolean aktivan = true;
        podaci(jmbg,ime,prezime,godinaRodjenja,aktivan);

    }
    public static void podaci(int jmbg,String ime, String prezime, int godinaRodjenja, boolean aktivan){
        System.out.println("JMBG: "+jmbg);
        System.out.println("Ime: "+ime);
        System.out.println("Prezime: "+prezime);
        System.out.println("God. rodjenja: "+godinaRodjenja);
        System.out.println("Aktivan: "+aktivan);
    }
}
