package p13_01_2023;

public class Reakcija {
    private String tip;
    private String imeIPrezime;

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public Reakcija(String tip, String imeIPrezime) {
        this.tip = tip;
        this.imeIPrezime = imeIPrezime;
    }
}
