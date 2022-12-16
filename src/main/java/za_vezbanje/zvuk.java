package za_vezbanje;
import java.util.Scanner;
public class zvuk {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int jacina = 75;
        System.out.println("Unesite akciju");
        String akcija = s.next();
        if (akcija.equals("pojacaj")) {
            System.out.println("Zvuk je:" + (jacina + 10));
        } else if (akcija.equals("smanji")) {
            System.out.println("Zvuk je:" + (jacina - 10));
        } else if (akcija.equals("mute")) {
            System.out.println("Zvuk je" + (jacina * 0));
        }

    }
}