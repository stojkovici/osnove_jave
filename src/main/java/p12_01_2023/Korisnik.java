package p12_01_2023;

public class Korisnik {
    private String imeIPrezime;
    private String tipLicence;

    public Korisnik(String imeIPrezime){
        tipLicence = "Basic";
        this.imeIPrezime = imeIPrezime;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getTipLicence() {
        return tipLicence;
    }
    public String pretplatiSe(int uplata){
        if (uplata==100){
            this.tipLicence = "Pro";
            return this.tipLicence;
        } else if (uplata==150){
            this.tipLicence = "Premium";
            return this.tipLicence;
        }
        return this.tipLicence;
    }
    public String ponistiPretplatu(){
        this.tipLicence = "Basic";
        return this.tipLicence;
    }
    public int maksimalnaDuzina(){
        int duzina = 0;
        if (this.tipLicence.equals("Basic")){
            duzina= 40;
            return duzina;
        } else if (this.tipLicence.equals("Pro")) {
            duzina = 240;
            return duzina;
        } else if (this.tipLicence.equals("Premium")){
            duzina= 1440;
            return duzina;
        }
        return duzina;
    }
    public void print(){
        System.out.println(this.imeIPrezime);
    }
}
