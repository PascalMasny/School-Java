//Print all UTF 32 char
public class UFT32_All {
    
    public static void main(String[] args) {
        
        //ASCII 0 - 511
        
        long l;
        char c;
 
        for(l=0;l<=511;l++) {
 
           c =(char)l; // int to char
         
           System.out.println(l+"  =  "+c); //Print
        }
 
 
     }


}
