public class chiffrierung_transposition {
    public static void main(String []args) {
       
        String[] message = {"H", "e", "l", "l", "o", " ", "W", "o", "r"};
        String[][] table = new String[3][3];

    
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(table[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i <= 9; i++){
            System.out.println(message[i]);
        }


    }
 }