package za_vezbanje;

public class Gledanje {
    public static void main(String[] args) {
        Video v = new Video("kkAlb5bDnTg",260,25000,124,677000);
        YoutubePlayer y = new YoutubePlayer(144,"Mini player",75,120);
        y.setVideo(v);
        y.ucitajVideo();
        y.postaviKvalitet(6);
        y.premotajUnapred();
        y.premotajUnapred();
        y.premotajUnapred();
        y.premotajUnapred();
        y.premotajUnapred();
        y.premotajUnapred();
        y.premotajUnapred();
        y.premotajUnapred();
        y.premotajUnapred();
        y.premotajUnapred();
        y.premotajUnapred();
        y.premotajUnazad();
        y.premotajUnazad();
        y.pojacaj();
        y.pojacaj();
        y.smanji();
        v.lajkuj();
        v.lajkuj();
        v.dislajkuj();
        y.aktivirajPrekoCelogEkrana();
        y.iscitaj();
        y.share();


    }
}
