package p12_01_2023;

public class FizickoLice {
    private String imeIPrezime;
    private int brojLicneKarte;
    private String jmbg;
    private boolean daLiJeOsobaPrethodnoKupovala;

    public FizickoLice(String imeIPrezime, int brojLicneKarte, String jmbg, boolean daLiJeOsobaPrethodnoKupovala) {
        this.imeIPrezime = imeIPrezime;
        this.brojLicneKarte = brojLicneKarte;
        this.jmbg = jmbg;
        this.daLiJeOsobaPrethodnoKupovala = daLiJeOsobaPrethodnoKupovala;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getBrojLicneKarte() {
        return brojLicneKarte;
    }

    public void setBrojLicneKarte(int brojLicneKarte) {
        this.brojLicneKarte = brojLicneKarte;
    }

    public String getJmbg() {
        return jmbg;
    }

    public boolean isDaLiJeOsobaPrethodnoKupovala() {
        return daLiJeOsobaPrethodnoKupovala;
    }

    public void setDaLiJeOsobaPrethodnoKupovala(boolean daLiJeOsobaPrethodnoKupovala) {
        this.daLiJeOsobaPrethodnoKupovala = daLiJeOsobaPrethodnoKupovala;
    }
    public void stampaj(){
        System.out.println(this.imeIPrezime+", "+this.brojLicneKarte);
    }

    public FizickoLice(String imeIPrezime, int brojLicneKarte, String jmbg) {
        this.imeIPrezime = imeIPrezime;
        this.brojLicneKarte = brojLicneKarte;
        this.jmbg = jmbg;
    }
}
