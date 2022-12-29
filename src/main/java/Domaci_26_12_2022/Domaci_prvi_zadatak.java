package Domaci_26_12_2022;

import java.util.Scanner;

public class Domaci_prvi_zadatak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost");
        int vrednost = s.nextInt();
        System.out.println(stampajZa10Vecu(vrednost));
    }
    public static int stampajZa10Vecu(int n){
        n = n + 10;
        return n;
    }
}
