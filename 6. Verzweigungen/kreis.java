//Kereisflächen Rechner
//import
import javax.swing.JOptionPane;

//Kreisfläche berechnen
public class kreis {
 
    
	public static void main(String[] args) {
		
        //deklarieren + Initialisieren
        double rad = 0.00;
        double pi = 3.14;
        double a = 0.00;
        String inrad = "";

        //eigabe
        inrad = JOptionPane.showInputDialog(null, "Radius in mm: ");
        rad = Double.parseDouble(inrad); 

        //berechnug

        a = pi * rad * rad;

        //output
        if (rad > 0){
                System.out.println("Die Fläche für den Radius " + rad + " ist " + a + " mm²"); //Rechnung
        }
        
        else{
                System.out.println("Syntax Error: Rad >= 0"); //Error
        }


	}

}
