package Domaci_13_01_2023;

public class Ispit {
    private String naziv;
    private int ocena;
    private String imeIPrezimeProfesora;

    public Ispit(String naziv, int ocena, String imeIPrezimeProfesora) {
        this.naziv = naziv;
        this.ocena = ocena;
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getImeIPrezimeProfesora() {
        return imeIPrezimeProfesora;
    }

    public void setImeIPrezimeProfesora(String imeIPrezimeProfesora) {
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
    }
    public boolean polozenIspit(){
        if (this.ocena>5&&this.ocena<=10){
            return true;
        } else {
            return false;
        }
    }
    public void stampaj(){
        System.out.println(this.naziv+" - "+this.imeIPrezimeProfesora+" - "+ this.ocena);
    }
}
