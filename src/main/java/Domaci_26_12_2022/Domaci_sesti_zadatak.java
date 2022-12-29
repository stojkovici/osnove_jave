package Domaci_26_12_2022;

import java.util.Scanner;

public class Domaci_sesti_zadatak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost u eurima");
        int euro = s.nextInt();
        System.out.println("Unesite valutu za konverziju");
        String valutaE = s.next();
        if (valutaE.equals("RSD")){
            System.out.println(euro+" EUR je "+rsd(euro,"RSD")+" RSD");
        } else if (valutaE.equals("USD")){
            System.out.println(euro+" EUR je "+usd(euro,"USD")+"USD");
        }
        else if (valutaE.equals("RUB")){
            System.out.println(euro+" EUR je "+rub(euro,"RUB")+"RUB");
        }
    }
    public static double rsd (int euro,String valuta){
        double dinar = 117.5;
        double konverzija= euro*dinar;
        return konverzija;
    }
    public static double usd (int euro,String valuta){
        double dolar = 1.1;
        double konverzijaUsd = euro*dolar;
        return konverzijaUsd;
    }
    public static double rub (int euro,String valuta){
        double rublja = 62.98;
        double konverzijaRub= euro*rublja;
        return konverzijaRub;
    }
}
