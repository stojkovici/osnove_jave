package p_20_12_2022;

import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String zajebava="zajebava";
        String mars="mars";
        String stoko="stoko";
        String svinjo="svinjo";
        String rec = " ";
        while(!rec.contains(".")){
            System.out.println("Unesite rec");
            rec = s.next();
            if (rec.contains(zajebava)){
                System.out.println("beeeeeeeeeeeeeeeeeeeeeeep");
            }
            if (rec.contains(mars)){
                System.out.println("beeeeeeeeeeeeeeeeeeeeeeep");
            }
            if(rec.contains(stoko)){
                System.out.println("beeeeeeeeeeeeeeeeeeeeeeep");
            }
            if (rec.contains(svinjo)){
                System.out.println("beeeeeeeeeeeeeeeeeeeeeeep");
            }

        }
        System.out.println("Kraj programa");
    }
}
