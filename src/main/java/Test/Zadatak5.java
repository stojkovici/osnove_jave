package Test;

public class Zadatak5 {
    public static void main(String[] args) {
        Medota html = new Medota();
        String upakovano = html.upakovano("Daj boze da prodjem","bold");
        String upakovano1 = html.upakovano("Daj boze da prodjem.volume2","italic");
        String upakovano2 = html.upakovano("Daj boze da prodjem.volume3","paragraph");
        String neupakovano = html.upakovano("Daj boze da prodjem.volume4", "div");
        System.out.println(upakovano+", a "+upakovano1);
        System.out.println(upakovano2);
        System.out.println(neupakovano);
    }
}
