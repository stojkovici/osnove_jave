package p29_12_2022;

public class Student {
    private String ime;
    private String prezime;
    private int brojIndeksa;
    private boolean daLiJeNaBudzetu;

    public String getIme(){
        return this.ime;
    }
    public void setIme(String ime){
        this.ime = ime;
    }
    public String getPrezime(){
        return this.prezime;
    }
    public void setPrezime(String prezime){
        this.prezime = prezime;
    }
    public int getBrojIndeksa(){
        return this.brojIndeksa;
    }
    public void setBrojIndeksa(int brojIndeksa){
        this.brojIndeksa = brojIndeksa;
    }
    public boolean getDaLiJeNaBudzetu(){
        return this.daLiJeNaBudzetu;
    }
    public void setDaLiJeNaBudzetu(boolean daLiJeNaBudzetu){
        this.daLiJeNaBudzetu = daLiJeNaBudzetu;
    }
}
