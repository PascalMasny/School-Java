public class Array_2D {
    
	public static void main(String[] args) {
		
        //init Array
		int matrix[][] = new int[2][2]; // 2x2 Matrix
        //oder:
        //int[][] matrix = { {1,2}, {4,5}};


        //manuell Befüllen
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 4;

        //manuelle Ausgabe
        System.out.println(matrix[0][0]);
        System.out.println(matrix[0][1]);
        System.out.println(matrix[1][0]);
        System.out.println(matrix[1][1]);

        //automatische Ausgabe
        for(int i = 0, n = 0; i < matrix.length && n < matrix.length; i++, n++){
            System.out.println(matrix[i][n]);
        }
	}
}
