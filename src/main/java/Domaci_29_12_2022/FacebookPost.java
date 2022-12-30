package Domaci_29_12_2022;

public class FacebookPost {
    private String imeIPrezime;
    private String korisnikProfila;
    private String tekst;
    private int lajk;
    private int share;

    public String getImeIPrezime() {
        return this.imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }
    public String getKorisnikProfila(){
        return this.korisnikProfila;
    }
    public void setKorisnikProfila(String korisnikProfila){
        this.korisnikProfila = korisnikProfila;
    }
    public String getTekst(){
        return this.tekst;
    }
    public void setTekst(String tekst){
        this.tekst = tekst;
    }

    public int getLajk() {
        return lajk;
    }
    public void setLajk(int lajk){
        this.lajk = lajk;
    }

    public int getShare() {
        return share;
    }
    public void setShare(int share){
        this.share = share;
    }

    public int povecajLajk(){
        this.lajk = this.lajk+1;
        return this.lajk;
    }
    public int smanjiLajk(){
        this.lajk = this.lajk-1;
        if (this.lajk<0){
            this.lajk=0;
        }
        return this.lajk;
    }
    public int deljenje(){
        this.share = this.share+1;
        return this.share;
    }
    public void stampaj(){
        System.out.println(this.imeIPrezime+" >>> "+this.korisnikProfila);
        System.out.println(this.tekst);
        System.out.println("Likes "+this.lajk+" | Shares "+this.share);
    }

}
