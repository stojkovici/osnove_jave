package Domaci_12_01_2023;

public class Domaci_drugi_zadatak {
    public static void main(String[] args) {
        Racun posiljalac = new Racun("1114-8885-7741-8954","Ivan Stojkovic",35888);
        Racun primalac = new Racun("4458-4115-5558-9954","Pera Peric",12441);
        Transakcija t = new Transakcija(415587,posiljalac,primalac);
        posiljalac.stampaj();
        primalac.stampaj();
        t.transakicija(14000);
        t.stampaj();
    }
}
