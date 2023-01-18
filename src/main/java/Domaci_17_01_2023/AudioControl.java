package Domaci_17_01_2023;

public class AudioControl extends Control {
    private boolean tip;

    public AudioControl(boolean tip) {
        this.tip = tip;
    }

    public boolean isTip() {
        return tip;
    }

    public void setTip(boolean tip) {
        this.tip = tip;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer a) {
        if(tip==true){
            a.setJacinaZvuka(a.getJacinaZvuka()+1);
        }
        else {
            a.setJacinaZvuka(a.getJacinaZvuka()-1);
        }
        if (a.getJacinaZvuka()>100){
            a.setJacinaZvuka(100);
        } else if (a.getJacinaZvuka()<0) {
            a.setJacinaZvuka(0);
        }
    }
}
