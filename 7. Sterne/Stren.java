//Print mit Sternen
public class Stren {
    
    public static void main(String[] args) {
 
        //1
        //System.out.println("*");

        //2
        for(int i =0; i<=10;i++){
            System.out.print("* ");
        }

        //3
        for(int i = 0; i<=10; i++){
            System.out.println("*");
        }

        //4
        for(int i = 0; i<=10; i++){
           System.out.println("");

           for(int n = 0; n<=10; n++){
            System.out.print("*");
           }
        }

        //5
        for(int i = 1; i<=10; i++){
            System.out.println("");

            if(i== 1|i== 10){ //und &; or |; ^ xor
                for(int n = 0; n<=10; n++){
                    System.out.print("*");
                   }
            }
            else{
                System.out.print("*         *");
            }
        }

        //6
        int height = 3; 

        for(int i = 0; i<= height; i++){
            for(int j = 1; j <= height; j++){
                if(i >= j){
                    System.out.print("* ");
                }
                
            }
            System.out.println("");
        }

        
        //7 BUG!!!
        height = 3; 

        for(int i = 0; i<= height; i++){
            for(int j = 1; j <= height; j++){
                if(i >= j){
                    System.out.print("* ");
                }
                
            }
            System.out.println("");
        }
        height = 3; 

        for(int i = 0; i<= height; i++){
            for(int j = 1; j <= height; j++){
                if(i <= j){
                    System.out.print("* ");
                }
                
            }
            System.out.println("");
        }
      
       //8

       
       for(int i = 0; i <= 5; i++) {
    	   
    	   System.out.println("");
    	   
    	   for(int n = 0; n <= 5; n++) {
    		   if (i == 1 && i == 3) {
    			   System.out.print("*");
    		   }
    		   else if(i == 2 && n == 2) {
    			   System.out.print("*");
    		   }
    		   else {
    			   System.out.print("");
    		   }
    	   }
       }

        



	}


}
