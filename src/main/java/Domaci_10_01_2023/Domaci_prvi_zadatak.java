package Domaci_10_01_2023;

public class Domaci_prvi_zadatak {
    public static void main(String[] args) {
        Autor a = new Autor("Ivan","Stojkovic");
        Knjiga k = new Knjiga("ISBN 888-5-1248-4875-6","Uvod u qa",2015,a);
        k.stampaj();


    }
}
