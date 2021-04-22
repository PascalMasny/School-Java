//Rabatt Rechner
//import
import javax.swing.JOptionPane;

//main
public class Rabatt {
   
    public static void main(String[] args) {
		
        //Initialisiern + Deklarieren
        String strst = "";
        double st = 0;
        double rab = 0;

        //abfrage
        strst = JOptionPane.showInputDialog(null, "Stückzahl");
        st = Double.parseDouble(strst);

        //output
        if (st >= 99){
            rab = 0;
        }
        else if (st >= 499){
            rab = 0.5;
        }
        else if (st >= 1999){
            rab = 1.5;
        }
        else if (st >= 4999){
            rab = 2;
        }
        else if (st >= 9999){
            rab = 3;
        }
        else if (st > 10000){
            rab = 5;
        }
        

        //output
        System.out.println("Rabatt: " + rab + " %");
        

        
        




	}

}
