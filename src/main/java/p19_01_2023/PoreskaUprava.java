package p19_01_2023;

import java.util.ArrayList;

public class PoreskaUprava {
    private String imeGrada;
    ArrayList<Objekat> objekti;

    public PoreskaUprava(String imeGrada) {
        this.imeGrada = imeGrada;
        this.objekti = new ArrayList<>();
    }

    public void dodaj(Objekat objekat){
        objekti.add(objekat);
    }
    public double ukupanPorez(){
        double ukupno=0;
        for (int i = 0; i < objekti.size(); i++) {
            ukupno=ukupno+this.objekti.get(i).porez();
        }
        return ukupno;
    }
    public void stampaj(){
        for (int i = 0; i <objekti.size() ; i++) {
            System.out.println("Adresa: "+objekti.get(i).adresa);
            System.out.println("Povrsina: "+objekti.get(i).povrsina);
            System.out.println("Zona: "+objekti.get(i).zona);
            System.out.println("Porez: "+objekti.get(i).porez());
        }
    }

}
