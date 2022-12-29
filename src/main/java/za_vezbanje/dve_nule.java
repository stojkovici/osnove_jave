package za_vezbanje;

import java.util.Scanner;

public class dve_nule {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int suma = 0;
        int broj= 1;
        while(!(broj==0)){
            System.out.println("Unesite broj: ");
            broj = s.nextInt();
            suma= suma+broj;
        }
        System.out.println("Suma je: "+suma);
    }
}
