package p_16_12_2022;

import java.util.Scanner;

public class zadatak_8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost A");
        int a = s.nextInt();
        System.out.println("Unesite vrednost B");
        int b = s.nextInt();
        for (int i = 1; i <= 10; i++) {
            if (a != i && b != i) {
                System.out.println(i);
            }


        }
    }

}