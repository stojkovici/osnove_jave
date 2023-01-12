package Domaci_12_01_2023;

public class Transakcija {
    private int id;
    private Racun posiljalac;
    private Racun primalac;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Racun getPosiljalac() {
        return posiljalac;
    }

    public void setPosiljalac(Racun posiljalac) {
        this.posiljalac = posiljalac;
    }

    public Racun getPrimalac() {
        return primalac;
    }

    public void setPrimalac(Racun primalac) {
        this.primalac = primalac;
    }

    public Transakcija(int id, Racun posiljalac, Racun primalac) {
        this.id = id;
        this.posiljalac = posiljalac;
        this.primalac = primalac;
    }
    private double provizija(int visinaTransakcije){
        if (visinaTransakcije<4500){
            double provizija = 45;
            return provizija;
        }
        else {
            double provizija = visinaTransakcije*1/100;
            return provizija;
        }
    }
    public void transakicija(int t){
       double posiljalac = this.posiljalac.getTrenutnoNaRacunu()-t-this.provizija(t);
       double primalac = this.primalac.getTrenutnoNaRacunu()+t;
        System.out.println("Novo stanje na racunu "+this.posiljalac.getBroj()+" nakon transakcije je: "+posiljalac);
        System.out.println("Novo stanje na racunu "+this.primalac.getBroj()+" nakon transakcije je: "+primalac);
    }
    public void stampaj(){
        System.out.println(this.id);
        System.out.println("Racun sa: "+this.posiljalac.getImeIPrezime()+" - "+this.posiljalac.getBroj());
        System.out.println("Racun na: "+this.primalac.getImeIPrezime()+" - "+this.primalac.getBroj());
    }
}
