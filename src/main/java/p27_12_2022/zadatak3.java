package p27_12_2022;

public class zadatak3 {
    public static void main(String[] args) {
        Auto jedan = new Auto();
        jedan.imeIPrezime = "Ivan Stojkovic";
        jedan.markaAutomobila = "Pezo";
        jedan.brojVrata = 5;
        jedan.potrosnjaNa100Km = 7;
        jedan.trenutnaBrzina = 85;
        jedan.godinaProzivodnje = 2001;
        jedan.mesecRegistracije = 7;
        jedan.kubikaza = 1200;
        jedan.stampaj();
        boolean prekoracenje = jedan.prekoracenje(80);
        System.out.println(prekoracenje);
        int iznosKazne = jedan.kazna(80);
        System.out.println("Kazna iznosi: "+iznosKazne);
        boolean oldtimer = jedan.jeOldtimer();
        boolean registracije = jedan.jeRegistrovan(12);
        double cenaRegistracije = jedan.cenaRegistracije();
        System.out.println(oldtimer+" "+registracije+" "+cenaRegistracije);
    }
}
