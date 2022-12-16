package p14_12_2022;
import java.util.Scanner;
public class zadatak_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost a:");
        int a = s.nextInt();
        System.out.println("Unesite vrednost b:");
        int b = s.nextInt();
        int c = a + b;

        if (a*a + b*b == c*c) {
            System.out.println("Trougao je pravougli");
        } else {
            System.out.println("Trougao nije pravougli");
        }
    }
}
