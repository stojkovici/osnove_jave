package Domaci_17_01_2023;

public class VideoPlayer {
    private int duzinaVidea;
    private int trenutnoVreme;
    private int jacinaZvuka;
    private int kvalitetVidea;

    public int getDuzinaVidea() {
        return duzinaVidea;
    }

    public void setDuzinaVidea(int duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }

    public int getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public void setTrenutnoVreme(int trenutnoVreme) {
        this.trenutnoVreme = trenutnoVreme;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public int getKvalitetVidea() {
        return kvalitetVidea;
    }

    public void setKvalitetVidea(int kvalitetVidea) {
        this.kvalitetVidea = kvalitetVidea;
    }

    public VideoPlayer(int duzinaVidea, int trenutnoVreme, int jacinaZvuka) {
        this.duzinaVidea = duzinaVidea;
        this.trenutnoVreme = trenutnoVreme;
        this.jacinaZvuka = jacinaZvuka;
    }
    public void stampaj(){
        System.out.println("Trenutno vreme: "+this.trenutnoVreme+"/"+this.duzinaVidea+" sekundi");
        System.out.println("Jacina zvuka: "+this.jacinaZvuka+"/100");
        System.out.println("Kvalitet videa: "+this.kvalitetVidea+"p");
    }

}
