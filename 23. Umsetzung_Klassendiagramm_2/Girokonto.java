public class Girokonto extends Konto{
    private double gebueren = 0.1;
    
    public Girokonto (String kontoNr){
        super(kontoNr);
    }

    public double getGebuer (){
        return gebueren;
    }
}
