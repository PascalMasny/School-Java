import javax.swing.JOptionPane;

public class runden {
    public static void main (String[] args){
        float in = JOptionPane.showInputDialog("Nummer zum runden:", "420.0");
        quadrat(in);
        System.out.println("Ergebniss: " + out);
    }

    //quadrieren
    satic quadrat(int in){
        out = math.round(in);
        return out;
    }
}
