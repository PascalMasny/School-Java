public class Lehrer extends Person {

    private String[][] schueler;

    //Constructor
    public Lehrer(String _vorname, String _nachname, double _groeße, String[][] _schueler) {
        super(_vorname, _nachname, _groeße);
        this.schueler = schueler;
    }

    public void setNote(double note, int schuelerID){

    }

    public double getKlassenschnitt(){
        return 0;
    }

    

}
