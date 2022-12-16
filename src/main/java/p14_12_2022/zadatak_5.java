package p14_12_2022;
import java.util.Scanner;
public class zadatak_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost a:");
        int a = s.nextInt();
        System.out.println("Unesite vrednost b");
        int b = s.nextInt();
        System.out.println("Unesite vrednost c");
        int c = s.nextInt();

        if (a>c && a<b) {
            System.out.println("A je u opsegu izmedju b i c");
        } else {
            System.out.println("A nije u opsegu izmedju b i c");
        }
    }
}
