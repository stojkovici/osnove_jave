package p27_12_2022;

public class zadatak2 {
    public static void main(String[] args) {
        SlackMessage prvaPoruka = new SlackMessage();
        prvaPoruka.tekstPoruke = "Dobro vece";
        prvaPoruka.imeIPrezime = "Ivan Stojkovic";
        prvaPoruka.datumIVreme = "26.12.2022 20:13";
        prvaPoruka.stampaj();

        SlackMessage drugaPoruka = new SlackMessage();
        drugaPoruka.tekstPoruke = "Kako ste";
        drugaPoruka.imeIPrezime = "Milan Milanovic";
        drugaPoruka.datumIVreme = "26.12.2022 20:14";
        drugaPoruka.stampaj();
    }
}
