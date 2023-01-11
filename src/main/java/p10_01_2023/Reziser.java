package p10_01_2023;

public class Reziser {
    private String imeIPrezime;
    private int starost;

    public Reziser(String imeIPrezime, int starost){
        this.starost = starost;
        this.imeIPrezime = imeIPrezime;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getStarost() {
        return starost;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }
    public void print(){
        System.out.println("Ime i prezime rezisera: "+this.imeIPrezime+" Starost rezisera: "+this.starost+"god.");
    }
}
