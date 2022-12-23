package p19_12_2022;

import java.util.Scanner;

public class zadatak8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost a");
        int a = s.nextInt();
        int zbir = 0;
        int srednja = 0;
        for (int i = 0; i < a; i++) {
            System.out.println("Unesite broj");
            int broj = s.nextInt();
            zbir=zbir+broj;

        }
        srednja = zbir/a;
        System.out.println("Srednja vrednost je "+srednja);
    }
}
