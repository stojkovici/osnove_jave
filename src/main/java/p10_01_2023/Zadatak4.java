package p10_01_2023;

public class Zadatak4 {
    public static void main(String[] args) {
        Korisnik ivan = new Korisnik("Ivan","Stojkovic");
        FacebookPost post = new FacebookPost();
        post.setKorisnik(ivan);
        post.setPost("Milane i Vlado, nemoj da me izbacite jer sam se javio.");
        post.print();

    }
}
