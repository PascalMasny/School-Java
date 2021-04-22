//Rechtech Umfang Rechner
//imports
import javax.swing.JOptionPane;

//main
public class Rechteck {
    
	public static void main(String[] args) {
		
        //deklarieren + Initialisieren
        double l = 0, b = 0, u = 0;
        String lin = "", bin ="";


        //eigabe
       lin = JOptionPane.showInputDialog(null, "Länge in mm: ");
       bin = JOptionPane.showInputDialog(null, "Breite in mm: ");
        
       l = Double.parseDouble(lin);
       b = Double.parseDouble(bin);

        //berechnug
        u = 2 * l + 2 * b;

        //output
        if (l > 0){ //Verschachtelet Verzweigung
                if (b > 0){
                        System.out.println("Der Umfang für l = "+ l + " und b = " + b + " ist " + u +  " mm");
                }
                else{
                        System.out.println("Syntax Error: b >= 0");
                }
        }
        else{
                System.out.println("Syntax Error: l >= 0");
        }


	}

}
