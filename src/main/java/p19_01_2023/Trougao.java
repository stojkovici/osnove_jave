package p19_01_2023;

public class Trougao extends Figura {
    private int a;

    public Trougao(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public double povrsina() {
        double povrsina = (a*a)*1.73;
        return povrsina;
    }

    @Override
    public double obim() {
        return 3*a;
    }
}
