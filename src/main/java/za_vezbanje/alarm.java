package za_vezbanje;
import java.util.Scanner;
public class alarm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite sat:");
        int sat = s.nextInt();
        System.out.println("Unesite minut:");
        int minut = s.nextInt();
        System.out.println("Aktivirace se u:");
        System.out.println(sat+":"+minut);
        System.out.println(sat+":"+(minut+5));
        System.out.println(sat+":"+(minut+5+5));
        System.out.println(sat+":"+(minut+5+5+5));
        System.out.println(sat+":"+(minut+5+5+5+5));
        System.out.println(sat+":"+(minut+5+5+5+5+5));
        System.out.println(sat+":"+(minut+5+5+5+5+5+5));
        if (minut > 59){
        minut = 00;
        }
    }
}