package Domaci_27_12_2022;

public class SmartAirConditioning {
    public String marka;
    public double temperatura;
    public String mod;

    public void stampa(){
        System.out.println(this.marka+" "+this.temperatura+" "+this.mod);
    }
    public boolean temperatura(double napolju){
        if(this.temperatura<napolju){
            return true;
        }
        else {
            return false;
        }
    }
}
