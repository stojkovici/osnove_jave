package p10_01_2023;

public class Film {
    private String naziv;
    private int godinaFilma;
    private Reziser reziser;

    public Film (String naziv, int godinaFilma){
        this.naziv = naziv;
        this.godinaFilma = godinaFilma;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaFilma() {
        return godinaFilma;
    }

    public Reziser getReziser() {
        return reziser;
    }

    public void setReziser(Reziser reziser) {
        this.reziser = reziser;
    }

    public void setGodinaFilma(int godinaFilma) {
        this.godinaFilma = godinaFilma;
    }
    public void stampaj(){
        System.out.println("Naziv filma: "+this.naziv+" Godina iz koje je film: "+this.godinaFilma);
        System.out.println("Rezirao ga je: "+this.reziser.getImeIPrezime()+" "+this.reziser.getStarost()+"god");
    }

}
