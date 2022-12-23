package p19_12_2022;

import java.util.Scanner;

public class zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost a");
        int a = s.nextInt();
        int broj = 0;
        int parni = 0;
        for (int i =0 ; i < a; i++) {
            System.out.println("Unesite broj");
             broj = s.nextInt();
            if (broj%2==0){
                parni = parni+1;
            }
        }
        System.out.println("Uneto je "+parni+" parna broja");

    }
}
