public class Unterprogramme
{

    //Prozedur ohne Parameter Übergabe
    static void myProzedur1(){
        System.out.println("Ausführen der Methode");
    }

    //Prozedur mit Parameter Übergabe
    static void myProzedur2(String name){
        System.out.println(name);
    }

    



    public static void main (String[] args){
        
        //Prozeduren sind Methoden ohne Rückgabe

        //Prozedur ohne Parameter
        myProzedur1();

        //Prozedur mit Parameter
        myProzedur2("Grüße aus der Funktion");

        
        //Funktionen sind Methoden ohne Rückgabe
        int i = 5;

        
        System.out.println(myFunktion1(i));
    }

    //Funktionen
    static int myFunktion1(int i){
        int n = i * i;
        return n;
    }
    
}