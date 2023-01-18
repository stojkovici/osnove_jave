package Domaci_16_01_2023;

public class Trener extends Osoba {
    private int godineIskustva;
    private String tip;

    public Trener(String imeIPrezime, String jmbg, int godinaRodjenja, int godineIskustva, String tip) {
        super(imeIPrezime, jmbg, godinaRodjenja);
        this.godineIskustva = godineIskustva;
        this.tip = tip;
    }
    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Godine iskustva: "+this.godineIskustva);
        System.out.println("Tip trenera: "+this.tip);
    }
}
