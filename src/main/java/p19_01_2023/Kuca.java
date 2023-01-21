package p19_01_2023;

public class Kuca extends Objekat {
    private int brojClanova;
    public Kuca(String adresa, double povrsina, int zona,int brojClanova) {
        super(adresa, povrsina, zona);
        this.brojClanova=brojClanova;
    }


    @Override
    public double porez() {
       return this.koeficijent()*this.povrsina;
    }

    @Override
    public void stampaj() {
        System.out.println("Adresa: "+this.adresa);
        System.out.println("Povrsina kuce je: "+this.povrsina);
        System.out.println("Zona u kojoj se nalazi kuca: "+this.zona);
        System.out.println("Broj clanova: "+this.brojClanova);
        System.out.println("Porez za kucu je: "+this.porez());
    }
}
