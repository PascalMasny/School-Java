import java.util.Scanner;
import java.lang.Math;   


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


    }       
}
