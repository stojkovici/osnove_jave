package Domaci_14_12_2022;
import java.util.Scanner;
public class Domaci_drugi_zadatak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost a");
        int a = s.nextInt();
        System.out.println("Unesite vrednost b");
        int b = s.nextInt();

        if (b==1){
            System.out.println("Nova vrenost za a iznosi " + (a + 10));
        } else if (b==2) {
            System.out.println("Nova vrednost za a iznosi " + (a - 20));
        } else {
            System.out.println("Vrednost b mora da bude 1 ili 2");
        }
    }
}
