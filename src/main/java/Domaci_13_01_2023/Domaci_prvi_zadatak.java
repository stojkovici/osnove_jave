package Domaci_13_01_2023;

public class Domaci_prvi_zadatak {
    public static void main(String[] args) {
        Ispit q = new Ispit("Informatika",9,"Milan Milanovic");
        Ispit w = new Ispit("Matematika",8,"Jovan Jovanovic");
        Ispit e = new Ispit("Srpski jezik", 5,"Jovan Jovanovic");
        Ispit r = new Ispit("Engleski jezik",6,"Milica Aleksic");
        Ispit t = new Ispit("Francuski jezik",8,"Milan Milanovic");
        Student student = new Student(1112458,"Ivan Stojkovic","Osnovne");
        student.dodajIspit(q);
        student.dodajIspit(w);
        student.dodajIspit(e);
        student.dodajIspit(r);
        student.dodajIspit(t);
        student.print();
    }
}
