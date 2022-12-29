package Domaci_26_12_2022;

import java.util.Scanner;

public class Domaci_peti_zadatak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N");
        int n = s.nextInt();
        System.out.println("Unesite karakter za stampu");
        String karakter = s.next();
        stampa(n,karakter);

    }
    public static void stampa (int n, String karakter){
        for (int i = 0; i <n ; i++) {
            System.out.print(karakter+" ");
        }
    }
}
