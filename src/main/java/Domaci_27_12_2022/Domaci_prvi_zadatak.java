package Domaci_27_12_2022;

public class Domaci_prvi_zadatak {
    public static void main(String[] args) {
        Proizvod proizvod1 = new Proizvod();
        proizvod1.naziv = "Cips";
        proizvod1.cena = 185;
        proizvod1.tezinaUGramima = 250;
        proizvod1.stampaj();
        proizvod1.konvertuj("kg");
        double tezinaUKg = proizvod1.konvertuj("kg");
        double tezinaUT = proizvod1.konvertuj("t");
        System.out.println("Tezina u kg je: "+tezinaUKg+"kg");
        System.out.println("Tezina u tonama je: "+tezinaUT+"t");
        System.out.println();

        Proizvod proizvod2 = new Proizvod();
        proizvod2.naziv = "Pesak";
        proizvod2.cena = 1000;
        proizvod2.tezinaUGramima = 5000;
        proizvod2.stampaj();
        double tezinaUKg2 = proizvod2.konvertuj("kg");
        double tezinaUT2 = proizvod2.konvertuj("t");
        System.out.println("Tezina u kg je: "+tezinaUKg2+"kg");
        System.out.println("Tezina u tonama je: "+tezinaUT2+"t");
    }
}
// Napisati klasu Proizvod koja ima atribute
//naziv proizvoda (String)
//cenu proizvoda (double)
//težinu proizvoda u gramima. (double)
//	i metode:
//stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar prima jedinicu u koju zelimo da konvertujemo, a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
//Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012