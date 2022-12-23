package p_20_12_2022;

import java.util.Scanner;

public class zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int broj =0;
        int jedan =0;
        int dva = 0;
        int tri =0;
        int cetiri=0;

        while (jedan<1||dva<1||tri<1||cetiri<1){

            System.out.println("Unesite broj");
            broj = s.nextInt();
            if(broj==1){
                jedan = jedan+1;
            }if(broj==2){
                dva=dva+1;
            }if(broj==3){
                tri=tri+1;
            }
            if(broj==4){
                cetiri=cetiri+1;
            }
        }
        System.out.println("Kraj programa");
    }
}
