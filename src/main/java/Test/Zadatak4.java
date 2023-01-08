package Test;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite lozinku: ");
        String lozinka = s.next();
        String potvrda ="  ";
        int brojac = 0;
        while (!lozinka.equals(potvrda)&&brojac<4){
            System.out.println("Potvrdite lozinku: ");
            potvrda = s.next();
            if(lozinka.equals(potvrda)){
                System.out.println("Lozinka je uspesno postavljena");
            } else if (!(lozinka.equals(potvrda))) {
                System.out.println("Lozinke se ne poklapaju");
                brojac = brojac+1;
            }
            if(brojac>3){
                System.out.println("Mogucnost postavljanja lozinke je blokirana");
            }

        }
    }
}
