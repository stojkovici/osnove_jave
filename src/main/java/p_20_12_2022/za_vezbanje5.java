package p_20_12_2022;

import java.util.Scanner;

public class za_vezbanje5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int pojacaj=10;
        int smanji=10;
        int jacina = 75;
        String play = "";
        while (!play.contains("play")){
            jacina=jacina;
            System.out.println("Unesite akciju: ");
            String akcija= s.next();
            if (akcija.equals("pojacaj")){
                jacina=jacina+pojacaj;
            }
            if(akcija.equals("smanji")){
                jacina=jacina-smanji;
            }
            if (akcija.equals("play")){
                play="play";
            }
            if (jacina>100){
                jacina=100;
            }
            if (jacina<0){
                jacina=0;
            }


        }
        System.out.println(jacina);
    }
}
