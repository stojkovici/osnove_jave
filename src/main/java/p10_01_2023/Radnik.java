package p10_01_2023;

public class Radnik {
    private String jmbg;
    private String imeIPrezime;
    private int brojDece;
    private int stepenStrucneSpreme;
    private int godineRadnogStaza;

    public Radnik(String jmbg){
        this.jmbg = jmbg;
    }
    public Radnik(String jmbg,String imeIPrezime, int brojDece, int stepenStrucneSpreme, int godineRadnogStaza){
        this.jmbg = jmbg;
        this.imeIPrezime = imeIPrezime;
        this.brojDece = brojDece;
        this.stepenStrucneSpreme = stepenStrucneSpreme;
        this.godineRadnogStaza = godineRadnogStaza;
        System.out.println(jmbg+" "+imeIPrezime+" "+brojDece+" "+stepenStrucneSpreme+" "+godineRadnogStaza);
    }

    public String getJmbg() {
        return jmbg;
    }



    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getBrojDece() {
        return brojDece;
    }

    public void setBrojDece(int brojDece) {
        this.brojDece = brojDece;
    }

    public int getStepenStrucneSpreme() {
        return stepenStrucneSpreme;
    }

    public void setStepenStrucneSpreme(int stepenStrucneSpreme) {
        this.stepenStrucneSpreme = stepenStrucneSpreme;
    }

    public int getGodineRadnogStaza() {
        return godineRadnogStaza;
    }

    public void setGodineRadnogStaza(int godineRadnogStaza) {
        this.godineRadnogStaza = godineRadnogStaza;
    }

    public double minuliRad(){
        double rad = 0;
        if(godineRadnogStaza<10){
           rad=0.05;
           return rad;
        }
        else if (godineRadnogStaza>=10&&godineRadnogStaza<20){
            rad = 0.075;
            return rad;
        }
        else{
            rad = 0.1;
        }
        return rad;
    }
    public double koeficijent(){
        double koeficijent = this.stepenStrucneSpreme*this.brojDece;
        return koeficijent;
    }
    public double plataRadnika(){
        double plata = 25000+(this.koeficijent()+this.minuliRad())*10000;
        return plata;
    }
    public boolean daLiJeKreditnoSposoban(){
        if (this.plataRadnika()>50000){
            return true;
        }
        return false;
    }
}
