package p13_01_2023;

import java.util.ArrayList;

public class Pasta {
    ArrayList<Sastojak> sastojak;

    public Pasta() {
        this.sastojak = new ArrayList<>();
    }

    public void dodaj(Sastojak sastojak){
        this.sastojak.add(sastojak);
    }
    public int cena(){
        int cena = 0;
        for (int i = 0; i <sastojak.size() ; i++) {
            cena = cena+this.sastojak.get(i).getCena();
        }
        return cena;
    }
    public void print (){
        System.out.println("Pasta je sa sastojcima: ");
        for (int i = 0; i < sastojak.size(); i++) {
            System.out.println(sastojak.get(i).getNaziv()+" - "+sastojak.get(i).getCena()+".din");
        }
        System.out.println("Cena paste je "+this.cena()+".din");

    }
    public void brisiSastojak(String sastojak){
        for (int i = 0; i <this.sastojak.size() ; i++){
            if (this.sastojak.get(i).getNaziv().equals(sastojak)){
                this.sastojak.remove(i);
            }
        }
    }

}
