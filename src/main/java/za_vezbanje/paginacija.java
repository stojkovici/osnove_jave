package za_vezbanje;
import java.util.Scanner;
public class paginacija {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj rezultata:");
        int brojRezultata = s.nextInt();
        System.out.println("Unesite broj rezultata po strani:");
        int brps = s.nextInt();
        System.out.println("Unesite stranu");
        int strana = s.nextInt();
        int prikaz = brojRezultata/brps;
        int strana1 = prikaz*strana;
        System.out.println();
    }
}
