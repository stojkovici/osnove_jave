package p19_01_2023;

public class Zgrada extends Objekat{
    private int brojStanova;

    public int getBrojStanova() {
        return brojStanova;
    }

    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;
    }

    public Zgrada(String adresa, double povrsina, int zona,int brojStanova) {
        super(adresa, povrsina, zona);
        this.brojStanova=brojStanova;
    }

    @Override
    public double porez() {
        return this.koeficijent()*this.povrsina*this.brojStanova;
    }

    @Override
    public void stampaj() {
        System.out.println("Adresa: "+this.adresa);
        System.out.println("Povrsina zgrade je: "+this.povrsina);
        System.out.println("Zona u kojoj se nalazi zgrada: "+this.zona);
        System.out.println("Broj stanova: "+this.brojStanova);
        System.out.println("Porez za zgradu je: "+this.porez());
    }
}
