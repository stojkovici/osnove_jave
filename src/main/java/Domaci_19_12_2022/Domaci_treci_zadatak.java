package Domaci_19_12_2022;

import java.util.Scanner;

public class Domaci_treci_zadatak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite n");
        int n = s.nextInt();
        int agresivnost = 0;
        int procenat = (100/n);
        for (int i = 0; i < n; i++) {
            System.out.println("Unesite tekst");
            String rec = s.next();
            if (rec.contains("!")){
                System.out.println(rec);
                agresivnost=agresivnost+procenat;
            }else if (!rec.contains("!")){
                System.out.println(rec+"!");
            }


        }
        System.out.println("Nivo agresivnosti je: "+agresivnost+".");
    }
}
// Napisati program koji simulira ponasanje speak loud programa. Korisnik unosi N reci a program ispisuje svaku rec na ekranu tako da zadovolji uslov:
//ako se u unetom tekstu sadrzi ! onda ga ispise tako kako je unet
//ako se ne sadrzi, program dostampa na kraju
//	Nakon toga program ispisuje nivo agresivnosti u komunikaciji (u procentima). Svaka uneta rec sa ! utice na agresivnost.