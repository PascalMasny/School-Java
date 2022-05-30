import java.lang.reflect.Array;

import javax.swing.JOptionPane;

public class StringsUndArrays {

    public static void main(String[] args) {

        // Eingabe
        String VorE = JOptionPane.showInputDialog("Geben sie ihren Vornamen ein");
        String NachE = JOptionPane.showInputDialog("Geben sie ihren Nachnamen ein");

        // Vorname + Nachname in einem String
        String VorUndNach = VorE + " " + NachE;

        // Länge des Vornamens
        int LengthVor = VorE.length();

        // Ersten 3 des Vornamens + ersten 3 des Nachnamens
        String Vor3Nach3 = VorE.substring(0, 3) + NachE.substring(NachE.length() - 3, NachE.length());

        // prints
        System.out.println(VorUndNach);
        System.out.println(LengthVor);
        System.out.println(Vor3Nach3);

        // Großbuchstaben + Leerzeichen
        String Groß = NachE;
        String Leer = Groß.toUpperCase();
        for (int i = 0; i < Leer.length(); i++) {
            System.out.print(Leer.substring(i, i + 1) + " ");
        }

    }

    public static int Anzahl(String Zählen, char Buchstabe) {

        // Kleinbuchstaben
        Zählen = Zählen.toLowerCase();
        Buchstabe = Character.toLowerCase(Buchstabe);

        int count = 0;

        for (int i = 0; i < Zählen.length(); i++) {
            char AktuellerB = Zählen.charAt(i);
            if (AktuellerB == Buchstabe)
                count++;
        }

        return count;
    }
}