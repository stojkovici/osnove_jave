package Domaci_16_01_2023;

public class Domaci_prvi_zadatak {
    public static void main(String[] args) {
        Igrac q = new Igrac("Ivan Stojkovic","125544788555",1998,10,"Centarfor",true);
        Igrac w = new Igrac("Pera Peric","11255488899",1994,7,"Krilni napadac",false);
        Trener a = new Trener("Milan Milanovic","144878778875",1989,7,"Za igru");
        Trener s = new Trener("Jovan Jovanovic","144788545555",1991,4,"Pomocni");
        q.stampaj();
        w.stampaj();
        a.stampaj();
        s.stampaj();
    }
}
