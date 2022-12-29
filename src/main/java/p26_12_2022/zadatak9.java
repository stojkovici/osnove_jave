package p26_12_2022;

import java.util.Scanner;

public class zadatak9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite rimski broj");
        String rimskiBroj = s.next();
        int ss = rimski(rimskiBroj);
        System.out.println(ss);

    }
    public static int rimski(String n){
        if(n.equals("I")){
            return 1;
        }
        else if(n.equals("II")){
            return 2;
        }
        else if(n.equals("III")){
            return 3;
        }
        else if(n.equals("IV")){
            return 4;
        }
        else if(n.equals("V")){
            return 5;
        }
        else {
            return 0;
        }

    }
}
