package p10_01_2023;

public class Zadatak3 {
    public static void main(String[] args) {
        Film f = new Film("X", 2022);
        Reziser r = new Reziser("Ti West",45);
        f.setReziser(r);
        f.stampaj();
    }
}
