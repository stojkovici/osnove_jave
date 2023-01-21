package Domaci_19_01_2023;

import java.util.ArrayList;

public class Korpa {
    ArrayList<Ambalaza>niz;

    public Korpa(){
        niz=new ArrayList<>();
    }
    public void dodaj(Ambalaza a){
        niz.add(a);
    }
    public void izbaci(String a){
        for (int i = 0; i <niz.size() ; i++) {
            if (niz.get(i).barkod.equals(a)){
                niz.remove(i);
            }
        }
    }
    private double cenaSaPopustom(SuperKartica a){
        double cenaSaPopustom=0;
        for (int i = 0; i <niz.size() ; i++) {
            cenaSaPopustom = niz.get(i).cena()-a.getPopust();
        }
        return cenaSaPopustom;
    }
    public double ukupnaCena(SuperKartica a){
        double ukupna=0;
        for (int i = 0; i <niz.size() ; i++) {
            ukupna=ukupna+this.niz.get(i).cena();
        }
        ukupna=ukupna-a.getPopust();

        return ukupna;
    }
    public void stampaj(){
        for (int i = 0; i < niz.size(); i++) {
            System.out.println("Barkod: "+this.niz.get(i).barkod);
            System.out.println("Naziv: "+this.niz.get(i).naziv);
            System.out.println("Neto tezina: "+this.niz.get(i).netoTezina);
            System.out.println("Bruto tezina: "+this.niz.get(i).brutoTezina);
            System.out.println("Cena: "+this.niz.get(i).cena());
        }
    }
}
