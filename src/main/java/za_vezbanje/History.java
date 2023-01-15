package za_vezbanje;

import java.util.ArrayList;

public class History {
    ArrayList<HistoryPage> st;

    public History() {
        this.st = new ArrayList<>();
    }

    public void dodaj(HistoryPage rr){
        this.st.add(rr);
    }
    public void brisiLink(HistoryPage tt){
        for (int i = 0; i <st.size() ; i++) {
            if (st.get(i).getLink().equals(tt)){
                st.remove(i);
            }
        }
    }
    public void obrisiIstoriju(){
        for (int i = 0; i <st.size() ; i++) {
            st.remove(i);
        }
    }
    public void sacuvajKredencijal(String naziv,String username,String passwor){
        for (int i = 0; i <st.size() ; i++) {
            st.get(i).setNaziv(naziv);
            st.get(i).sacuvaj(username,passwor);
        }

    }
    public void brisiKredencijal(){
        for (int i = 0; i <st.size() ; i++) {
            this.st.get(i).brisi();
        }
    }
    public void pogledajIstoriju(){
        for (int i = 0; i < st.size(); i++) {
            System.out.println(this.st.get(i).getNaziv()+" "+this.st.get(i).getLink()+" at: "+this.st.get(i).getSat()+":"+this.st.get(i).getMin());
        }
    }
    public void obrisiSveKolaciceUPoslednjiSatVremena(int sat,int min){
        int noviSat =sat-1;
        int noviMin = min;
        for (int i = 0; i <st.size() ; i++) {
            while(noviSat>sat){
                this.st.remove(i);
            }
        }
    }
}
