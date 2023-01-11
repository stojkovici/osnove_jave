package Domaci_10_01_2023;

public class Domaci_drugi_zadatak {
    public static void main(String[] args) {
        Proizvod p = new Proizvod("Smoki", 21);
        Kupac k = new Kupac("Ivan Stojkovic");
        ClanskaKartica ck = new ClanskaKartica(8,"4487-1125");
        p.setKupac(k);
        k.setKartica(ck);
        p.stampaj();


    }
}
