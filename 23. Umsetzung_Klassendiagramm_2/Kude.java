public class Kude {
    private int kundenNr;
    private String nachname;
    private String vorname;

    public int getKundenNr (){
        return kundenNr;
    }

    public String getKundenName (){
        return nachname + "" + vorname;
    }

    public void setName (String in_nachname, String in_vorname){
        vorname = in_nachname;
        nachname = in_nachname;
    }

    public void setKundenNr (int in_kundenNr){
        kundenNr = in_kundenNr;
    }

}
