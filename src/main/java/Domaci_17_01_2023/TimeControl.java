package Domaci_17_01_2023;

public class TimeControl extends Control {
    private boolean strana;

    public TimeControl(boolean strana) {
        this.strana = strana;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer a) {
        if(strana==true) {
            a.setTrenutnoVreme(a.getTrenutnoVreme() + 15);
        }
        else {
            a.setTrenutnoVreme(a.getTrenutnoVreme()-15);
        }
        if (a.getTrenutnoVreme()>a.getDuzinaVidea()){
            a.setTrenutnoVreme(a.getDuzinaVidea());
        }
        else if(a.getTrenutnoVreme()<0){
            a.setTrenutnoVreme(0);
        }
    }

    public boolean isStrana() {
        return strana;
    }

    public void setStrana(boolean strana) {
        this.strana = strana;
    }
}
