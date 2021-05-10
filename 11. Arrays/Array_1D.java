public class Array_1D {
    
	public static void main(String[] args) {
		
		//init Arrays
		int prim[] = new int[5]; //intiger
		boolean b[] = {true, false}; //boolean

		//manueles befüllen
		prim[0] = 2;
		prim[1] = 3;
		prim[2] = 5;
		prim[3] = 7;
		prim[4] = 11;

		//anzahl anzeigen
		System.out.println("prim.length: " + prim.length);

		//manuelle Ausgabe
		System.out.println(prim[0]);
		System.out.println(prim[1]);
		System.out.println(prim[2]);
		System.out.println(prim[3]);
		System.out.println(prim[4]);

		System.out.println(b[0]);
		System.out.println(b[1]);

		//automatische Ausgabe
		for (int i = 0; i < prim.length; i++){
			System.out.println(prim[i]);			
		}


	}
}
