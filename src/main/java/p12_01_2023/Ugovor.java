package p12_01_2023;

public class Ugovor {
    private String godinaDanIMesecSklapanja;
    private FizickoLice prodavac;
    private FizickoLice kupac;
    private int cenaNekrtetnine;
    private String adresaNekretnine;

    public Ugovor(String godinaDanIMesecSklapanja, FizickoLice prodavac, FizickoLice kupac, int cenaNekrtetnine, String adresaNekretnine) {
        this.godinaDanIMesecSklapanja = godinaDanIMesecSklapanja;
        this.prodavac = prodavac;
        this.kupac = kupac;
        this.cenaNekrtetnine = cenaNekrtetnine;
        this.adresaNekretnine = adresaNekretnine;
    }
    public double procenat(){
        double procenat=0;
        if(this.kupac.isDaLiJeOsobaPrethodnoKupovala()==true){
            procenat = 0.02;
            return procenat;
        }
        else{
            procenat = 0.03;
            return procenat;
        }
    }
    public double zarada(){
        double zarada = 1000+this.cenaNekrtetnine*this.procenat();
        return zarada;
    }
    public void stampaj(){
        System.out.println("Dana "+this.godinaDanIMesecSklapanja+"god sklopljen je ugovor izmedju "+this.prodavac.getImeIPrezime()+" i "+this.kupac.getImeIPrezime()+" o kupovini nekretnine "+this.adresaNekretnine+" po ceni od "+this.cenaNekrtetnine+" pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od "+this.zarada()+".");
    }
}
