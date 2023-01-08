package Test;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite ime prve osobe: ");
        String imePrveOsobe = s.next();
        System.out.println("Unesite godinu rodjenja prve osobe: ");
        int godinaRodjenjaPrveOsobe = s.nextInt();
        System.out.println("Unesite mesec rodjenja prve osobe: ");
        int mesecPrveOsobe = s.nextInt();
        System.out.println("Unesite datum rodjenja prve osobe: ");
        int danPrveOsobe = s.nextInt();
        System.out.println("Unesite ime druge osobe: ");
        String imeDrugeOsobe = s.next();
        System.out.println("Unesite godinu rodjenja druge osobe: ");
        int godinaRodjenjaDrugeOsobe = s.nextInt();
        System.out.println("Unesite mesec rodjenja druge osobe: ");
        int mesecDrugeOsobe = s.nextInt();
        System.out.println("Unesite dan rodjenja druge osobe: ");
        int danDrugeOsobe = s.nextInt();

        if(godinaRodjenjaPrveOsobe<godinaRodjenjaDrugeOsobe){
            System.out.println(imePrveOsobe+" je stariji.");
        }
        else if(godinaRodjenjaPrveOsobe>godinaRodjenjaDrugeOsobe){
            System.out.println(imeDrugeOsobe+" je stariji.");
        }
        else if(godinaRodjenjaPrveOsobe==godinaRodjenjaDrugeOsobe){
            if(mesecPrveOsobe<mesecDrugeOsobe){
                System.out.println(imePrveOsobe+" je stariji.");
            }else if(mesecPrveOsobe>mesecDrugeOsobe){
                System.out.println(imeDrugeOsobe+" je stariji.");
            }
            else if(mesecPrveOsobe==mesecDrugeOsobe){
                if(danPrveOsobe<danDrugeOsobe){
                    System.out.println(imePrveOsobe+" je stariji.");
                }
                else if(danPrveOsobe>danDrugeOsobe){
                    System.out.println(imeDrugeOsobe+" je stariji.");
                }
                else if(danPrveOsobe==danDrugeOsobe){
                    System.out.println("Iste su starosti.");
                }
            }
        }
    }
}
