//Import
import java.util.LinkedList;

public class LinkedList {
    
    public static void main(String[] args) {

        LinkedList<String> autos = new LinkedList<String>();

        autos.add("Volvo");
        autos.add("BMW");
        autos.add("Ford");
        autos.add("Mazda");

        System.out.println(autos);

        autos.remove(2);

        System.out.println(autos);
      }

}
