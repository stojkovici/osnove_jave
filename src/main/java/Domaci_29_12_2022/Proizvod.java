package Domaci_29_12_2022;

public class Proizvod {
    public String naziv;
    public double cena;
    public double tezinaUG;

    public void stampaj(){
        System.out.println(this.naziv+", "+this.cena+"din, "+this.tezinaUG+"g");
    }
    public double povecajCenu(double povecanje){
        this.cena= this.cena+povecanje;
        return this.cena;
    }
    public double vratiCenuSaPopustom(double popust){
        double cenaSaPopustom=this.cena*popust/100;
        return cenaSaPopustom;

    }
    public int racunajPostarinu(){
        if(this.tezinaUG<=100){
            int postarina100 = 200;
            return postarina100;
        } else if (this.tezinaUG>100&&this.tezinaUG<=500) {
            int postarina101= 400;
            return postarina101;
        }
        else {
            int postarina500 = 1000;
            return postarina500;
        }
    }
}
