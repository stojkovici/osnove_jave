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
    public String tablica;
    public boolean klimaUAutu;
    public int maksimalnaBrzina;
    public int kapacitetRezervoara;
    public double kolicinaGoriva;



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
    public void dodajGas(){
        this.trenutnaBrzina= this.trenutnaBrzina +10;
        if (this.trenutnaBrzina>this.maksimalnaBrzina){
            this.trenutnaBrzina = this.maksimalnaBrzina;
        }
    }
    public void koci(){
        this.trenutnaBrzina = this.trenutnaBrzina -10;
        if(this.trenutnaBrzina<0){
            this.trenutnaBrzina = 0;
        }
    }
    public double trenutnaPotrosnja(){
        if(klimaUAutu){
            double potrosnja= (this.trenutnaBrzina / 100.0 * this.potrosnjaNa100Km)*1.2;
            return potrosnja;
        }
        else {
            double potrosnja1= (this.trenutnaBrzina/100.0 * this.potrosnjaNa100Km)*1.0;
            return potrosnja1;
        }
    }
    public boolean ukljuciKlimu(){
        klimaUAutu = true;
        return klimaUAutu;
    }
    public void stampajTablu(){
        for (int i = 0; i <100 ; i++) {
            double brzinometar = (this.trenutnaBrzina*100)/this.maksimalnaBrzina;
            if(i<=brzinometar){
                System.out.print("|");
            }else {
                System.out.print(".");
            }
        }
    }
    public double natociGorivo(double a){
        double gorivo = a*210;
        if(a+this.kolicinaGoriva>this.kapacitetRezervoara){
            gorivo=this.kapacitetRezervoara*210;
        }
        return gorivo;

    }
}
