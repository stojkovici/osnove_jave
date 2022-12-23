package p_21_12_2022;

import java.util.ArrayList;

public class zadatak1 {
    public static void main(String[] args) {
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        brojevi.add(1);
        brojevi.add(2);
        brojevi.add(3);
        brojevi.add(4);
        brojevi.add(5);

        int a = brojevi.get(0);
        int b = brojevi.get(4);
        int c = a+b;
        System.out.println("Suma je "+c);

    }
}
