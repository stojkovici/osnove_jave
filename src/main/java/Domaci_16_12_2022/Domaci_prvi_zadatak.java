package Domaci_16_12_2022;

import java.util.Scanner;

public class Domaci_prvi_zadatak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj");
        int broj = s.nextInt();
        for (int i = 1; i <10 ; i++) {
            System.out.println(broj+"x"+i+"="+broj*i);

        }
    }
}
