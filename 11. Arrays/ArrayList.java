//Imports
import java.util.ArrayList;

public class ArrayList {
   public static void main(String[] args) {
      
      //init ArrayList
      ArrayList<Integer> arrlist = new ArrayList<Integer>(5);

      // daten hinzufügen
      arrlist.add(20);
      arrlist.add(15);
      arrlist.add(30);
      arrlist.add(45);


      System.out.println("Größe der Liste: " + arrlist.size());
      
      //print Array List
      for (Integer number : arrlist) {
         System.out.println("Nummer = " + number);
      }  
      
      // delete
      arrlist.remove(2);

      System.out.println("Größe der Liste: " + arrlist.size());
      
      // let us print all the elements available in list
      for (Integer number : arrlist) {
         System.out.println("Nummer = " + number);
      }
   }
}  