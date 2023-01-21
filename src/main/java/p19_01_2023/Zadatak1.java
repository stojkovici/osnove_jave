package p19_01_2023;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {
        Trougao q = new Trougao(7);
        Trougao w = new Trougao(5);
        Pravougaonik a = new Pravougaonik(4, 6);
        Pravougaonik s = new Pravougaonik(3, 8);
        Pravougaonik d = new Pravougaonik(2, 7);
        ArrayList<Figura> nizFigura = new ArrayList<>();
        nizFigura.add(q);
        nizFigura.add(w);
        nizFigura.add(a);
        nizFigura.add(s);
        nizFigura.add(d);
        double povrsine = 0;
        double obim = 0;
        for (int i = 0; i < nizFigura.size(); i++) {
            povrsine = povrsine + nizFigura.get(i).povrsina();
            obim = obim + nizFigura.get(i).obim();
        }
        for (int i = 0; i < nizFigura.size(); i++) {
            System.out.println(nizFigura.get(i).povrsina());
            System.out.println(nizFigura.get(i).obim());
        }
        System.out.println("Skup svih povrsina je: "+povrsine);
        System.out.println("Skup svih obima je: "+obim);
    }
}
