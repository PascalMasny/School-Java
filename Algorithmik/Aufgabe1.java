import javax.swing.JOptionPane;

public class Aufgabe1 {
    public static void main(String[] args) {
    	
    	String vorname = JOptionPane.showInputDialog("Vorname: ");
    	String nachname = JOptionPane.showInputDialog("Nachneme: ");
    	
    	// Print Name
    	System.out.println(vorname + "," + nachname);
    	//Print Vorname Länge
    	System.out.println(vorname.length());
    	
    	//Print Erste 3 Buchstaben vom Vornamen
    	System.out.println(vorname.substring(0, 3));
    	//Print die letzten 3 Buchstaben vom Nachnamen 
    	System.out.println(nachname.substring(nachname.length() - 3));
    	
    	//Print Nachname mit Spaces und UpperCase
    	int nr_space = nachname.length();
    	String nachname_up = nachname.toUpperCase();

    	for (int i = 0; i < nr_space; i++) {
    	    System.out.print(nachname_up.substring(i, i+1) + " ");
    	}
    	
    	
    	
    }
}
