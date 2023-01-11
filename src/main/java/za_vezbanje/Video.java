package za_vezbanje;

public class Video {
    private String id;
    private int duzinaUSekundama;
    private int brojLajkova;
    private int brojDislajkova;
    private int brojPregleda;

    public Video(String id,int duzinaUSekundama,int brojLajkova,int brojDislajkova, int brojPregleda){
        this.id=id;
        this.duzinaUSekundama=duzinaUSekundama;
        this.brojLajkova = brojLajkova;
        this.brojDislajkova = brojDislajkova;
        this.brojPregleda = brojPregleda;
    }

    public int lajkuj(){
        this.brojLajkova = this.brojLajkova+1;
        return this.brojLajkova;
    }
    public int dislajkuj(){
        this.brojDislajkova = this.brojDislajkova+1;
        return this.brojDislajkova;
    }
    public int pogledaj(){
        this.brojPregleda = this.brojPregleda+1;
        return this.brojPregleda;
    }

    public String getId() {
        return id;
    }

    public int getDuzinaUSekundama() {
        return duzinaUSekundama;
    }

    public int getBrojLajkova() {
        return brojLajkova;
    }

    public int getBrojDislajkova() {
        return brojDislajkova;
    }

    public int getBrojPregleda() {
        return brojPregleda;
    }

}
