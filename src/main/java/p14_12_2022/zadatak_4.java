package p14_12_2022;
import java.util.Scanner;
public class zadatak_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost a:");
        int a = s.nextInt();
        System.out.println("Unesite vrednost b:");
        int b = s.nextInt();
        if (b < a) {
            System.out.println("B je manje od a");
        }

    }
}
