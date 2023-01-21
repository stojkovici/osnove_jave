package p19_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        PoreskaUprava p = new PoreskaUprava("Donje Medjurovo");
        Kuca k = new Kuca("Milosa Obrenovica", 155, 2, 3);
        Zgrada z = new Zgrada("Marsala Tita", 1200, 1, 32);
        Lokal l = new Lokal("Pop Mice", 45, 3);
        p.dodaj(k);
        p.dodaj(z);
        p.dodaj(l);
        p.stampaj();
        System.out.println("Ukupan porez je: "+p.ukupanPorez());

    }
}
