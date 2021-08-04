import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;
import java.lang.Math;   
import java.util.ArrayList;


public class Zusammenfassung {
    public static void main(String agr[]){
        
        //Datentypen:
            //Ganze zahlen:
            byte a;
            short b;
            int c;
            long d;

            //Komma Zahlen:
            float e;
            double f;

            //Wahrheitswerte:
            boolean ture;

            //Einzele Zeichen:
            char g = 'a';

            //Zecihenfolge
            String h = "Hello Wolrd";

           
        //Input/Output

            //Output
            System.out.println("Hello World");
        
            //Input
            Scanner i = new Scanner(System.in);

            //casten
            double n = 1.1;
            int j = (int)n;

            //Random Nummer
            Math.random();

        //Schleifen

            //for
            for (int x = 0; x < 10;x++){
                System.out.println("Hello");
            }

            //while
            int y = 0;
            while (y < 10){
                System.out.println("Wolrd");
                y++;
            }

            //do while
            int z = 0;
            do{
                System.out.println("!");
                z++;
            } while(z < 10);


        //Verzweigungen
        n = 0;

            //Einseitig
            if (n == 0){
                System.out.println("asdf");
            }

            //Zweiseiting
            if (n == 0){
                System.out.println("foo");
            }
            else{
                System.out.println("bar");
            }

            //Mehrseitig
            if (n == 0){
                System.out.println("a");
            }
            else if (n == 1){
                System.out.println("b");
            }
            //default:
            else {
                System.out.println("default");
            }

            //Switch
            
            int l = 0;
            switch (l){

                case 1: l = 0;
                    break;
                
                case 2: l = 1;
                    break;

                //default:
                default:
                    break;
            }


         //Arrays

            //1D Array
            int o[] = new int[5]; //1D Array with 5 cells
            o[0] = 1; //Array cell one == 1;

            //2D Array
            int p[][] = new int[2][2]; //2D Array with 2x2   ==> 0 0 
            p[0][0] = 1; //Array cell 0,0 == 1;                  1 1

            //ArrayList
            ArrayList<Integer> q = new ArrayList<Integer>(5); //ArrayList with 5 cells
            q.add(12); //Add Data to Array List
            q.remove(12); //Remove from Array List

            //Hashtable
            Hashtable<Integer, String> r = new Hashtable<Integer, String>(); //hashtable with an int uns String 
            r.put(1, "eins"); //Add Data
            r.remove(1);

            //LinkedList
            LinkedList<String> t = new LinkedList<String>();
            t.add("Hello World!");
            t.remove(0);


        //Unterprogramme

            //Prozeduren sind Methoden ohne Rückgabe

            //Prozedur ohne Parameter
            myProzedur1();

            //Prozedur mit Parameter
            myProzedur2("Grüße aus der Funktion");

            //Funktionen sind Methoden ohne Rückgabe
            int v = 5;
            System.out.println(myFunktion1(v));
        
     } 
     
     

         // Unterporgamme

            //Prozedur ohne Parameter Übergabe
            static void myProzedur1(){
                System.out.println("Ausführen der Methode");
            }

            //Prozedur mit Parameter Übergabe
            static void myProzedur2(String name){
                System.out.println(name);
            }s

            //Funktion
            static int myFunktion1(int v){
                int w = v * v;
                return w;
            }
}
