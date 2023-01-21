package Domaci_19_01_2023;

public class StaklenaAmbalaza extends Ambalaza{
    private int kaucija;
    private boolean daLiSePlacaKaucija;
    private double osnovnaCena;

    public int getKaucija() {
        return kaucija;
    }

    public void setKaucija(int kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isDaLiSePlacaKaucija() {
        return daLiSePlacaKaucija;
    }

    public void setDaLiSePlacaKaucija(boolean daLiSePlacaKaucija) {
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double cena) {
        this.osnovnaCena = cena;
    }

    public StaklenaAmbalaza(String barkod, String naziv, int netoTezina, int brutoTezina, int kaucija, boolean daLiSePlacaKaucija, double cena) {
        super(barkod, naziv, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
        this.osnovnaCena = cena;
    }


    @Override
    public double cena() {
        double cena = 0;
        if (this.daLiSePlacaKaucija==true){
            cena = this.osnovnaCena*1.2+this.kaucija;
            return cena;
        }
        else {
            cena=this.osnovnaCena*1.2;
            return cena;
        }
    }

    @Override
    public void stampaj() {
        System.out.println("Barkod: "+this.barkod);
        System.out.println("Naziv: "+this.naziv);
        System.out.println("Neto tezina: "+this.netoTezina);
        System.out.println("Bruto tezina: "+this.brutoTezina);
        if (this.daLiSePlacaKaucija==true) {
            System.out.println("Kaucija: " + this.kaucija);
        }
        else {
            System.out.println("Nema kaucije.");
        }
        System.out.println("Cena: "+this.cena());
    }
}

