package Domaci_20_12_2022;

import java.util.Scanner;

public class Domaci_treci_zadatak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dva = 0;
        int jedan = 0;
        while (!(dva>=2 || jedan>=3)){
            System.out.println("Unesite broj");
            int broj = s.nextInt();
            if(broj==2){
                dva=dva+1;
            }
            else if (broj==1){
                jedan = jedan +1;
            }
        }
        System.out.println("Kraj programa");
    }
}
// Napisati program koji od korisnika ucitava brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.