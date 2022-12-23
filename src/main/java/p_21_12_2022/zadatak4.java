package p_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite poziciju");
        int k = s.nextInt();
        ArrayList<Integer> broj = new ArrayList<Integer>();
        broj.add(1);
        broj.add(2);
        broj.add(3);
        broj.add(4);
        broj.add(5);

        broj.get(k);
        System.out.println(broj.get(k));


    }
}
