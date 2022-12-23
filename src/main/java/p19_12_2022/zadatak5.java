package p19_12_2022;

import java.util.Scanner;

public class zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj a");
        int a = s.nextInt();
        int zbir = 0;
        for (int i = 0; i < a; i++) {
            System.out.println("Unesite broj c");
            int c = s.nextInt();
            zbir=zbir+c;

        }
        System.out.println("Zbir je: "+zbir);
    }
}
