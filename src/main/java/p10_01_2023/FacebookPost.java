package p10_01_2023;

public class FacebookPost {
    private String post;
    private Korisnik korisnik;

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }
    public void print(){
        System.out.println(this.korisnik.getIme()+" "+this.korisnik.getPrezime());
        System.out.println(post);
    }
}
