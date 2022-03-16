public class Schueler extends Person {

    private String klassenlehrer;
    private int note;

    //Constructor
    public Schueler (String _vorname, String _nachname, double _groeße) {
        super(_vorname, _nachname, _groeße);
    }

    public void setNote(double note){
        this.note = (int) note;
    }

    public double getNote(){
        return note;
    }



}
