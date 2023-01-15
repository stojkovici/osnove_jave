package p13_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Sastojak s = new Sastojak("Pasta",85);
        Pasta p = new Pasta();
        Sastojak q = new Sastojak("Piletina",200);
        Sastojak r = new Sastojak("Pavlaka", 115);
        p.dodaj(s);
        p.dodaj(q);
        p.dodaj(r);
        p.print();
        p.brisiSastojak("Pasta");
        p.print();
    }
}
