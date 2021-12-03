import java.util.*;

public class Aufgabe2 {
    public static void main(String[] args) {

    	//Zeige die Häufigkeit der Buchstaben in einem Strings 
    	
    	String str_alphabet = "abcdefghijklmnopqrstuvwxyzäüö1234567890";
    	String str_text = "hfdoisdsofdsiofhdoidshiofdhfoids";
    	String str_text_low = str_text.toLowerCase();
    	  
    	// alpabet to array
        // Creating array of string length
        char[] ch = new char[str_alphabet.length()];
        // Copy character by character into array
        for (int i = 0; i < str_alphabet.length(); i++) {
            ch[i] = str_alphabet.charAt(i);
        }
        // Printing content of array
        /*
        for (char c : ch) {
            System.out.println(c);
        }
        */
    	
    	// text to array
        // Creating array of string length
        char[] ch2 = new char[str_text_low.length()];
        // Copy character by character into array
        for (int i = 0; i < str_text_low.length(); i++) {
            ch2[i] = str_text_low.charAt(i);
        }
        // Printing content of array
        /*
        for (char c : ch2) {
            System.out.println(c);
        }
        */
    	
        //check array and count
        for (char c : ch) {
        	int count = 0;
        	for (char c2 : ch2) {
        			if (c == c2) {
        				count++;
        			}
        	}
        	System.out.println("Anzahl vom Buchstaben " + c + "=" + count);
        }
}
}


