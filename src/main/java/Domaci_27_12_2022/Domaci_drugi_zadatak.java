package Domaci_27_12_2022;

public class Domaci_drugi_zadatak {
    public static void main(String[] args) {
        SmartAirConditioning klima = new SmartAirConditioning();
        klima.marka = "Samsung";
        klima.temperatura = 24;
        klima.mod = "greje";
        klima.stampa();
        boolean daLiJeTemperaturaNapoljuVeca = klima.temperatura(7);
        System.out.println(daLiJeTemperaturaNapoljuVeca);
        System.out.println();
        SmartAirConditioning klima1 = new SmartAirConditioning();
        klima1.marka = "Galanz";
        klima1.temperatura = 17;
        klima1.mod = "hladi";
        klima1.stampa();
        boolean daLiJeTemperaturaNapoljuVeca1 = klima1.temperatura(24);
        System.out.println(daLiJeTemperaturaNapoljuVeca1);

    }
}
// Kreirati klasu SmartAirConditioning koja ima:
//atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//atribut za izabranu temperaturu
//atribut za mod (hladi/greje) - string
//metodu za stampu (proizvoljno)
//metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena. Metoda kao parametar prima temperaturu koja je napolju.