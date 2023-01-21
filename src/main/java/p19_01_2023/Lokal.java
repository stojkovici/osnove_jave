package p19_01_2023;

public class Lokal extends Objekat{

    public Lokal(String adresa, double povrsina, int zona) {
        super(adresa, povrsina, zona);
    }

    @Override
    public double porez() {
        return this.koeficijent()*this.povrsina*1.3;
    }

    @Override
    public void stampaj() {

        System.out.println("Adresa: "+this.adresa);
        System.out.println("Povrsina lokala je: "+this.povrsina);
        System.out.println("Zona u kojoj se nalazi lokal: "+this.zona);
        System.out.println("Porez za lokal je: "+this.porez());
    }
}
