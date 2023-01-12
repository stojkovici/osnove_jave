package za_vezbanje;

public class Zadatak3 {
    public static void main(String[] args) {
        ViberKorisnik salje = new ViberKorisnik("Ivan Stojkovic","0625454847",false);
        ViberKorisnik prima = new ViberKorisnik("Pera Peric","0645518844",true);
        ViberReakcija reakcija = new ViberReakcija("like",prima);
        ViberPoruka poruka = new ViberPoruka("Cao","20:33",salje,prima);
        poruka.setReakcija(reakcija);
        poruka.prikazi();
        ViberKorisnik salje1 = new ViberKorisnik("Marko Markovic","065448877",true);
        ViberKorisnik prima1 = new ViberKorisnik("Slobodan Slobodanovic", "068445278",false);
        ViberPoruka poruka1 = new ViberPoruka("Haj haj","20:43",salje1,prima1);
        poruka1.prikazi();
    }
}
