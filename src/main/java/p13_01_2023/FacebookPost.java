package p13_01_2023;

import java.util.ArrayList;

public class FacebookPost {
    private String imeIPrezime;
    private String tekst;
    private ArrayList<Reakcija> reakcija;

    public FacebookPost(String imeIPrezime, String tekst) {
        this.imeIPrezime = imeIPrezime;
        this.tekst = tekst;
        this.reakcija = new ArrayList<>();
    }

    public void dodaj(Reakcija s){
        reakcija.add(s);
    }
    private int brojReakcija(String r){
        int counter = 0;
        for (int i = 0; i < reakcija.size(); i++) {
            if(reakcija.get(i).getTip().equals(r)){
                counter = counter+1;
            }
        }
        return counter;
    }
    public void stampaj(){
        System.out.println(this.imeIPrezime);
        System.out.println(this.tekst);
        System.out.println("Smajli "+this.brojReakcija("Smajli")+" | Like "+this.brojReakcija("Like")+" | Srce "+this.brojReakcija("Srce"));
    }
}
