import javax.swing.JOptionPane;

import org.graalvm.compiler.replacements.InstanceOfSnippetsTemplates.NonMaterializationUsageReplacer;

public class eva {

    public static void main (String[] args){
        eingabe();
        verarbeitung();
        ausgabe();
    }

    //Eingabe
    static eingabe(){
        String e = JOptionPane.showInputDialog("Dein Name:", none);
        return e;
    }

    //verarbeitung
    static verarbeitung(String e){
        String v = "Hallo" + e;
        return v;
    }

    //ausgabe 
    static ausgabe(String v){
        System.out.println(v);
    }
}
