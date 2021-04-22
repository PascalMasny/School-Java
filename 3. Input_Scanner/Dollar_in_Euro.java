//Dollar zu Euro Rechner
import java.util.Scanner;

public class Dollar_in_Euro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = "";
        Double inputValue = 0.0, outputValue = 0.0;

        System.out.println("Dollar to Euro Rechner");
        System.out.println("Gib die Menge an Dollar ein:");

        input = scanner.nextLine();
        inputValue = Double.parseDouble(input);
        outputValue = inputValue * 0.82;

        System.out.printf("Das entspricht %.2f Euro :)", outputValue);

        scanner.close();
    }
}
