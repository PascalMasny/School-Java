public class Person {

    private String vorname;
    private String nachname;
    private double groeße;

    public Person(String _vorname, String _nachname, double _groeße) {
        vorname = _vorname;
        nachname =_nachname;
        groeße = _groeße;
    }

    public void schreiben(String satz){
        System.out.println(satz);
    }

    public String sage_Name(){
        return vorname + " " + nachname;
    }


}