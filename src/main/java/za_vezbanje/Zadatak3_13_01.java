package za_vezbanje;

public class Zadatak3_13_01 {
    public static void main(String[] args) {
        HistoryPage hp = new HistoryPage("Facebook","www.facebook.com",19,48);
        HistoryPage uu = new HistoryPage("Youtube","www.youtube.com",14,45);
        HistoryPage pp = new HistoryPage("LinkedIn","www.linkedin.com",22,14);
        History h = new History();
        h.dodaj(hp);
        h.dodaj(uu);
        h.dodaj(pp);
        h.pogledajIstoriju();
        h.obrisiIstoriju();
        h.pogledajIstoriju();
    }
}
