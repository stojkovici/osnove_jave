package Domaci_19_01_2023;

public class Tetrapak extends Ambalaza {
    private boolean mozeDaSeReciklira;
    private double osnovnaCena;

    public boolean isMozeDaSeReciklira() {
        return mozeDaSeReciklira;
    }

    public void setMozeDaSeReciklira(boolean mozeDaSeReciklira) {
        this.mozeDaSeReciklira = mozeDaSeReciklira;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(int osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    public Tetrapak(String barkod, String naziv, int netoTezina, int brutoTezina, boolean mozeDaSeReciklira, int osnovnaCena) {
        super(barkod, naziv, netoTezina, brutoTezina);
        this.mozeDaSeReciklira = mozeDaSeReciklira;
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cena() {
        double cena = 0;
        if (this.mozeDaSeReciklira==true){
            cena = this.tezinaPakovanja()*1.5+this.osnovnaCena;
            return cena;
        }
        else{
            cena= this.osnovnaCena;
            return cena;
        }
    }

    @Override
    public void stampaj() {
        System.out.println("Barkod: "+this.barkod);
        System.out.println("Naziv: "+this.naziv);
        System.out.println("Neto tezina: "+this.netoTezina);
        System.out.println("Bruto tezina: "+this.brutoTezina);
        if (this.mozeDaSeReciklira==true) {
            System.out.println("Moze da se reciklira.");
        } else  {
                System.out.println("Ne moze da se reciklira");
        }
        System.out.println("Cena: "+this.cena());
    }
}
