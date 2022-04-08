import javax.swing.JOptionPane;

public class Palindromtester {
    
    
	public static void main(String[] args) {
		
		MeinStack mystack = new MeinStack();
        String input = JOptionPane.showInputDialog(null, "Bitte ein String eingeben"); //BSP: ABBA

		//push in to stack
		for (int i = 0; i < input.length(); i++) {
			mystack.push(input.charAt(i));
		}
		
		//ckeck if Palindrom
		for (int i = 0; i < input.length(); i++) {
			if (mystack.pop() != input.charAt(i)) {
				System.out.println("Das ist kein Palindrom");
				return;
			}
			else{
				System.out.println("Das ist ein Palindrom");
				break;
			}
		}
		

	}



}
