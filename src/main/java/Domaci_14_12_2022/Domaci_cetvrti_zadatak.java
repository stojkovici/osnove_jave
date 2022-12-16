package Domaci_14_12_2022;
import java.util.Scanner;
public class Domaci_cetvrti_zadatak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost x ");
        int x = s.nextInt();
        int y = 0;
        if (x<2){
            System.out.println("y je " + (y+x));
        }
        else if (x>=2 && x<10) {
            System.out.println("y je " + (y+2));
        }
        else {
            System.out.println("y je " + (y=x-1));
        }
    }
}
