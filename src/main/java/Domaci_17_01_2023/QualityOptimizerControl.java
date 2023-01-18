package Domaci_17_01_2023;

public class QualityOptimizerControl extends Control {
    private double brzinaInterneta;

    public double getBrzinaInterneta() {
        return brzinaInterneta;
    }

    public void setBrzinaInterneta(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    public QualityOptimizerControl(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer a) {
        if (this.brzinaInterneta*10.1<144){
            a.setKvalitetVidea(144);
        } else if (this.brzinaInterneta*10.1<240) {
            a.setKvalitetVidea(240);
        } else if (this.brzinaInterneta*10.1<360) {
            a.setKvalitetVidea(360);
        } else if (this.brzinaInterneta*10.1<480) {
            a.setKvalitetVidea(480);
        } else if (this.brzinaInterneta*10.1<720) {
            a.setKvalitetVidea(720);
        } else if (this.brzinaInterneta*10.1<1080) {
            a.setKvalitetVidea(1080);
        }
    }
}
