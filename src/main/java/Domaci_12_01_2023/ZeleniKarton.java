package Domaci_12_01_2023;

public class ZeleniKarton {
    private String imeIPrezimeStudenta;
    private int brojIndexa;
    private String nazivPredmeta;
    private String imeIPrezimeProfesora;
    private int ocena;

    public ZeleniKarton(String imeIPrezimeStudenta, int brojIndexa, String imeIPrezimeProfesora) {
        this.imeIPrezimeStudenta = imeIPrezimeStudenta;
        this.brojIndexa = brojIndexa;
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
    }

    public String getImeIPrezimeStudenta() {
        return imeIPrezimeStudenta;
    }

    public void setImeIPrezimeStudenta(String imeIPrezimeStudenta) {
        this.imeIPrezimeStudenta = imeIPrezimeStudenta;
    }

    public int getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(int brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getImeIPrezimeProfesora() {
        return imeIPrezimeProfesora;
    }

    public void setImeIPrezimeProfesora(String imeIPrezimeProfesora) {
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
    public boolean polozenIspit(){
        if (this.ocena>5){
            return true;
        }
        else {
            return false;
        }
    }
    public void stampaj(){
        System.out.println(this.nazivPredmeta+" - "+this.ocena);
        System.out.println("Student: "+this.imeIPrezimeStudenta+", "+this.brojIndexa);
        System.out.println("Profesor: "+this.imeIPrezimeProfesora);
    }

}
