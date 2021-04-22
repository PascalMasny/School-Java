import java.util.Scanner;

public class Fahrenheit_in_Celsius {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = "";
        Double inputValue = 0.0, outputValue = 0.0;

        System.out.println("Fahrenheit to Celsius Rechner");
        System.out.println("Gib die Temperatur in Fahrenheit ein:");

        input = scanner.nextLine();
        inputValue = Double.parseDouble(input);
        outputValue = (inputValue - 32) * 5/9;

        System.out.printf("Das Entspricht %.2f Grad Celsius", outputValue);

        scanner.close();
    }
}
