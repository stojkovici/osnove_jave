package p27_12_2022;

public class Auto {
    public String imeIPrezime;
    public String markaAutomobila;
    public int brojVrata;
    public int potrosnjaNa100Km;
    public int trenutnaBrzina;
    public int godinaProzivodnje;
    public int mesecRegistracije;
    public int kubikaza;


    public void stampaj(){
        System.out.println(this.imeIPrezime);
        System.out.println(this.markaAutomobila+" - "+this.brojVrata+"-ro vrata");
        System.out.println("Sa potrosnjom od "+this.potrosnjaNa100Km+" l na 100km");
        System.out.println(this.trenutnaBrzina+" km/h je trenutna brzina");
    }
    public boolean prekoracenje(int a){
         if (this.trenutnaBrzina>a){
             return true;
         }
         else {
             return false;
         }

    }
    public int kazna(int a){
        int visinaKazne = (this.trenutnaBrzina - a)*1000;
        if(visinaKazne<0){
            visinaKazne = 0;
        }
        return visinaKazne;
    }
    public boolean jeOldtimer(){
        int godinaProizvodnje = this.godinaProzivodnje;
        if (this.godinaProzivodnje<1950){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean jeRegistrovan(int a){
        int mesec = this.mesecRegistracije;
        if (this.mesecRegistracije<a){
            return true;
        }
            else {
          return false;
        }

    }
    public double cenaRegistracije(){
        if (this.kubikaza<2000){
            double cena = this.kubikaza*100;
            return cena;
        }
        else {
            double cenaPreko = (this.kubikaza*100)*1.3;
            return cenaPreko;
        }
    }
}
