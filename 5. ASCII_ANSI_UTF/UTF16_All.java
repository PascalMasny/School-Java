//Print all UTF 16 char
public class UTF16_All {
    
    public static void main(String[] args) {
        
        //ASCII 0 - 255
        
        long l;
        char c;
 
        for(l=0;l<=255;l++) {
 
           c =(char)l; // int to char
         
           System.out.println(l+"  =  "+c); //Print
        }
 
 
     }


}
