import javax.swing.JOptionPane;

public class qadrat {
    public static void main (String[] args){
        int in = JOptionPane.showInputDialog("Nummer zum quadrieren:", "42");
        System.out.println("Ergebniss: " + out);
    }

    //quadrieren
    satic quadrat(int in){
        out = in * in;
        return out;
    }
}
