package Projekat_Xo;

import java.util.ArrayList;
import java.util.Scanner;

public class Igra {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Xo_Tabla xo = new Xo_Tabla();
        System.out.println("Unesite ime X igraca");
        xo.setImeXIgraca(s.next());
        System.out.println("Unesite ime O igraca");
        xo.setImeOIgraca(s.next());
        ArrayList<String> tabela = xo.tabela;
        xo.pokreniIgru();
        while (!(xo.pobednikXX() == true || xo.pobednikOO() == true || xo.popunjenaTabela() == true)) {
            System.out.println("Igrac X: " + xo.getImeXIgraca());
            System.out.println("Igrac O: " + xo.getImeOIgraca());
            System.out.println("Na potezu igrac " + xo.getNaPotezu());
            System.out.print("Odigraj potez: ");
            int broj = s.nextInt();
            if (xo.poljePrazno(broj) == false) {
                xo.zameniIgraca();
            }
            xo.odigrajPotez(broj);
            xo.stampaj();
            xo.zameniIgraca();
            xo.nereseno();
            xo.zaPobednikaO();
            xo.zaPobednikaX();

        }

    }
}