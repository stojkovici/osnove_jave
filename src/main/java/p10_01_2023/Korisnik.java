package p10_01_2023;

public class Korisnik {
    private String ime;
    private String prezime;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }
    public Korisnik(String ime,String prezime){
        this.ime = ime;
        this.prezime = prezime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    public void stampaj(){
        System.out.println(this.ime+" "+this.prezime);
    }
}
