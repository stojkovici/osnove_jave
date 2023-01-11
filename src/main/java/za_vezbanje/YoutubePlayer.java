package za_vezbanje;

public class YoutubePlayer {
    private Video video;
    private int kvalitetVidea;
    private String rezim;
    private int jacinaZvuka;
    private int trenutnoVreme;

    public Video getVideo() {
        return video;
    }

    public int getKvalitetVidea() {
        return kvalitetVidea;
    }

    public String getRezim() {
        return rezim;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public int getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public YoutubePlayer(int kvalitetVidea, String rezim, int jacinaZvuka, int trenutnoVreme){
        this.jacinaZvuka=75;
        this.kvalitetVidea = 144;
        this.rezim = "Mini player";
        this.trenutnoVreme=trenutnoVreme;
    }
    public void ucitajVideo(){
        this.trenutnoVreme = 0;
        video.pogledaj();
    }
    public int pojacaj(){
        this.jacinaZvuka=this.jacinaZvuka+10;
        if(this.jacinaZvuka>100){
            this.jacinaZvuka = 100;
        }
        return this.jacinaZvuka;
    }
    public int smanji(){
        this.jacinaZvuka=this.jacinaZvuka-10;
        if (this.jacinaZvuka<0){
            this.jacinaZvuka = 0;
            return this.jacinaZvuka;
        }
        return this.jacinaZvuka;
    }
    public int postaviKvalitet(int brzina){
        if (brzina<2){
            this.kvalitetVidea = 144;
            return this.kvalitetVidea;
        } else if (brzina<=4){
            this.kvalitetVidea = 240;
            return this.kvalitetVidea;
        } else if (brzina<6){
            this.kvalitetVidea = 360;
            return this.kvalitetVidea;
        } else if (brzina<8){
            this.kvalitetVidea = 720;
            return this.kvalitetVidea;
        }
        else {
            this.kvalitetVidea= 1080;
            return this.kvalitetVidea;
        }

    }
    public String aktivirajMiniPlayerMod(){
        this.rezim = "Mini player";
        return this.rezim;
    }
    public String aktivirajBioskopMod(){
        this.rezim = "Bioskopski rezim";
        return this.rezim;
    }
    public String aktivirajPrekoCelogEkrana(){
        this.rezim = "Preko celog ekrana";
        return this.rezim;
    }
    public int premotajUnapred(){
        this.trenutnoVreme=this.trenutnoVreme+10;
        if (this.trenutnoVreme>video.getDuzinaUSekundama()){
            this.trenutnoVreme = video.getDuzinaUSekundama();
            return this.trenutnoVreme;
        }
        return this.trenutnoVreme;
    }
    public int premotajUnazad(){
        this.trenutnoVreme=trenutnoVreme-10;
        if (this.trenutnoVreme<0){
            this.trenutnoVreme = 0;
            return this.trenutnoVreme;
        }
        return this.trenutnoVreme;
    }
    public void iscrtajZvuk(){
        for (int i = 0; i <this.jacinaZvuka/10 ; i++) {
            System.out.print("|");
        }
        if (getJacinaZvuka()==0){
            System.out.print("</");
        }
    }
    public void iscrtajRezim(){
        if (this.rezim.equals("Mini player")){
            System.out.println("[]");
        } else if (this.rezim.equals("Bioskopski rezim")){
            System.out.println("[ ..]");
        }
        else {
            System.out.println("[||||]");
        }
    }
    public void iscrtajTrenutnoVreme(){
        int minut =getTrenutnoVreme()/60;
        double sekund = getTrenutnoVreme()%60;
        int minutUkupno = video.getDuzinaUSekundama()/60;
        double sekundUkupno = video.getDuzinaUSekundama()%60;
        System.out.print(minut+":"+sekund+"/"+minutUkupno+":"+sekundUkupno);
    }
    public void iscrtajTimeline(){
        int zvezdice = this.trenutnoVreme*100/video.getDuzinaUSekundama();
        for (int i = 0; i < 100 ; i++) {
            if (zvezdice>i){
                System.out.print("*");
            }
            else {
                System.out.print(".");
            }
        }
    }
    public void iscitaj(){
        this.iscrtajTrenutnoVreme();
        System.out.print(" Zvuk <: ");
        this.iscrtajZvuk();
        System.out.println();
        System.out.print("Timeline: ");
        this.iscrtajTimeline();
        System.out.println();
        System.out.println("Kvalitet: "+this.kvalitetVidea);
        System.out.print("Rezim: ");
        this.iscrtajRezim();
        System.out.println("WESTSIDE BOOGIE & Shelley fka DRAM - AIGHT [Extended Official Music Video]");
        System.out.println("Likes "+video.getBrojLajkova()+" | Dislikes "+video.getBrojDislajkova());
        System.out.println(video.getBrojPregleda()+" Pregleda");
    }
    public void share(){
        System.out.println("https://youtu.be/"+video.getId());
    }



}
