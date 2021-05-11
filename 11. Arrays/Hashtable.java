//Imports
import java.io.*;
import java.util.*;

public class Hashtable {
    
    public static void main(String[] args)
    {
  
        //init Hashtable
        Hashtable<Integer, String> hash_table = new Hashtable<Integer, String>();
  
        //Daten Hinzuifügen
        hash_table.put(10, "eins");
        hash_table.put(15, "zwei");
        hash_table.put(20, "drei");
        hash_table.put(25, "vier");
        hash_table.put(30, "fünf");
  
        // Print Table
        System.out.println("Table: " + hash_table);
  
        // Remove
        String returned_value = (String)hash_table.remove(20);
  
        // Verivizieren
        System.out.println("Return: " + returned_value);
  
        // Print new Table
        System.out.println("Neues Table: " + hash_table);
    }
}

