package p_16_12_2022;

import java.util.Scanner;

public class zadatak_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite jacinu zvuka");
        int jacina = s.nextInt();
        System.out.print("<");
        for (int i = 0; i <= jacina; i++) {
            if (jacina == 0) {
                System.out.print("/");
            } else if (jacina >= 0) {
                System.out.print("|" + " ");
            }


            }


        }

    }

