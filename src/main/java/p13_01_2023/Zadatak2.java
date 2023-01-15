package p13_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        Reakcija r = new Reakcija("Smajli", "Pera Petrovic");
        FacebookPost fp = new FacebookPost("Ivan Stojkovic","Cao");
        Reakcija w = new Reakcija("Srce","Milan Milanovic");
        Reakcija t = new Reakcija("Like","Jovan Jovanovic");
        fp.dodaj(r);
        fp.dodaj(w);
        fp.dodaj(t);
        fp.stampaj();

    }
}
