package p_16_12_2022;

import java.util.Scanner;

public class zadatak_1 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj");
        int broj = s.nextInt();
        if ((broj%2==0) && (broj%3==0)){
            System.out.println("Broj je deljiv i sa dva i sa tri");
        }
        else if (broj%2==0){
            System.out.println("Broj je deljiv sa dva");
        }else if(broj%3==0){
            System.out.println("Broj je deljiv sa tri");
        }else {
            System.out.println("Broj nije deljiv ni sa dva ni sa tri");
        }
    }



}
