package Domaci_17_01_2023;

public class Domaci_prvi_zadatak {
    public static void main(String[] args) {
        VideoPlayer vp = new VideoPlayer(240,64,58);
        TimeControl tc = new TimeControl(true);
        TimeControl tc1 = new TimeControl(false);
        AudioControl ac = new AudioControl(false);
        AudioControl ac1 = new AudioControl(true);
        QualityOptimizerControl qoc= new QualityOptimizerControl(25);
        QualityOptimizerControl qoc1 = new QualityOptimizerControl(100);
        tc.izvrsiAkciju(vp);
        ac.izvrsiAkciju(vp);
        qoc.izvrsiAkciju(vp);
        tc1.izvrsiAkciju(vp);
        tc1.izvrsiAkciju(vp);
        ac1.izvrsiAkciju(vp);
        ac1.izvrsiAkciju(vp);
        ac1.izvrsiAkciju(vp);
        qoc1.izvrsiAkciju(vp);
        vp.stampaj();
    }
}
