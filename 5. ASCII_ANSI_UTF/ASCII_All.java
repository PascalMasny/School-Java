//Print alle ASCII char
public class ASCII_All {
    
    public static void main(String[] args) {
        
        //ASCII 32 - 127
        
        int i;
        char c;
 
        for(i=32;i<=127;i++) {
 
           c =(char)i; // int to char
         
           System.out.println(i+"  =  "+c); //Print
        }
 
 
     }

}
