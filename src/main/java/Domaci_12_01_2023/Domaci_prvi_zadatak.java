package Domaci_12_01_2023;

import jdk.nashorn.internal.runtime.regexp.joni.exception.SyntaxException;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci_prvi_zadatak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<ZeleniKarton> z = new ArrayList<ZeleniKarton>();
        for (int i = 0; i < 10; i++) {
            ZeleniKarton a = new ZeleniKarton("Ivan Stojkovic", 12458, "Pera Peric");
            System.out.println("Unesite predmet:");
            String predmet = s.next();
            a.setNazivPredmeta(predmet);
            System.out.println("Unesite ocenu:");
            int ocena = s.nextInt();
            a.setOcena(ocena);
            z.add(a);

        }
        for (int i = 0; i < z.size(); i++) {
            System.out.println(z.get(i).getNazivPredmeta() + " - " + z.get(i).getOcena());
            System.out.println("Student: " + z.get(i).getImeIPrezimeStudenta() + ", " + z.get(i).getBrojIndexa());
            System.out.println("Profesor: " + z.get(i).getImeIPrezimeProfesora());
        }
        int zbir = 0;
        for (int i = 0; i < 10; i++) {
            zbir = zbir + z.get(i).getOcena();
        }
        double prosecnaOcena = zbir / 10;
        System.out.println("Prosecna ocena je: " + prosecnaOcena);

    }

}
