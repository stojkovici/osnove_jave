package p19_12_2022;

public class zadatak2 {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <=50 ; i++) {
            if (i%2==0){
                suma=suma+i;
            }else {
                suma = suma;
            }
            System.out.println(suma);

        }
    }
}
