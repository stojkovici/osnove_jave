package p26_12_2022;

public class zadatak8 {
    public static void main(String[] args) {
        boolean a= trougao(3,4,5);
        if(a){
            System.out.println("Jeste pravougli");
        }
        else {
            System.out.println("Nije pravougli");
        }


    }
    public static boolean trougao (int a, int b, int c){
        if(a * a + b * b == c * c){
             return true;
        }
        else {
            return false;
        }

    }
}
