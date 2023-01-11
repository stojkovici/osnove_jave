package Domaci_10_01_2023;

public class Kupac {
    private String imeIPrezime;
    private ClanskaKartica kartica;

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public ClanskaKartica getKartica() {
        return kartica;
    }

    public void setKartica(ClanskaKartica kartica) {
        this.kartica = kartica;
    }

    public Kupac(String imeIPrezime){
        this.imeIPrezime = imeIPrezime;
    }
    public void stampaj(){
        System.out.println("Ime i prezime: "+this.imeIPrezime+" - Broj kartice je: "+this.getKartica().getBrojKartice());
    }
}
