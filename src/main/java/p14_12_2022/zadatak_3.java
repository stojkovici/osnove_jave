package p14_12_2022;
import java.util.Scanner;
public class zadatak_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost a");
        double a = s.nextDouble();
        System.out.println("Unesite vrednost b");
        double b = s.nextDouble();
        System.out.println("Unesite vrednost c");
        double c = s.nextDouble();
        System.out.println((a+b+c)/3);
    }
}
