package Projekat_Xo;

import java.util.ArrayList;

public class Xo_Tabla {
    private String polje1;
    private String polje2;
    private String polje3;
    private String polje4;
    private String polje5;
    private String polje6;
    private String polje7;
    private String polje8;
    private String polje9;
    private String imeXIgraca;
    private String imeOIgraca;
    private String naPotezu;
    private String igraSledeci;
    ArrayList<String> tabela = new ArrayList<>();



    public void pokreniIgru(){
        tabela.add(this.polje1);
        tabela.add(this.polje2);
        tabela.add(this.polje3);
        tabela.add(this.polje4);
        tabela.add(this.polje5);
        tabela.add(this.polje6);
        tabela.add(this.polje7);
        tabela.add(this.polje8);
        tabela.add(this.polje9);

        tabela.set(0, " ");
        tabela.set(1, " ");
        tabela.set(2, " ");
        tabela.set(3, " ");
        tabela.set(4, " ");
        tabela.set(5, " ");
        tabela.set(6, " ");
        tabela.set(7, " ");
        tabela.set(8," ");
        naPotezu = "X";



    }
    public String getImeXIgraca(){
        return this.imeXIgraca;
    }
    public String getImeOIgraca(){
        return this.imeOIgraca;
    }
    public void setImeXIgraca(String imeX){
        this.imeXIgraca = imeX;
    }
    public void setImeOIgraca(String imeO){
        this.imeOIgraca = imeO;
    }
    public String getNaPotezu(){
        return this.naPotezu;
    }
    public String getIgraSledeci(){
        return this.igraSledeci;
    }

    public void stampaj() {
        if (!(this.pobednikXX() == true || this.pobednikOO() == true)) {
            System.out.println(" " + this.tabela.get(0) + " | " + this.tabela.get(1) + " | " + this.tabela.get(2));
            System.out.println(" " + this.tabela.get(3) + " | " + this.tabela.get(4) + " | " + this.tabela.get(5));
            System.out.println(" " + this.tabela.get(6) + " | " + this.tabela.get(7) + " | " + this.tabela.get(8));
        }
    }
    public boolean poljePrazno(int index){
        if (tabela.get(index-1).equals(" ")) {
            return true;
        }else {
            return false;
        }

    }


    public String zameniIgraca(){
        if (this.naPotezu.equals("X")){
            this.naPotezu = "O";
            return this.naPotezu;
        }
            else if(this.naPotezu.equals("O")){
            this.naPotezu = "X";
        }
        return this.naPotezu;
    }

    public String odigrajPotez(int index){
        if (this.naPotezu.equals("X")){
            if (this.poljePrazno(index)==false){
                System.out.println("Potez nije validan!");
               return tabela.get(index-1);
            }
           tabela.set(index-1,"X");
           return tabela.get(index-1);
        }
        else if (this.naPotezu.equals("O")){
            if (this.poljePrazno(index)==false){
                System.out.println("Potez nije validan!");
                return tabela.get(index-1);
            }
            tabela.set(index-1, "O");
            return tabela.get(index-1);
        }
        return tabela.get(index-1);
    }
    public boolean popunjenaTabela() {
        for (int i = 0; i < tabela.size(); i++) {
            if (tabela.get(0).equals(" ")||tabela.get(1).equals(" ")||tabela.get(2).equals(" ")||tabela.get(3).equals(" ")||tabela.get(4).equals(" ")||tabela.get(5).equals(" ")||tabela.get(6).equals(" ")||tabela.get(7).equals(" ")||tabela.get(8).equals(" ")){
                return false;
            }
            else {
                return true;
            }
        }
        return false;
    }

    public boolean pobednikXX() {
        for (int i = 0; i <= tabela.size(); i++) {
            tabela.get(i);
            if (tabela.get(0).equals("X") && tabela.get(1).equals("X") && tabela.get(2).equals("X")) {
                return true;
            } else if (tabela.get(3).equals("X") && tabela.get(4).equals("X") && tabela.get(5).equals("X")) {
                return true;
            } else if (tabela.get(6).equals("X") && tabela.get(7).equals("X") && tabela.get(8).equals("X")) {
                return true;
            } else if (tabela.get(0).equals("X") && tabela.get(3).equals("X") && tabela.get(6).equals("X")) {
                return true;
            } else if (tabela.get(1).equals("X") && tabela.get(4).equals("X") && tabela.get(7).equals("X")) {
                return true;
            } else if (tabela.get(2).equals("X") && tabela.get(5).equals("X") && tabela.get(8).equals("X")) {
                return true;
            } else if (tabela.get(0).equals("X") && tabela.get(4).equals("X") && tabela.get(8).equals("X")) {
                return true;
            } else if (tabela.get(2).equals("X") && tabela.get(4).equals("X") && tabela.get(6).equals("X")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void zaPobednikaX(){
        if (pobednikXX()==true){
            System.out.println("Cestitamo! Pobednik je igrac X!");
            System.out.println("Bravo "+this.getImeXIgraca()+"!");
        }
    }
    public void zaPobednikaO(){
        if (pobednikOO()==true){
            System.out.println("Cestitamo! Pobednik je igrac O!");
            System.out.println("Bravo "+this.getImeOIgraca()+"!");
        }
    }
    public boolean pobednikOO() {
        for (int i = 0; i <= tabela.size(); i++) {
            tabela.get(i);
            if (tabela.get(0).equals("O") && tabela.get(1).equals("O") && tabela.get(2).equals("O")) {
                return true;
            } else if (tabela.get(3).equals("O") && tabela.get(4).equals("O") && tabela.get(5).equals("O")) {
                return true;
            } else if (tabela.get(6).equals("O") && tabela.get(7).equals("O") && tabela.get(8).equals("O")) {
                return true;
            } else if (tabela.get(0).equals("O") && tabela.get(3).equals("O") && tabela.get(6).equals("O")) {
                return true;
            } else if (tabela.get(1).equals("O") && tabela.get(4).equals("O") && tabela.get(7).equals("O")) {
                return true;
            } else if (tabela.get(2).equals("O") && tabela.get(5).equals("O") && tabela.get(8).equals("O")) {
                return true;
            } else if (tabela.get(0).equals("O") && tabela.get(4).equals("O") && tabela.get(8).equals("O")) {
                return true;
            } else if (tabela.get(2).equals("O") && tabela.get(4).equals("O") && tabela.get(6).equals("O")) {
                return true;
            }
            return false;
        }
        return false;
    }
    public void nereseno(){
        if(this.popunjenaTabela()==true){
            System.out.println("Igra je neresena.");
        }
    }
}
