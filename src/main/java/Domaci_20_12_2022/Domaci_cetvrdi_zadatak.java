package Domaci_20_12_2022;

import java.util.Scanner;

public class Domaci_cetvrdi_zadatak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String jednako = " ";
        String otvorena = " ";
        String zatvorena = " ";
        int otvorenaZ = 0;
        int zatvorenaZ = 0;
        while(!(jednako.contains("="))){
            System.out.println("Unos");
            String unos = s.next();
            if (unos.contains("(")){
                otvorena=otvorena+1;
            }else if (unos.contains(")")){
                zatvorena=zatvorena+1;
            }
            else if (unos.contains("=")){
                jednako = "=";
            }
            otvorenaZ = otvorena.length();
            zatvorenaZ = zatvorena.length();

            }
            if (otvorenaZ>zatvorenaZ||otvorenaZ<zatvorenaZ){
                System.out.println("Zagrade nisu uparene");
            }
            else {
                System.out.println("Zagrade su uparene");
            }
        }

}
// Napisati program koji proverava uparenost zagrada. Korisnik unosi matematicku formulu sve dok ne unese znak =. Korisnik unosi svaki karakter jednacine posebno i na kraju programa se ispisuje da li su sve zagrade uparene.
