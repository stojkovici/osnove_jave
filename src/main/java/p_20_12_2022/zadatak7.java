package p_20_12_2022;

import java.util.Scanner;

public class zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int broj=0;
        int prekoracenje =0;
        while(prekoracenje<100){
            System.out.println("Unesite broj");
            broj=s.nextInt();
            if(prekoracenje>100){
                System.out.println("what??");
            }
        }
    }
}
