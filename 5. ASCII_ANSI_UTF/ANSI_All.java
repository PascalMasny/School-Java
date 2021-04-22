//Pirint alle ANSI char
public class ANSI_All {
    
    public static void main(String[] args) {
        
        //ASCII 0 - 255
        
        int i;
        char c;
 
        for(i=0;i<=255;i++) {
 
           c =(char)i; // int to char
         
           System.out.println(i+"  =  "+c); //Print
        }
 
 
     }

}
