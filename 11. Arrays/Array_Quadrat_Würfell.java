public class Array_Quadrat_Würfell {
    public static void main(String[] args) {
		

        //init Array + füllen
        int[][] matrix = new int[5][5];
        int zeile, spalte;

        for (zeile = 0; zeile < 5; zeile++){

            for (spalte = 0; spalte < 5; spalte++){

                int i_zufall = (int)(Math.random()*10); //converte zu intiger => x10 ==> genze int zahl

                matrix[zeile][spalte] = i_zufall;
                System.out.println(matrix[zeile][spalte]);
            }
        }

        System.out.println("\n");

        //ausgabe
        for (zeile = 0; zeile < 5; zeile++){

            for (spalte = 0; spalte < 5; spalte++){
                
                System.out.println(matrix[zeile][spalte]);
            }
            System.out.println();
        }

        System.out.println("Stichprobe Array [3][4]" + matrix[3][4]);
        




	}
}
