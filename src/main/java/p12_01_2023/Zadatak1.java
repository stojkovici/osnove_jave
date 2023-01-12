package p12_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Korisnik host = new Korisnik("Ivan Stojkovic");
        Korisnik guest = new Korisnik("Pera Peric");
        ZoomCall zoom = new ZoomCall("dhsahshaqwue12","12345678",host);
        zoom.setGuest(guest);
        host.pretplatiSe(150);
        zoom.stampaj();

    }
}
