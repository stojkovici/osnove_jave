package p14_12_2022;
import java.util.Scanner;
public class zadatak_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Znak karte koja je na stolu");
        String znakKarteNaStolu = s.next();
        System.out.println("Broj karte koja je na stolu");
        String brojKarteNaStolu = s.next();
        System.out.println("Znak karte koju zelite da odigrate");
        String znakKarteKojuZeliteDaOdigrate = s.next();
        System.out.println("Broj karte koju zelite da odigrate");
        String brojKarteKojuZeliteDaOdigrate = s.next();

        if (znakKarteNaStolu .equals(znakKarteKojuZeliteDaOdigrate) || brojKarteNaStolu .equals(brojKarteKojuZeliteDaOdigrate)){
            System.out.println("Potez je valida");
        } else {
            System.out.println("Potez nije valida");
        }
    }
}
