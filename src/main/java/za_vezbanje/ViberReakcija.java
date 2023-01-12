package za_vezbanje;

public class ViberReakcija {
    private String emoji;
    private ViberKorisnik kojiJeReagovao;

    public ViberReakcija(String emoji, ViberKorisnik kojiJeReagovao) {
        this.emoji = emoji;
        this.kojiJeReagovao = kojiJeReagovao;
    }

    public String getEmoji() {
        return emoji;
    }

    public ViberKorisnik getKojiJeReagovao() {
        return kojiJeReagovao;
    }

}
