package Domaci_27_12_2022;

public class Proizvod {
    public String naziv;
    public double cena;
    public double tezinaUGramima;

    public void stampaj(){
        System.out.println(this.naziv+", "+this.cena+", "+this.tezinaUGramima);
    }
    public double konvertuj(String jedinica){
        if(jedinica.equals("kg")){
            double tezinaUKg = this.tezinaUGramima/1000;
            return tezinaUKg;
        }
        else if (jedinica.equals("t")) {
            double tezinaUT = this.tezinaUGramima/100000;
            return tezinaUT;
        }
        else {
            return this.tezinaUGramima;
        }

    }
}
