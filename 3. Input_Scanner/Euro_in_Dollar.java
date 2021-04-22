//Euro zu Dollar Rechner
//imports
import javax.swing.JOptionPane;

//kalsse
public class Euro_in_Dollar {
   

    
    //main
	public static void main(String[] args) {
        
        //Deklarieren ud initialiseren
        String strDollar ="";
        double deuro = 0.0, ddollar = 0.0;

        //eigabe
        strDollar = JOptionPane.showInputDialog(null, "Bitte Dollar Eingeben:");

        //Parasen
        ddollar = Double.parseDouble(strDollar); //sting zu double

        //rechnung
        deuro = ddollar * 0.82;

        //output
        System.out.println(deuro);
	}

}
