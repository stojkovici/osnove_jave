package p12_01_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Sastojak> sastojak = new ArrayList<Sastojak>();
        System.out.println("Unesite n: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            Sastojak ss = new Sastojak();
            System.out.println("Unesite naziv proizvoda");
            String naziv = s.next();
            ss.setNaziv(naziv);
            System.out.println("Unesite cenu");
            int cena = s.nextInt();
            ss.setCena(cena);
            sastojak.add(ss);

        }
        for (int i = 0; i <sastojak.size() ; i++){
            System.out.println(sastojak.get(i).getNaziv()+" "+sastojak.get(i).getCena());
        }
    }
}
