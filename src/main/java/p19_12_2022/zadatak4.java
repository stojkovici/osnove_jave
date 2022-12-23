package p19_12_2022;

import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite k");
        int k = s.nextInt();
        System.out.println("Unesite n");
        int n = s.nextInt();
        int y = 1;
        for (int i = 0; i < k; i++) {
            y = y*n;

            
        }
        System.out.println(y);

    }
}
