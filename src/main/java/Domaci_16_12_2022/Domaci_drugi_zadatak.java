package Domaci_16_12_2022;

public class Domaci_drugi_zadatak {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;
        int d = 20;
        for (int i = 1; i <= 25; i++) {
            if (i == a || i == b || i == c || i == d) {
                System.out.println("_ ");
            } else {
                System.out.print("_ ");
            }
        }
    }
}