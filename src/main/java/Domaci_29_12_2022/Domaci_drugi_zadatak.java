package Domaci_29_12_2022;

public class Domaci_drugi_zadatak {
    public static void main(String[] args) {
     FacebookPost ivan = new FacebookPost();
     ivan.setImeIPrezime("Ivan Stojkovic");
     ivan.setKorisnikProfila("Pera Peric");
     ivan.setTekst("Zdravo");
     ivan.setLajk(7);
     ivan.setShare(2);
     ivan.stampaj();
     ivan.povecajLajk();
     ivan.povecajLajk();
     ivan.povecajLajk();
     ivan.deljenje();
     ivan.deljenje();
     ivan.smanjiLajk();
     ivan.smanjiLajk();
     ivan.smanjiLajk();
        ivan.stampaj();
        System.out.println();

        FacebookPost pera = new FacebookPost();
        pera.setImeIPrezime("Pera Peric");
        pera.setKorisnikProfila("Mila Milic");
        pera.setTekst("Gospodjice Mila");
        pera.setLajk(147);
        pera.setShare(34);
        pera.stampaj();
        pera.povecajLajk();
        pera.povecajLajk();
        pera.povecajLajk();
        pera.povecajLajk();
        pera.povecajLajk();
        pera.povecajLajk();
        pera.deljenje();
        pera.deljenje();
        pera.deljenje();
        pera.deljenje();
        pera.deljenje();
        pera.deljenje();
        pera.smanjiLajk();
        pera.stampaj();



    }
}
