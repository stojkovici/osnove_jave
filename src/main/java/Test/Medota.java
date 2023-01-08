package Test;

public class Medota {
    public String upakovano(String tekst, String tip){
        if(tip.equals("bold")) {
            String vrati = "<b>" + tekst + "</b>";
            return vrati;
        }else if(tip.equals("italic")){
            String vrati = "<em>"+tekst+"</em>";
            return vrati;
        }
        else if (tip.equals("paragraph")){
            String vrati = "<p>"+tekst+"</p>";
            return vrati;
        }
        return tekst;
    }

}
