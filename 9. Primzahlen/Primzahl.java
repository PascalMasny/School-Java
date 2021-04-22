//Primzahl Optimiert
//Imports
import java.util.Scanner;

public class Primzahl {
	private static Scanner sc;
	public static void main(String[] args) 
	{

		int i;
        int number;
        int count = 0; 
		sc = new Scanner(System.in);
		
		System.out.print(" Nummer zum Checken:");
		number = sc.nextInt();		
		
        
		for (i = 2; i <= Math.sqrt(number); i = i + 2){
			if(number % i == 0){
				count++;
		        break;}	
		}
		if(count == 0 && number != 1 ){
			System.out.println( number + " is eine Primzahl");
		}
		else{
		   System.out.println(number + " ist keine Primzahl");
		}

	}
}

