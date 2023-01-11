package p10_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        Radnik ivan = new Radnik("0107225998","Ivan Stojkovic", 2, 5,3);
        System.out.println(ivan.minuliRad()+" "+ivan.plataRadnika()+" "+ivan.daLiJeKreditnoSposoban());
    }
}
