package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite n");
        int n = s.nextInt();
        ArrayList<Integer> parni = new ArrayList<>();
        ArrayList<Integer> neparni = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj");
            int broj = s.nextInt();
            if(broj%2==0){
                parni.add(broj);
            }
            else {
                neparni.add(broj);
            }
        }
        int sumaParnih = 0;
        for (int i = 0; i <parni.size() ; i++) {
            sumaParnih = sumaParnih+parni.get(i);
        }
        int sumaNeparnih = 0;
        for (int i = 0; i < neparni.size(); i++) {
            sumaNeparnih =sumaNeparnih+ neparni.get(i);
        }
        System.out.println("Niz parnih: ");
        for (int i = 0; i <parni.size() ; i++) {
            System.out.print(parni.get(i)+", ");
        }
        System.out.println();
        System.out.println("Suma parnih: "+sumaParnih);
        System.out.println("Niz neparnih: ");
        for (int i = 0; i < neparni.size(); i++) {
            System.out.print(neparni.get(i)+", ");
        }
        System.out.println();
        System.out.println("Suma neparnih: "+sumaNeparnih);

    }
}
