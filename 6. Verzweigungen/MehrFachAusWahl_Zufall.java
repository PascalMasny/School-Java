//Zuffals Zahl von 1 - 10 mit einem Switch
public class MehrFachAusWahl_Zufall {
    
	public static void main(String[] args) {
        
        //Deklarieren und Initialisieren
        double i = Math.random(); //random

        i = i * 10; // double zur ganzen zahl
        
        int n = (int)i; //double zu int
        
        System.out.println(n); //output randaom int number

        //Switch
        switch (n) {
            case 1:
              System.out.println("Eins");
              break;
            case 2:
              System.out.println("Zwei");
              break;
            case 3:
              System.out.println("Drei");
              break;
            case 4:
              System.out.println("Vier");
              break;
            case 5:
              System.out.println("Fünf");
              break;
            case 6:
              System.out.println("Sechs");
              break;
            case 7:
              System.out.println("Sieben");
              break;
            case 8:
              System.out.println("Acht");
              break;
            case 9:
              System.out.println("Neun");
              break;
            case 10:
              System.out.println("Zehn");
              break;
            default:
                break;
          }
	}


}
