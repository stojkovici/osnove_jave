package Domaci_29_12_2022;

public class Domaci_prvi_zadatak {
    public static void main(String[] args) {
        Proizvod secer = new Proizvod();
        secer.naziv = "Secer";
        secer.cena = 114;
        secer.tezinaUG = 300;
        secer.stampaj();
        double povecanaCena = secer.povecajCenu(34);
        System.out.println("Povecana cena je: "+povecanaCena+"din");
        double cenaSaPopustom = secer.vratiCenuSaPopustom(48);
        System.out.println("Cena sa popustom je: "+cenaSaPopustom+"din");
        int postarina = secer.racunajPostarinu();
        System.out.println("Postarina je: "+postarina+"din");
        System.out.println();

        Proizvod banane = new Proizvod();
        banane.naziv = "Banane";
        banane.cena = 245;
        banane.tezinaUG = 1000;
        banane.stampaj();
        double cenaPovecana = banane.povecajCenu(748);
        System.out.println("Povecana cena je: "+cenaPovecana+"din");
        double cenaPopust = secer.vratiCenuSaPopustom(78);
        System.out.println("Cena sa popustom je: "+cenaPopust+"din");
        int post = secer.racunajPostarinu();
        System.out.println("Postarina je: "+post+"din");


    }

}
