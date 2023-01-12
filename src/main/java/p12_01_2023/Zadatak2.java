package p12_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        FizickoLice k = new FizickoLice("Ivan Stojkovic",1125544,"010799855477",true);
        FizickoLice p = new FizickoLice("Pera Peric",1215454,"010548766554");
        Ugovor u = new Ugovor("12.01.2023",p,k,24500,"Moravska");
        u.stampaj();

    }
}
