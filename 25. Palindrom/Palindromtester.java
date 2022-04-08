import javax.swing.JOptionPane;

public class Palindromtester {
    
    
	public static void main(String[] args) {
		
		MeinStack mystack = new MeinStack();
        String input = "ABBA"; //JOptionPane.showInputDialog(null, "Bitte ein String eingeben");

		for (int i = 0; i < input.length(); i++) {
			mystack.push(input.charAt(i));
		}
		

	}



}
