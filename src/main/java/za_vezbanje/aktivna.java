package za_vezbanje;

import java.util.Scanner;

public class aktivna {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String aktivno = "*";
        String neaktivno = "_";
        System.out.println("Unesite a");
        int a = s.nextInt();
        System.out.println("Unesite b");
        int b = s.nextInt();
        for (int i = 1; i <= 20; i++) {
            if (i<a || i>b){
                System.out.print("*"+" ");
            }else {
                System.out.print("_ ");
            }

        }

    }
}
