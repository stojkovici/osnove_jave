package za_vezbanje;

import java.util.ArrayList;
import java.util.Scanner;

public class loto {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> brojevi = new ArrayList<>();
 //       brojevi.add(7);
//        brojevi.add(8);
 //       brojevi.add(19);
  //      brojevi.add(25);
  //      brojevi.add(30);
  //      brojevi.add(35);
   //     brojevi.add(37);
        for (int i = 0; i <7 ; i++) {
            System.out.println("Unesite broj iz Vase kombinacije:");
            int broj = s.nextInt();
            brojevi.add(broj);

        }
        ArrayList<Integer> dobitna = new ArrayList<>();
        //dobitna.add(7);
        //dobitna.add(8);
        //dobitna.add(19);
        //dobitna.add(25);
        //dobitna.add(30);
        //dobitna.add(35);
        //dobitna.add(37);
        for (int i = 0; i <7 ; i++) {
            System.out.println("Unesite broj iz dobitne kombinacije");
            int broj1 = s.nextInt();
            dobitna.add(broj1);
        }

        if (brojevi.equals(dobitna)){
            System.out.println("Jeste dobitna");
        }
        else {
            System.out.println("Nije dobitna");
        }

    }
}
