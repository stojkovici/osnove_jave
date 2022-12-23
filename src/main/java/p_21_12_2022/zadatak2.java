package p_21_12_2022;

import java.util.ArrayList;

public class zadatak2 {
    public static void main(String[] args) {
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        brojevi.add(1);
        brojevi.add(2);
        brojevi.add(3);
        brojevi.add(4);
        brojevi.add(5);

        brojevi.set(3, brojevi.get(3)*10);
        int s = brojevi.get(3);
        System.out.println(s);

    }
}
