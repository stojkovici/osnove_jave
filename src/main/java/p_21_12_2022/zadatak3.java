package p_21_12_2022;

import java.util.ArrayList;

public class zadatak3 {
    public static void main(String[] args) {
        ArrayList<Integer> broj = new ArrayList<Integer>();
        broj.add(1);
        broj.add(2);
        broj.add(3);
        broj.add(4);
        broj.add(5);

        int staraNulta = broj.get(0);

        broj.set(0, broj.get(4));
        broj.set(4,staraNulta);




    }
}