package p_20_12_2022;

import java.util.Scanner;

public class zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int broj =1;
        int nula = 0;

        while (nula<2){
            System.out.println("Unesite broj");
            broj= s.nextInt();
            if (broj==0){
            nula++;   }
        }
        System.out.println("Kraj program jer su unete dve nule");
    }
}
