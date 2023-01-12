package p12_01_2023;

public class ZoomCall {
    private String link;
    private String password;
    private Korisnik host;
    private Korisnik guest;

    public String getLink() {
        return link;
    }

    public String getPassword() {
        return password;
    }

    public Korisnik getHost() {
        return host;
    }

    public Korisnik getGuest() {
        return guest;
    }

    public void setGuest(Korisnik guest) {
        this.guest = guest;
    }

    public ZoomCall(String link, String password, Korisnik host) {
        this.link = link;
        this.password = password;
        this.host = host;
    }

    public void stampaj(){
        System.out.println("Zoom call: "+this.link);
        System.out.println("Password: "+this.password);
        System.out.println("Host: "+this.host.getImeIPrezime());
        System.out.println("Guest: "+this.guest.getImeIPrezime());
        System.out.println("Maksimalno trajanje poziva je "+this.host.maksimalnaDuzina()+"min");
    }
}
