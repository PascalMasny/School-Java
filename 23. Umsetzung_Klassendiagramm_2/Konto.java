public class Konto {
    private double kontostand;
    private String kontoNr;

    public Konto (String kontoNr){
        this.kontoNr = kontoNr;
    }

    public double getKontostand (){
        return kontostand;
    }

    public String getKontoNr (){
        return kontoNr;
    }

    public void buchen (double betrag){
        
    }
    

}
