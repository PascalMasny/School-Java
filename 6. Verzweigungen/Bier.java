//ein Rechner für die optimal Biert Temperatur
import javax.swing.JOptionPane;

public class Bier {
   
    public static void main(String[] args) {
		
        double bier = 0;
        String strbier = "";
        String strzeit ="";
        boolean zeit = true;

        strbier = JOptionPane.showInputDialog(null, "Biertemperatur: ");
        bier = Double.parseDouble(strbier);

        if (bier < 2){
            System.out.println("Auftauen");
        }
        else if (bier >= 2 && bier <= 7){
            System.out.println("Prost!!!");
        }
        else if (bier > 7){

            strzeit = JOptionPane.showInputDialog(null, "hast du zeit? (true/false)");
            zeit = Boolean.parseBoolean(strzeit);

            if (zeit == true){
                System.out.println("Kühlschrank");
            }
            else if (zeit == false){
                System.out.println("Eis");
            }
            else{
                System.out.println("Syntax Error!");
            }

        }
        else{
            System.out.println("Syntax Error!");
        }

	}  

}
