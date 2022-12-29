package p27_12_2022;

import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
        //Racun racun1 = new Racun();
        //racun1.brojRacuna = "1022-4458-8858-4451";
        //racun1.imeIPrezime = "Ivan Stojkovic";
        //racun1.stanjeNaRacunu = 35000;
        //System.out.println(racun1.brojRacuna+" "+racun1.imeIPrezime+" "+racun1.stanjeNaRacunu);

        //Racun racun2 = new Racun();
        //racun2.brojRacuna = "2554-4415-8854-1125";
        //racun2.imeIPrezime = "Milan Milanovic";
        //racun2.stanjeNaRacunu = 447555;
       // System.out.println(racun2.brojRacuna+" "+racun2.imeIPrezime+" "+racun2.stanjeNaRacunu);
        Scanner s = new Scanner(System.in);
        Racun racun1 = new Racun();
        racun1.imeIPrezime = "Ivan Stojkovic";
        racun1.brojRacuna = "1147-1125-1114-8859";
        racun1.stanje = 1000;

        Racun racun2 = new Racun();
        racun2.imeIPrezime = "Milan Milanovic";
        racun2.brojRacuna = "4458-8878-9665-1547";
        racun2.stanje = 2400;
        System.out.println("Posiljalac: "+ racun1.imeIPrezime+", "+racun1.brojRacuna+", stanje: "+racun1.stanje);
        System.out.println("Primalac: "+racun2.imeIPrezime+","+racun2.brojRacuna+", stanje: "+racun2.stanje);
        System.out.println("Unesite sumu za transkaciju: ");
        int suma = s.nextInt();
        racun1.stanje = racun1.stanje - suma;
        racun2.stanje = racun2.stanje + suma;
        System.out.println("Posiljalac: "+ racun1.imeIPrezime+", "+racun1.brojRacuna+", stanje: "+racun1.stanje);
        System.out.println("Primalac: "+racun2.imeIPrezime+", "+racun2.brojRacuna+", stanje: "+racun2.stanje);

    }
}
