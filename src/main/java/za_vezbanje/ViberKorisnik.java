package za_vezbanje;

public class ViberKorisnik {
    private String imeIPrezime;
    private String brojTelefona;
    private boolean daLiJeTrenutnoAktivan;

    public ViberKorisnik(String imeIPrezime, String brojTelefona, boolean daLiJeTrenutnoAktivan) {
        this.imeIPrezime = imeIPrezime;
        this.brojTelefona = brojTelefona;
        this.daLiJeTrenutnoAktivan = daLiJeTrenutnoAktivan;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public boolean isDaLiJeTrenutnoAktivan() {
        return daLiJeTrenutnoAktivan;
    }

    public void setDaLiJeTrenutnoAktivan(boolean daLiJeTrenutnoAktivan) {
        this.daLiJeTrenutnoAktivan = daLiJeTrenutnoAktivan;
    }
}
