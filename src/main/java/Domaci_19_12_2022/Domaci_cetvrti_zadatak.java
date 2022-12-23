package Domaci_19_12_2022;

import java.util.Scanner;

public class Domaci_cetvrti_zadatak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite n");
        int n = s.nextInt();
        int smile = 0;
        int like = 0;
        int heart = 0;
        for (int i = 0; i < n ; i++) {
            System.out.println("Reaguj: ");
            String reakcija = s.next();
            if (reakcija.contains("smile")){
                smile = smile +1;
            }
            else if (reakcija.contains("like")){
                like = like +1;
            }
            else if (reakcija.contains("heart")){
                heart = heart +1;
            }


        }
        System.out.println("Summary: "+ "smile "+ smile+" | "+"like "+like+" | "+ "heart "+ heart);
    }
}
//Napisati program koji vodi evidenciju koliko je uneto sledecih reakcija. Korisnik unosi N rekacija zatim se prikazuje evidencija:
//Program podrzava sledece reakcije:
//like
//smile
//heart