package Domaci_13_01_2023;

import java.util.ArrayList;

public class Student {
    private int brojIndeksa;
    private String imeIPrezime;
    private String tipStudija;
    ArrayList<Ispit> ispiti;

    public Student(int brojIndeksa, String imeIPrezime, String tipStudija) {
        this.brojIndeksa = brojIndeksa;
        this.imeIPrezime = imeIPrezime;
        this.tipStudija = tipStudija;
        ispiti = new ArrayList<>();
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }
    public void dodajIspit(Ispit a){
        this.ispiti.add(a);
    }

    public double prosek() {
        double zbir = 0;
        double prosek = 0;
        for (int i = 0; i < ispiti.size(); i++) {
            if (this.ispiti.get(i).polozenIspit()==false){
                this.ispiti.remove(i);
            }
            zbir = zbir+this.ispiti.get(i).getOcena();
            prosek = zbir/this.ispiti.size();
        }
        return prosek;
    }
    public void print(){
        System.out.println(this.brojIndeksa+" - "+this.imeIPrezime+" - "+this.tipStudija);
        System.out.println("Predmeti: ");
        for (int i = 0; i <this.ispiti.size() ; i++) {
            System.out.println(this.ispiti.get(i).getNaziv()+" - "+this.ispiti.get(i).getImeIPrezimeProfesora()+" - "+this.ispiti.get(i).getOcena());
        }
        System.out.println("Prosecna ocena: "+this.prosek());
    }
}
