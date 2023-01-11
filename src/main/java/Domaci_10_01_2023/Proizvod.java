package Domaci_10_01_2023;

public class Proizvod {
    private String naziv;
    private Kupac kupac;
    private int cenaIzrade;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public int getCenaIzrade() {
        return cenaIzrade;
    }

    public void setCenaIzrade(int cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }
    public Proizvod(String naziv, int cenaIzrade){
        this.naziv = naziv;
        this.cenaIzrade = cenaIzrade;
    }
    public double cenaProizvoda(){
        double cena = this.cenaIzrade*1.9*(100-this.kupac.getKartica().getPopust())/100;
        return cena;
    }
    public void stampaj(){
        System.out.println("Naziv proizvoda: "+this.naziv+" - Cena je: "+this.cenaProizvoda());
        System.out.println("Ime i prezime kupca: "+this.kupac.getImeIPrezime()+" Broj kartice: "+this.kupac.getKartica().getBrojKartice());
    }
}
