package Domaci_14_12_2022;
import java.util.Scanner;
public class Domaci_peti_zadatak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost a:");
        int a = s.nextInt();
        System.out.println("Unesite vrednost b:");
        int b = s.nextInt();
        System.out.println("Izaberite akciju (+, -, *, /)");
        String akcija = s.next();
        if (akcija.equals("+")){
            System.out.println("Rezultat:" + (a+b));
        } else if (akcija.equals("-")) {
            System.out.println("Rezultat:" + (a-b));
        } else if (akcija.equals("*")){
            System.out.println("Rezultat:" + (a*b));
        } else {
            System.out.println("Rezultat:" + (a/b));
        }
    }
}
