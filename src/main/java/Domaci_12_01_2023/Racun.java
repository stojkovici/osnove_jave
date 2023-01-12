package Domaci_12_01_2023;

public class Racun {
    private String broj;
    private String imeIPrezime;
    private int trenutnoNaRacunu;

    public Racun(String broj, String imeIPrezime,int trenutnoNaRacunu) {
        this.broj = broj;
        this.imeIPrezime = imeIPrezime;
        this.trenutnoNaRacunu = trenutnoNaRacunu;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getTrenutnoNaRacunu() {
        return trenutnoNaRacunu;
    }

    public int stanje(int stanje){
        this.trenutnoNaRacunu = this.trenutnoNaRacunu+stanje;
        if (this.trenutnoNaRacunu<0){
            this.trenutnoNaRacunu =0;
            return trenutnoNaRacunu;
        }
        return this.trenutnoNaRacunu;
    }
    public void stampaj(){
        System.out.println(this.imeIPrezime+" - "+this.broj);
        System.out.println("Stanje na racunu je "+this.trenutnoNaRacunu+" rsd");
    }

}
