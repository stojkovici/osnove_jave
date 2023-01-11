package p10_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Tacka t = new Tacka();
        t.setX(10);
        t.setY(20);
        Tacka p = new Tacka(30,40);
        t.stampaj();
        p.stampaj();
    }
}
