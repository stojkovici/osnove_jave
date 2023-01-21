package Domaci_19_01_2023;

public class Domaci_prvi_zadatak {
    public static void main(String[] args) {
        Korpa k = new Korpa();
        Tetrapak t = new Tetrapak("444447-8880","Mleko",1000,1100,true,150);
        StaklenaAmbalaza s = new StaklenaAmbalaza("77741-22210","Nisko",330,500,45,true,60);
        StaklenaAmbalaza sa = new StaklenaAmbalaza("4441115-77884","Pepsi",330,450,40,false,80);
        Tetrapak t1 = new Tetrapak("711554-88555","Djus",500,550,false,115);
        SuperKartica sk = new SuperKartica(14555,"Ivan Stojkovic",200);
        k.dodaj(t);
        k.dodaj(s);
        k.dodaj(sa);
        k.dodaj(t1);
        double ukupnaSaPopustom=k.ukupnaCena(sk);
        k.izbaci("444447-8880");
        k.stampaj();
        System.out.println("Ukupna cena sa popustom: "+ukupnaSaPopustom);

    }
}
