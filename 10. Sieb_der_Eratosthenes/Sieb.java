//Import Array List
import java.util.ArrayList;

public class Sieb {

    public static void main(String[] args){
    
    //init ArrayList
    ArrayList<Integer> primzahlen = listeDerPrimzahlen(50);
    
    //Primzahlen
    for (int p : primzahlen) {
    
    System.out.print(p+" ");
    
    }
    
    }
    
    // liefert die Liste aller Primzahlen < n
    
    public static ArrayList<Integer> listeDerPrimzahlen(int n){
    
    // Array => new Array
    
    ArrayList<Integer> primzahlen = new ArrayList<Integer>();
    
    //init new boolean
    
    boolean[] isprime = new boolean[n];
    
    // Array init
    
    for (int i=2; i<n; i++)
    
    isprime[i] = true;
    
    // Array durchlaufen
    
    for (int i=2; i<n; i++)
    
    
    if (isprime[i]){
    
    primzahlen.add(i);
    
    // Vielfache von i streichen
    
    for (int j = i*i; j<n; j = j+i)
    
    isprime[j] = false;
    
    }
    
    return primzahlen;
    
    }
    
    }