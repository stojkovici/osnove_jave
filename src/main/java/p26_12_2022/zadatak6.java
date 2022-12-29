package p26_12_2022;

import java.util.Scanner;

public class zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite n");
        int n = s.nextInt();
        zvezdice(n);
    }
    public static void zvezdice (int n){
        for (int i = 0; i <n ; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
