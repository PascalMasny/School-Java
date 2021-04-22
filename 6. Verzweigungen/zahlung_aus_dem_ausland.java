//Zahlung aus dem Auslanf Übung
import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.BoldAction;

public class zahlung_aus_dem_ausland {
    
	public static void main(String[] args) {
		
        String land = "DE";
        double zahlgen = Math.random(); 
        boolean zahlgenTF = false;
        String  kunde = "JA";
        String stbetrag = "0";
        int betrag = 0;



        //radnom zahlgen doubl => zahlgen TF boolean
        if (zahlgen > 0.5){
            zahlgenTF = true;
        }
        else{
            zahlgenTF = false;
        }

        stbetrag =  JOptionPane.showInputDialog("Ihr betrag:");
        betrag = (int)stbetrag;

        land = JOptionPane.showInputDialog(null, "DE/AU");

        if (land == "AU"){
            if (zahlgenTF == true){
                System.out.println("Kreditkartenzahlung");
            }
            else{
                System.out.println("Vorkasse");
            }
        }
        if (land == "DE"){
            kunde = JOptionPane.showInputDialog(null, "Sind Sie Kunde (JA/NEIN)")

            if (kunde == "JA"){
                System.out.println("Lastschrift");
            }
            if (kunde == "NEIN"){
                if (betrag > 25){
                    if (zahlgenTF == true){
                        System.out.println("Kreditkatenzahlung");
                    }
                    else{
                        System.out.println("Vorkasse");
                    }
                }
                else{
                    System.out.println("Genehmigt");
                }
            }
            else{
                System.out.println("Systax 3RR0R");
            }
        }
        else{
            System.out.println("Systax 3RR0R");
        }




	}

}
