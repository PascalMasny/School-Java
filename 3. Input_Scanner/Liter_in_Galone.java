//Liter zu Galone Rechner
import java.util.Scanner;

public class Liter_in_Galone {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String input = "";
        Double inputValue = 0.0, outputValue = 0.0;

        System.out.println("Liter to Gallone Rechner");
        System.out.println("Gib die Menge in Liter ein:");

        input = scanner.nextLine();
        inputValue = Double.parseDouble(input);
        outputValue = inputValue / 3.785;

        System.out.printf("Das entspricht %.2f Gallonen :)", outputValue);

        scanner.close();

    }
}
