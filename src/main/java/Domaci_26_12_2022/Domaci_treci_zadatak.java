package Domaci_26_12_2022;

import java.util.Scanner;

public class Domaci_treci_zadatak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite prvi broj");
        int prviBroj = s.nextInt();
        System.out.println("Unesite drugi broj");
        int drugiBroj = s.nextInt();
        System.out.println(spojeno(prviBroj,drugiBroj));

    }
    public static String spojeno(int a,int b){
        String zajedno = ""+a+b;
        return zajedno;
    }
}
