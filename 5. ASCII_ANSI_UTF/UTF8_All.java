//Print all UTF 8 char
public class UTF8_All {
    
    public static void main(String[] args) {
        
        //ASCII 0 - 126
        
        long l;
        char c;
 
        for(l=0;l<=127;l++) {
 
           c =(char)l; // int to char
         
           System.out.println(l+"  =  "+c); //Print
        }
 
 
     }

}
