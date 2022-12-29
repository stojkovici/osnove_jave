package p26_12_2022;

import java.util.Scanner;

public class zadatak6_za_vezbanje {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite m");
        int m = s.nextInt();
        for (int i = 1; i <= m; i++) {
            zvezdica(i);

        }

    }
    public static void zvezdica(int m){
        for (int i = 0; i < m; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
